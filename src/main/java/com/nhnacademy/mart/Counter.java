package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    private static Logger logger = LoggerFactory.getLogger(Counter.class);

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public int pay(Basket basket, int money) {
        int totalPrice = 0;

        for(Food food : basket.getFoods()) {
            totalPrice += food.getPrice();
        }

        if(totalPrice > money) {
            logger.warn("계산 실패 .. 가격은 " + totalPrice + "원 입니다. 소지금이 부족합니다.");
            throw new IllegalArgumentException("소지금이 부족합니다.");
        }

        return totalPrice;
    }

}
