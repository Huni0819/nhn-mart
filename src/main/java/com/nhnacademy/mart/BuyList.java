package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BuyList 클래스.
 */
public class BuyList {
    private static final Logger logger = LoggerFactory.getLogger(BuyList.class);


    private final ArrayList<Item> items = new ArrayList<>();


    public List<Item> getItems() {
        return items;
    }

    public void add(Item item) {
        logger.info("{} 상품 {}개를 구매항목에 추가하였습니다.", item.getName(), item.getAmount());
        getItems().add(item);
    }

    /**
     * Item 클래스.
     */
    public static class Item {
        private final String name;
        private final int amount;

        /**
         * Item 생성자.
         *
         * @param name : 항목 이름
         * @param amount : 항목 수량
         */
        public Item(String name, int amount) {
            if (StringUtils.isEmpty(name)) {
                logger.warn("Item 추가 실패 .. 항목의 이름은 공백이나 Null일 수 없습니다");
                throw new IllegalArgumentException("항목의 이름은 공백이나 Null일 수 없습니다.");
            }
            if (amount <= 0) {
                logger.warn("Item 추가 실패 .. 항목의 수량은 1보다 작을 수 없습니다.");
                throw new IllegalArgumentException("항목의 수량은 1보다 작을 수 없습니다.");
            }
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }


    }
}
