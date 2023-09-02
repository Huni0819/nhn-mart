package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    @DisplayName("add Test")
    void addTest() {
        Basket basket = new Basket();

        Food food = new Food("양파", 2000);

        basket.add(food);
        Assertions.assertEquals("양파", basket.getFoods().get(0).getName());
        Assertions.assertEquals(2000, basket.getFoods().get(0).getPrice());
    }
}