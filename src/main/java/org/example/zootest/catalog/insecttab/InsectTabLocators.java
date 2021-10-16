package org.example.zootest.catalog.insecttab;

import org.openqa.selenium.By;

public interface InsectTabLocators {

    String SEARCH_INSECT = "//a[@href='references/insects/filter']";

    By ADD_INSECT_BTN = By.xpath("//a[@href='references/insects/addInsect']");
    By SEARCH_INSECT_FIELD = By.xpath(SEARCH_INSECT + "/preceding-sibling::input");
    By SEARCH_INSECT_BTN = By.xpath(SEARCH_INSECT);
    By INSECT_TABLE = By.xpath("//div[@class='insect_list']");
}
