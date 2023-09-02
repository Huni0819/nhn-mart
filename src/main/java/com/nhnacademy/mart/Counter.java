package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Counter 클래스.
 */
public class Counter {
    private static final Logger logger = LoggerFactory.getLogger(Counter.class);

    /**
     * pay 메소드.
     *
     * @param basket : 고객이 담은 상품 목록
     * @param money  : 고객의 소지 금액
     * @return : 결제 금액
     */
    public int pay(Basket basket, int money) {
        int totalPrice = 0;

        for (Food food : basket.getFoods()) {
            totalPrice += food.getPrice();
        }

        if (totalPrice > money) {
            logger.warn("계산 실패 .. 가격은 {} 원 입니다. 소지금이 부족합니다.", totalPrice);
            throw new IllegalArgumentException("소지금이 부족합니다.");
        }

        logger.info("총 결제 금액 : {}", totalPrice);

        return totalPrice;
    }

}
