package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {

    @Test
    @DisplayName("Item preCondition")
    void itemPreCondition() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new BuyList.Item("", 2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new BuyList.Item("양파", 0));
    }

    @Test
    @DisplayName("Item Constructor Test")
    void itemTest() {
        BuyList.Item item = new BuyList.Item("양파", 2);
        Assertions.assertEquals("양파", item.getName());
        Assertions.assertEquals(2, item.getAmount());
    }

    @Test
    @DisplayName("add Test")
    void addTest() {
        BuyList buyList = new BuyList();
        BuyList.Item item = new BuyList.Item("양파", 2);

        buyList.add(item);

        Assertions.assertEquals("양파", buyList.getItems().get(0).getName());
        Assertions.assertEquals(2, buyList.getItems().get(0).getAmount());
    }

}