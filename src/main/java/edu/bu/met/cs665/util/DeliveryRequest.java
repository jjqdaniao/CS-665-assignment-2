/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/23/2023
 * File Name: DeliveryRequest.java
 * Description: A DeliveryRequest class implements RegisterCustomer, RegisterDriver, RegisterShoppingInfo, Notify to
 * register customer, Driver, and Shop Info, and eventually notify an available driver to pickup order.
 */

package edu.bu.met.cs665.util;

import edu.bu.met.cs665.intereact.Notify;
import edu.bu.met.cs665.intereact.RegisterCustomer;
import edu.bu.met.cs665.intereact.RegisterDriver;
import edu.bu.met.cs665.intereact.RegisterShoppingInfo;

import java.util.ArrayList;

public class DeliveryRequest implements RegisterCustomer, RegisterDriver, RegisterShoppingInfo, Notify {
    private int requestID;
    private String requestInfo;
    private String address;
    private String customerName;
    private String customerPhoneNum;
    private int customerID;
    private String driverName;
    private String driverPhoneNum;
    private char driverStatus;
    private String itemName;
    private int itemNum;
    private double itemPrice;
    private double sum;
    private String driverType;
    private ArrayList<Driver> driverArrayList = new ArrayList<>(10);

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public ArrayList<Driver> getDriverArrayList() {
        return driverArrayList;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public char getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(char driverStatus) {
        this.driverStatus = driverStatus;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhoneNum() {
        return driverPhoneNum;
    }

    public void setDriverPhoneNum(String driverPhoneNum) {
        this.driverPhoneNum = driverPhoneNum;
    }

    public DeliveryRequest() {
    }

    public DeliveryRequest(int requestID, String requestInfo, String address, String customerName, String customerPhoneNum) {
        this.requestID = requestID;
        this.requestInfo = requestInfo;
        this.address = address;
        this.customerName = customerName;
        this.customerPhoneNum = customerPhoneNum;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo;
    }

    @Override
    public void registerCustomer(Customer customer) {
        this.setCustomerName(customer.getFirstName() + ' ' + customer.getLastName());
        this.setAddress(customer.getAddress());
        this.setCustomerPhoneNum(customer.getPhoneNum());
        this.setCustomerID(customer.getId());
    }

    @Override
    public void registerDriver(Driver driver) {
        this.setDriverName(driver.getDriverName());
        this.setDriverPhoneNum(driver.getPhoneNum());
        this.setDriverStatus(driver.getDriverStatus());
        this.setDriverType(driver.getDriverType());
        this.driverArrayList.add(driver);
    }

    @Override
    public void registerShopping(Shop shop) {
        this.setItemName(shop.getItemName());
        this.setItemNum(shop.getItemNum());
        this.setItemPrice(shop.getItemPrice());
        this.sum += shop.getItemPrice()*shop.getItemNum();
    }

    @Override
    public void notifyDriver() {
        for(int i = 0; i < this.getDriverArrayList().size();i++){
            if (this.getDriverArrayList().get(i).getDriverStatus() != 'N'){
                this.sum += this.getDriverArrayList().get(i).getPrice();
                this.getDriverArrayList().get(i).setDriverStatus('N');
                System.out.println("Driver "+ this.getDriverArrayList().get(i).getDriverName() +
                        " (ID: " + this.getDriverArrayList().get(i).getDriverID() +
                        ") with " + this.getDriverArrayList().get(i).getDriverType() + " will handle customer " +
                        this.customerName + "'s order." + " And driver's phone number is " +
                        this.getDriverArrayList().get(i).getPhoneNum());
                System.out.println("Here is the order detail: ");
                System.out.println("Customer " + this.customerName + " Ordered " +
                        this.itemNum + " " + this.itemName + " for " + this.itemPrice +
                        " each, and the total price (including delivery) is " + this.sum);
                System.out.println("The customer's address is " + this.address + ", and phone number is " +
                        this.customerPhoneNum);
                break;
            }else{
                if (i == this.getDriverArrayList().size() - 1){
                    System.out.println("No available driver!");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "requestID=" + requestID +
                ", requestInfo='" + requestInfo + '\'' +
                ", address='" + address + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhoneNum='" + customerPhoneNum + '\'' +
                ", customerID=" + customerID +
                ", driverName='" + driverName + '\'' +
                ", driverPhoneNum='" + driverPhoneNum + '\'' +
                ", driverStatus=" + driverStatus +
                ", itemName='" + itemName + '\'' +
                ", itemNum=" + itemNum +
                ", sum=" + sum +
                ", driverType='" + driverType + '\'' +
                ", driverArrayList=" + driverArrayList +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
