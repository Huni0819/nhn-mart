package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    @DisplayName("재고 없는 상품 테스트")
    void noExistFoodTest() {
        Customer customer = new Customer(new BuyList());
        NhnMart mart = new NhnMart();

        mart.prepareMart();

        customer.bring(mart.provideBasket());

        customer.getBuyList().add(new BuyList.Item("피망", 2));

        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.pickFoods(mart.getFoodStand()));
    }

    @Test
    @DisplayName("pickFoods Test")
    void pickFoodsTest() {
        Customer customer = new Customer(new BuyList());
        NhnMart mart = new NhnMart();

        mart.prepareMart();

        customer.bring(mart.provideBasket());

        customer.getBuyList().add(new BuyList.Item("양파", 2));

        customer.pickFoods(mart.getFoodStand());

        Assertions.assertEquals(2, customer.getBasket().getFoods().size());
    }

    @Test
    @DisplayName("payTox Test")
    void payToxTest() {
        NhnMart mart = new NhnMart();

        mart.prepareMart();

        Customer customer = new Customer(new BuyList());

        customer.bring(mart.provideBasket());

        customer.getBuyList().add(new BuyList.Item("양파", 2));

        customer.pickFoods(mart.getFoodStand());

        customer.payTox(mart.getCounter());

        Assertions.assertEquals(18000, customer.getMoney());
    }

}