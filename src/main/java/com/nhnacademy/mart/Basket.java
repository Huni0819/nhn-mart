package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.List;

/**
 * Basket 클래스.
 */
public class Basket {
    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public List<Food> getFoods() {
        return foods;
    }
}
