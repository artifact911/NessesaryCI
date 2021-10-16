package org.example.zootest.catalog.scorpiontab;

import org.openqa.selenium.By;

public interface ScorpionTabLocators {

    String SEARCH_SCORPION = "//a[@href='references/scorpions/filter']";

    By ADD_SCORPION_BTN = By.xpath("//a[@href='references/scorpions/addScorpion']");
    By SEARCH_SCORPION_FIELD = By.xpath(SEARCH_SCORPION + "/preceding-sibling::input");
    By SEARCH_SCORPION_BTN = By.xpath(SEARCH_SCORPION);
    By SCORPION_TABLE = By.xpath("//div[@class='scorpion_list']");
}
