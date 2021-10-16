package org.example.zootest.catalog.lizardtab;

import org.openqa.selenium.By;

public interface LizardTabLocators {

    String SEARCH_LIZARD = "//a[@href='references/lizards/filter']";

    By ADD_LIZARD_BTN = By.xpath("//a[@href='references/lizards/addLizard']");
    By SEARCH_LIZARD_FIELD = By.xpath(SEARCH_LIZARD + "/preceding-sibling::input");
    By SEARCH_LIZARD_BTN = By.xpath(SEARCH_LIZARD);
    By LIZARD_TABLE = By.xpath("//div[@class='lizard_list']");
}
