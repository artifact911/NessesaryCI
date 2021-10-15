package org.example.zootest.navbar;

import org.openqa.selenium.By;

public interface NavBarLocators {

    By USERS_LINK = By.xpath("//a[@href='/users']");

    By CATALOG_LINK = By.xpath("//a[@href='/references']");
    By ORDERS_LINK = By.xpath("//a[@href='/orders/order']");

    By GOODS_LINK = By.xpath("//a[@href='/index']");
    By PERSONAL_LINK = By.xpath("//a[@href='/personaloffice']");

    By EXIT_LINK = By.xpath("//a[@href='/auth/logout']");
}
