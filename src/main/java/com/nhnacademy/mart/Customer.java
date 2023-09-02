package com.nhnacademy.mart;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Customer 클래스.
 */
public class Customer {
    public static final Logger logger = LoggerFactory.getLogger(Customer.class);

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    private int money;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
        this.money = 20000;
    }

    public BuyList getBuyList() {
        return buyList;
    }

    public Basket getBasket() {
        return basket;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    /**
     * pickFoods 메소드.
     *
     * @param foodStand : 진열 상품 목록
     */
    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item : getBuyList().getItems()) {
            for (int i = 0; i < item.getAmount(); i++) {
                getBasket().add(foodStand.delete(item.getName()));
            }
        }
    }

    /**
     * payTox 메소드.
     *
     * @param counter : 계산대
     */
    public void payTox(Counter counter) {
        int totalPrice = counter.pay(getBasket(), getMoney());

        setMoney(getMoney() - totalPrice);

        logger.info("고객님 결제 후 잔액 : {}", getMoney());

    }
}





