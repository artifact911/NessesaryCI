package org.example.zootest.adminpage;

import org.openqa.selenium.By;

public interface AdminPageLocators {

    String SEARCH = "//input[@id='search']";

    By ADD_USER_BTN = By.xpath("//a[@href='users/addUser']");
    By SEARCH_FIELD = By.xpath(SEARCH);
    By SEARCH_BUTTON = By.xpath(SEARCH + "/following-sibling::*");
    By USER_TABLE = By.xpath("//div[@class='user_list']");
}
