package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FoodStand 클래스.
 */
public class FoodStand {
    private static final Logger logger = LoggerFactory.getLogger(FoodStand.class);

    private final ArrayList<Food> foods = new ArrayList<>();

    public List<Food> getFoods() {
        return foods;
    }

    public void add(Food food) {
        logger.info("{} 상품을 진열했습니다.", food.getName());
        foods.add(food);
    }

    /**
     * delete 메소드.
     *
     * @param foodName : 삭제할 상품 이름
     * @return : 진열 상품 목록에서 삭제한 상품
     */
    public Food delete(String foodName) {
        for (Food food : foods) {
            if (food.getName().equals(foodName)) {
                logger.info("{} 삭제", foodName);
                foods.remove(food);
                return food;
            }
        }
        logger.warn("삭제 실패 .. 상품 매대에 {} 상품이 존재 하지 않습니다.", foodName);
        throw new IllegalArgumentException("삭제 실패");
    }

}
