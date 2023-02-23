/**
 * Name: Zhilin Chang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/23/2023
 * File Name: Customer.java
 * Description: A customer class contains basic customer info.
 */
package edu.bu.met.cs665.util;

public class Customer{

  /**
   * Create a Customer object using first and last name.
   * 
   * @param firstName firstname of the person as string
   * @param lastName lastname of the person as string
   */
  public Customer(String firstName, String lastName) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  private String firstName;
  private String lastName;
  private String address;
  private String phoneNum;
  private int id;

  public Customer(String firstName, String lastName, String address, String phoneNum, int id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNum = phoneNum;
    this.id = id;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", address='" + address + '\'' +
            ", phoneNum=" + phoneNum +
            ", id=" + id +
            '}';
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  /*
   * Getter method for first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter method for first name string.
   * 
   * @param firstName first name of a person
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter method for last name of the person.
   * 
   * @return
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter method for the last name of the person.
   * 
   * @param lastName last name string
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
