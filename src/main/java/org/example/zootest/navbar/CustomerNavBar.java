package org.example.zootest.navbar;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class CustomerNavBar extends NavBar {

    private final SelenideElement goodsLink = $(GOODS_LINK);
    private final SelenideElement personalLink = $(PERSONAL_LINK);
}
