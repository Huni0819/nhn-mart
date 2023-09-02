package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NhnMartTest {

    @Test
    @DisplayName("fillFoodStand Test")
    void fillFoodStandTest() {
        NhnMart mart = new NhnMart();

        mart.prepareMart();
        Assertions.assertEquals(37, mart.getFoodStand().getFoods().size());
    }

}