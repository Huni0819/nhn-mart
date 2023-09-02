package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodTest {

    @Test
    @DisplayName("preCondition")
    void preContidion() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Food("", 3000));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Food("사과", 0));
    }

    @Test
    @DisplayName("Constructor Test")
    void constructorTest() {
        Food food = new Food("대파", 2000);
        Assertions.assertEquals("대파", food.getName());
        Assertions.assertEquals(2000, food.getPrice());
    }

}