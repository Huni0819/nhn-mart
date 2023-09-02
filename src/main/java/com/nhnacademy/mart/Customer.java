package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);


    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    private int money;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
        this.money = 20000;
    }

    public int getMoney() {
        return money;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item : buyList.getItems()) {
            for (int i = 0; i < item.getAmount(); i++) {
                basket.add(foodStand.delete(item.getName()));
            }
        }
    }

    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {
        counter.pay(basket, getMoney());
    }
}





