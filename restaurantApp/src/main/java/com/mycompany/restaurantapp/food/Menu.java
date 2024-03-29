package com.mycompany.restaurantapp.food;

import com.mycompany.restaurantapp.values.DishType;
import java.util.ArrayList;

public class Menu {

    private ArrayList<Dish> dishList;

    public Menu() {
        this.dishList = new ArrayList<>();
    }

    public Menu(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }

    public void addDish(Dish dish) {
        this.dishList.add(dish);
    }

    public ArrayList<String> getDishesPerType(DishType dishType) {
        ArrayList<String> foundDishes = new ArrayList<>();

        for (Dish dish : dishList) {
            if (dish.getType() == dishType) {
                foundDishes.add(dish.getName());
                foundDishes.add(dish.getIngredents());
            }
        }
        return foundDishes;
    }
    public void showMenu(){
        for(DishType dishType: DishType.values()){
            System.out.println("***"+ dishType+"--");
        }
    }
}
