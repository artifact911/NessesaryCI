package org.example.zootest.catalog.snaketab;

import org.openqa.selenium.By;

public interface SnakeTabLocators {

    String SEARCH_SNAKE = "//a[@href='references/snakes/filter']";

    By ADD_SNAKE_BTN = By.xpath("//a[@href='references/snakes/addSnake']");
    By SEARCH_SNAKE_FIELD = By.xpath(SEARCH_SNAKE + "/preceding-sibling::input");
    By SEARCH_SNAKE_BTN = By.xpath(SEARCH_SNAKE);
    By SNAKE_TABLE = By.xpath("//div[@class='snake_list']");
}
