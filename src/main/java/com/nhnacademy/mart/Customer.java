package com.nhnacademy.mart;


import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);


    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item : buyList.getItems()) {
            for (Food food : foodStand.getFoods()) {
                if (item.getName().equals(food.getName())) {
                    if(item.getAmount() > Collections.frequency(foodStand.getFoods(), food.getName())) {
                        logger.warn("담기 실패 .. 상품 매대에 " + item.getName() + " 상품의 수량이 부족합니다.");
                        throw new IllegalArgumentException("상품 담기 실패");
                    }
                    for(int i = 0; i < item.getAmount(); i++) {
                        basket.add(food);
                        foodStand.delete(food);
                    }
                    break;
                } else {
                    logger.warn("담기 실패 .. 상품 매대에" + item.getName() +  " 상품이 존재 하지 않습니다.");
                    throw new IllegalArgumentException("상픔 담기 실패");
                }
            }
        }

    }


    // TODO payTox 메서드 구현


}
