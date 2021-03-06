package org.example.zootest.user;

import org.openqa.selenium.By;

public interface UserLocators {

    String SEARCH = "//input[@id='search']";

    By ADD_USER_BTN = By.xpath("//a[@href='users/addUser']");
    By SEARCH_FIELD = By.xpath(SEARCH);
    By SEARCH_BUTTON = By.xpath(SEARCH + "/following-sibling::*");
    By USER_TABLE = By.xpath("//div[@class='user_list']");
    By USER_TABLE_ELEMENTS = By.xpath("//div[@class='user_list']//tbody/tr");
}
