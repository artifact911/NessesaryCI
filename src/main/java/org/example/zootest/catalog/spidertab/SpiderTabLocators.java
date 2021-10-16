package org.example.zootest.catalog.spidertab;

import org.openqa.selenium.By;

public interface SpiderTabLocators {

    String SEARCH_SPIDER = "//a[@href='references/spiders/filter']";

    By ADD_SPIDER_BTN = By.xpath("//a[@href='references/spiders/addSpider']");
    By SEARCH_SPIDER_FIELD = By.xpath(SEARCH_SPIDER + "/preceding-sibling::input");
    By SEARCH_SPIDER_BTN = By.xpath(SEARCH_SPIDER);
    By SPIDER_TABLE = By.xpath("//div[@class='spider_list']");
}
