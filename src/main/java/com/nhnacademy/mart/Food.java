package com.nhnacademy.mart;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Food 클래스.
 */
public class Food {
    private static final Logger logger = LoggerFactory.getLogger(Food.class);

    private final String name;
    private final int price;

    /**
     * Food 생성자.
     *
     * @param name  : 상품 이름
     * @param price : 상품 가격
     */
    public Food(String name, int price) {
        if (StringUtils.isEmpty(name)) {
            logger.warn("상품의 이름은 공백이거나 Null값이 들어올 수 없습니다.");
            throw new IllegalArgumentException("상품의 이름은 공백이거나 Null값이 들어올 수 없습니다.");
        }
        if (price <= 0) {
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
