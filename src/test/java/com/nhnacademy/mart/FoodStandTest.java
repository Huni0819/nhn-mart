package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {

    @Test
    @DisplayName("add Test")
    void addTest() {
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 2000));

        Assertions.assertEquals("양파", foodStand.getFoods().get(0).getName());
        Assertions.assertEquals(2000, foodStand.getFoods().get(0).getPrice());
    }

    @Test
    @DisplayName("재고가 없는 경우")
    void failDeleteTest() {
        FoodStand foodStand = new FoodStand();

        Assertions.assertThrows(IllegalArgumentException.class, () -> foodStand.delete("양파"));
    }

    @Test
    @DisplayName("delete Test")
    void deleteTest() {
        FoodStand foodStand = new FoodStand();
        Food food = new Food("양파", 2000);

        foodStand.add(food);

        Assertions.assertEquals(food, foodStand.delete(food.getName()));
    }
}