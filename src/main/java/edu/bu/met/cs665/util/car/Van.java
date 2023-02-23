/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/23/2023
 * File Name: Van.java
 * Description: One of three car type class contains basic car info.
 */
package edu.bu.met.cs665.util.car;

import edu.bu.met.cs665.util.Driver;

public class Van extends Driver {
    final double price = 9.0;
    final String type = "local freelance van";

    @Override
    public String getDriverType() {
        super.setDriverType(type);
        return super.getDriverType();
    }

    @Override
    public double getPrice() {
        super.setPrice(price);
        return super.getPrice();
    }

    public Van(int driverID, String driverName, String phoneNum, char driverStatus) {
        super(driverID, driverName, phoneNum, driverStatus);
    }

    public Van() {
    }
}
