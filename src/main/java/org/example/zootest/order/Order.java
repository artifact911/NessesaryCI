package org.example.zootest.order;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class Order implements OrderLocators {

    private final SelenideElement addOrderBtn = $(ADD_ORDER_BTN);
    private final SelenideElement searchOrderField = $(SEARCH_ORDER_FIELD);
    private final SelenideElement searchOrderBTN = $(SEARCH_ORDER_BTN);
    private final SelenideElement orderTable = $(ORDER_TABLE);
}
