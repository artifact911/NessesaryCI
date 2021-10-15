package org.example.zootest.navbar;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
@Getter
public abstract class NavBar implements NavBarLocators {

    SelenideElement exitLink = $(EXIT_LINK);
}
