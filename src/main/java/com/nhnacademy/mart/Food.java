package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Food {
    private static final Logger logger = LoggerFactory.getLogger(Food.class);

    private final String name;
    private final int price;

    public Food(String name, int price) {
        if(price <= 0) {
            logger.warn("상품의 가격은 0원 이하가 될 수 없습니다.");
            throw new IllegalArgumentException("상품의 가격은 0원 이하가 될 수 없습니다.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
