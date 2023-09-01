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
        foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public void delete(Food food) {
        if(!foods.contains(food)) {
            logger.warn("진열 상품 삭제 실패 .. 해당 상품은 매대에 진열되어 있지 않습니다.");
            throw new IllegalArgumentException("진열 상품 삭제 실패");
        }

        foods.remove(food);
    }
}
