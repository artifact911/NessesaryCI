package org.example.zootest.userpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.Getter;
import org.example.zootest.loginpage.LoginData;
import org.example.zootest.navbar.AdminNavBar;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class UserPage implements UserPageLocators {

    private final SelenideElement addUserBtn = $(ADD_USER_BTN);
    private final SelenideElement searchField = $(SEARCH_FIELD);
    private final SelenideElement searchBtn = $(SEARCH_BUTTON);
    private final SelenideElement userTable = $(USER_TABLE);

    private final AdminNavBar navBar = new AdminNavBar();

    @Step("Проверка входа под ролью admin")
    public void checkAdminLogIn() {
       waitVisible(navBar.getUserLink());
       Assert.assertTrue(navBar.getUserLink().isDisplayed());
    }

    private void waitVisible(SelenideElement el) {
        el.shouldBe(Condition.visible, Duration.ofSeconds(3));
    }

}
