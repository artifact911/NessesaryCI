package org.example.zootest.navbar;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class AssistantNavBar extends NavBar {

    private final SelenideElement catalogLink = $(CATALOG_LINK);
    private final SelenideElement orderLink = $(ORDERS_LINK);
}
