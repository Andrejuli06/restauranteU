package com.mycompany.restaurantapp.people;

import com.mycompany.restaurantapp.values.CustomerRole;

public class Customer {

    CustomerRole role;
    String id;
    String fullName;

    public Customer(CustomerRole role, String id, String fullName) {
        this.role = role;
        this.id = id;
        this.fullName = fullName;
    }
    

    void sayMenu() {

    }

    void buyfood() {

    }

    void cancelbuy() {

    }

   public  void sellfood() {
        if (this.role != CustomerRole.ADMINISTRATIVE) {
            System.out.println("usted no tiene permiso para vender");
            return;
        }
        System.out.println("ya lo atiendo mijo");

    }
}
