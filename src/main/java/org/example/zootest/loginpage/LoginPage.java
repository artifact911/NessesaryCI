package org.example.zootest.loginpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.Getter;
import org.example.zootest.SiteBaseUrl;
import org.example.zootest.navbar.CustomerNavBar;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class LoginPage implements LoginPageLocators, SiteBaseUrl {

    private final SelenideElement login = $(LOGIN);
    private final SelenideElement password = $(PASSWORD);
    private final SelenideElement signIn = $(SIGN_IN_BTN);
    private final SelenideElement checkbox = $(REMEMBER_ME);
    private final SelenideElement invalidMsg = $(INVALID_LOGIN);
    private final CustomerNavBar navBar = new CustomerNavBar();

    @Step("Проверка логирования для всех ролей")
    public void checkAllLogin() {
        adminLogIn();
        navBar.getExitLink().click();
        assistantLogIn();
        navBar.getExitLink().click();
        customerLogIn();
        navBar.getExitLink().click();
        negativeLogIn();
    }

    @Step("Проверка позитивного логирования админа")
    public void adminLogIn() {
        fillFields(LoginData.ADMIN.getLogin(), LoginData.ADMIN.getPassword());
        Assert.assertEquals(ADMIN_USERS, WebDriverRunner.driver().getWebDriver().getCurrentUrl());
    }

    @Step("Проверка позитивного логирования консультанта")
    public void assistantLogIn() {
        fillFields(LoginData.ASSISTANT.getLogin(), LoginData.ASSISTANT.getPassword());
        Assert.assertEquals(CATALOG, WebDriverRunner.driver().getWebDriver().getCurrentUrl());
    }

    @Step("Проверка позитивного логирования клиента")
    public void customerLogIn() {
        fillFields(LoginData.CUSTOMER.getLogin(), LoginData.CUSTOMER.getPassword());
        Assert.assertEquals(USER_GOODS, WebDriverRunner.driver().getWebDriver().getCurrentUrl());
    }

    @Step("Проверка негативного логирования")
    public void negativeLogIn() {
        fillFields(LoginData.INVALID.getLogin(), LoginData.INVALID.getPassword());
        Assert.assertTrue(invalidMsg.isDisplayed());
    }

    private void fillFields(String logins, String passwords) {
        waitVisible(login);
        login.click();
        login.sendKeys(logins);
        password.click();
        password.sendKeys(passwords);
        signIn.click();
    }

    private void waitVisible(SelenideElement el) {
        el.shouldBe(Condition.visible, Duration.ofSeconds(3));
    }
}
