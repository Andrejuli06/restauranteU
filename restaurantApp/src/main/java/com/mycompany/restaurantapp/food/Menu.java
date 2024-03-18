package com.mycompany.restaurantapp.food;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Dish> dishList;

    public Menu() {
        this.dishList=  new ArrayList<>();
    }
    

    public Menu(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }
    public void addDish(Dish dish){
        this.dishList.add(dish);
    }

}
