package org.example.zootest.catalog.snaketab;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class SnakeTab implements SnakeTabLocators {
    
    private final SelenideElement addSnakeBtn = $(ADD_SNAKE_BTN);
    private final SelenideElement searchSnakeField = $(SEARCH_SNAKE_FIELD);
    private final SelenideElement searchSnakeBtn = $(SEARCH_SNAKE_BTN);
    private final SelenideElement snakeTable = $(SNAKE_TABLE);
}
