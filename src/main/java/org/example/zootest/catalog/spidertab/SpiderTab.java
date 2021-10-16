package org.example.zootest.catalog.spidertab;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class SpiderTab implements SpiderTabLocators{

    private final SelenideElement addSpiderBtn = $(ADD_SPIDER_BTN);
    private final SelenideElement searchSpiderField = $(SEARCH_SPIDER_FIELD);
    private final SelenideElement searchSpiderBtn = $(SEARCH_SPIDER_BTN);
    private final SelenideElement spiderTable = $(SPIDER_TABLE);

}
