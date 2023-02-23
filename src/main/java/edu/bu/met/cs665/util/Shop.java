/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/23/2023
 * File Name: Shop.java
 * Description: A Shop class contains item info
 */

package edu.bu.met.cs665.util;

public class Shop {
    private String itemName;
    private int itemNum;
    private double itemPrice;
    private int shoppingID;

    public Shop(String itemName, int itemNum, double itemPrice) {
        this.itemName = itemName;
        this.itemNum = itemNum;
        this.itemPrice = itemPrice;
    }

    public Shop() {
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

    public int getShoppingID() {
        return shoppingID;
    }

    public void setShoppingID(int shoppingID) {
        this.shoppingID = shoppingID;
    }
}
