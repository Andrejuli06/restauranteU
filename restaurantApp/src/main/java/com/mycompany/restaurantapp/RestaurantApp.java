
package com.mycompany.restaurantapp;
import people.Customer;
import values.CustomerRole;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "adsasdf");
        student.sellfood();
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "ads", "adsasd");
        administrative.sellfood();
    }
}
