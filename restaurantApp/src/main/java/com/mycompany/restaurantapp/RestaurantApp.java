
package com.mycompany.restaurantapp;
import com.mycompany.restaurantapp.food.Dish;
import com.mycompany.restaurantapp.food.Menu;
import com.mycompany.restaurantapp.people.Customer;
import com.mycompany.restaurantapp.values.CustomerRole;
import com.mycompany.restaurantapp.values.DishType;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "adsasdf");
        student.sellfood();
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "ads", "adsasd");
        administrative.sellfood();
        
        Menu menu= new Menu();
        Dish breakFast1 = new Dish(DishType.BREAKFAST, "huevos fritos", "huevos, sal, pimienta", 2400, 20);
        Dish breakFast2 = new Dish(DishType.BREAKFAST, "caldo de pollo", "papa, pollo, agua, ajo", 2400, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "pastas", "pastas frescas, salsas", 2400, 20);
        
        menu.addDish(breakFast1);
        menu.addDish( breakFast2);
        menu.addDish(lunch1);
    }
    
}
