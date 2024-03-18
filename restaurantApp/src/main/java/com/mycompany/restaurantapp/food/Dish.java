
package com.mycompany.restaurantapp.food;

import com.mycompany.restaurantapp.values.DishType;

public class Dish {
    private DishType type;
    private String name;
    private String ingredents;//TODO: convertir una lista
    private int price;
    private int qty;

    public Dish(DishType type, String name, String ingredents, int price, int qty) {
        this.type = type;
        this.name = name;
        this.ingredents = ingredents;
        this.price = price;
        this.qty = qty;
    }
}
