package org.example.zootest.catalog.lizardtab;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class LizardTab implements LizardTabLocators {

    private final SelenideElement addLizardBtn = $(ADD_LIZARD_BTN);
    private final SelenideElement searchLizardField = $(SEARCH_LIZARD_FIELD);
    private final SelenideElement searchLizardBtn = $(SEARCH_LIZARD_BTN);
    private final SelenideElement lizardTable = $(LIZARD_TABLE);
}
