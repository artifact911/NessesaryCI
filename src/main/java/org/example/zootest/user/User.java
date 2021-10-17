package org.example.zootest.user;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class User implements UserLocators{

    private final SelenideElement addUserBtn = $(ADD_USER_BTN);
    private final SelenideElement searchField = $(SEARCH_FIELD);
    private final SelenideElement searchBtn = $(SEARCH_BUTTON);
    private final SelenideElement userTable = $(USER_TABLE);
    private final ElementsCollection userTableElem = $$(USER_TABLE_ELEMENTS);
}
