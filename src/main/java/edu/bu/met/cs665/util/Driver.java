/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/23/2023
 * File Name: Driver.java
 * Description: An abstract driver class contains basic driver info
 */

package edu.bu.met.cs665.util;

public abstract class Driver {
    private int driverID;
    private String driverName;
    private String phoneNum;
    private String driverType;
    private char driverStatus;
    private double price;

    public Driver(int driverID, String driverName, String phoneNum, char driverStatus) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.phoneNum = phoneNum;
        this.driverStatus = driverStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public Driver() {
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public char getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(char driverStatus) {
        this.driverStatus = driverStatus;
    }

}
