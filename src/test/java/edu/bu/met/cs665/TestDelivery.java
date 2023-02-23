/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/23/2023
 * File Name: TestDelivery.java
 * Description: A Junit test file to test all the functions.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.util.Customer;
import edu.bu.met.cs665.util.DeliveryRequest;
import edu.bu.met.cs665.util.Driver;
import edu.bu.met.cs665.util.Shop;
import edu.bu.met.cs665.util.car.Scooter;
import edu.bu.met.cs665.util.car.Taxi;
import edu.bu.met.cs665.util.car.Van;
import org.junit.Test;

public class TestDelivery {

    public TestDelivery() {
    }

    @Test
    public void test0() {
        Customer customer = new Customer("Liang", "Ge", "726 Waterhill St", "2321", 0);
        Driver driver = new Taxi(0,"Kim","1211",'N');
        Driver driver1 = new Scooter(0,"Mei Nv","1233",'N');
        Driver driver2 = new Van(0,"Shuai Ge","1344",'Y');
        Shop shop = new Shop("Bat", 1,9.9);
        DeliveryRequest deliveryRequest = new DeliveryRequest();
        deliveryRequest.registerDriver(driver);
        deliveryRequest.registerCustomer(customer);
        deliveryRequest.registerDriver(driver1);
        deliveryRequest.registerDriver(driver2);
        deliveryRequest.registerShopping(shop);
        deliveryRequest.notifyDriver();
    }


    @Test
    public void test1() {
        Customer customer = new Customer("John", "Doe", "CAS", "99966", 0);
        Driver driver1 = new Taxi(0,"aa","120",'N');
        Driver driver = new Van();
        Shop shop = new Shop();
        shop.setItemName("Ping Pong");
        shop.setItemPrice(5);
        shop.setItemNum(3);
        driver.setDriverStatus('Y');
        driver.setDriverID(1);
        driver.setDriverName("Big Bob");
        driver.setPhoneNum("119");
        DeliveryRequest deliveryRequest = new DeliveryRequest();
        deliveryRequest.registerDriver(driver1);
        deliveryRequest.registerCustomer(customer);
        deliveryRequest.registerDriver(driver);
        deliveryRequest.registerShopping(shop);
        System.out.println(deliveryRequest.toString());
        deliveryRequest.notifyDriver();
    }

    @Test
    public void testGetDriverName() {
        Customer customer = new Customer("Liang", "Ge", "726 Waterhill St", "2321", 0);
        Driver driver = new Taxi(0,"Kim","1211",'N');
        Shop shop = new Shop("Bat", 1,9.9);
        DeliveryRequest deliveryRequest = new DeliveryRequest();
        deliveryRequest.registerDriver(driver);
        deliveryRequest.registerCustomer(customer);
        deliveryRequest.registerShopping(shop);
        assertEquals("Kim", deliveryRequest.getDriverName());
    }

    @Test
    public void testItemPrice() {
        Customer customer = new Customer("Liang", "Ge", "726 Waterhill St", "2321", 0);
        Driver driver = new Taxi(0,"Kim","1211",'N');
        Shop shop = new Shop("Bat", 1,9.9);
        DeliveryRequest deliveryRequest = new DeliveryRequest();
        deliveryRequest.registerDriver(driver);
        deliveryRequest.registerCustomer(customer);
        deliveryRequest.registerShopping(shop);
        assertEquals(9.9, deliveryRequest.getItemPrice(),0);
    }

    @Test
    public void testCustomerPhoneNum() {
        Customer customer = new Customer("Liang", "Ge", "726 Waterhill St", "2321", 0);
        Driver driver = new Taxi(0,"Kim","1211",'N');
        Shop shop = new Shop("Bat", 1,9.9);
        DeliveryRequest deliveryRequest = new DeliveryRequest();
        deliveryRequest.registerDriver(driver);
        deliveryRequest.registerCustomer(customer);
        deliveryRequest.registerShopping(shop);
        assertEquals("2321", deliveryRequest.getCustomerPhoneNum());
    }
}
