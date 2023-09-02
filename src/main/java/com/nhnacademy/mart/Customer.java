package com.nhnacademy.mart;


public class Customer {

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

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item : getBuyList().getItems()) {
            for (int i = 0; i < item.getAmount(); i++) {
                getBasket().add(foodStand.delete(item.getName()));
            }
        }
    }

    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {
        int totalPrice = counter.pay(getBasket(), getMoney());

        setMoney(getMoney() - totalPrice);

        System.out.println("고객님 결제 후 잔액 : " + getMoney());

    }
}





