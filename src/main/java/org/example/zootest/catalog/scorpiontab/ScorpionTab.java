package org.example.zootest.catalog.scorpiontab;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ScorpionTab implements ScorpionTabLocators {

    private final SelenideElement addScorpionBtn = $(ADD_SCORPION_BTN);
    private final SelenideElement searchScorpionField = $(SEARCH_SCORPION_FIELD);
    private final SelenideElement searchScorpionBtn = $(SEARCH_SCORPION_BTN);
    private final SelenideElement scorpionTable = $(SCORPION_TABLE);
}
