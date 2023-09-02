package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    @DisplayName("소지금 부족 테스트")
    void failPayTest() {
        Basket basket = new Basket();
        Counter counter = new Counter();

        basket.add(new Food("양파", 5000));

        Assertions.assertThrows(IllegalArgumentException.class, () -> counter.pay(basket, 2000));
    }

    @Test
    @DisplayName("pay Test")
    void payTest() {
        Basket basket = new Basket();
        Counter counter = new Counter();

        basket.add(new Food("양파", 2000));

        Assertions.assertEquals(2000, counter.pay(basket, 3000));
    }

}