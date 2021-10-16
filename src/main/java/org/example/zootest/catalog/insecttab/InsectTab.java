package org.example.zootest.catalog.insecttab;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class InsectTab implements InsectTabLocators{

    private final SelenideElement addInsectBtn = $(ADD_INSECT_BTN);
    private final SelenideElement searchInsectField = $(SEARCH_INSECT_FIELD);
    private final SelenideElement searchInsectBtn = $(SEARCH_INSECT_BTN);
    private final SelenideElement insectTable = $(INSECT_TABLE);
}
