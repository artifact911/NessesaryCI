package org.example.zootest.order;

import org.openqa.selenium.By;

public interface OrderLocators {

    String SEARCH_ORDER = "//a[@href='orders/filter']";

    By ADD_ORDER_BTN = By.xpath("//a[@href='orders/addOrder']");
    By SEARCH_ORDER_FIELD = By.xpath(SEARCH_ORDER + "/preceding-sibling::input");
    By SEARCH_ORDER_BTN = By.xpath(SEARCH_ORDER);
    By ORDER_TABLE = By.xpath("//div[@class='order_list']");
}
