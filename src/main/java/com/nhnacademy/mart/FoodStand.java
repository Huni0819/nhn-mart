package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodStand {
    private static final Logger logger = LoggerFactory.getLogger(FoodStand.class);

    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }

    // TODO add 메서드 구현
    public void add(Food food) {
        logger.info(food.getName() + " 상품을 진열했습니다.");
        foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public Food delete(String foodName) {
        for (Food food : foods) {
            if (food.getName().equals(foodName)) {
                Food temp = food;
                logger.info(foodName + " 삭제");
                foods.remove(food);
                return food;
            }
        }
        logger.warn("삭제 실패 .. 상품 매대에 " + foodName + " 상품이 존재 하지 않습니다.");
        throw new IllegalArgumentException("삭제 실패");
    }

}
