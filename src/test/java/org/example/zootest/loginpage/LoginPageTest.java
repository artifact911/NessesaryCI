package org.example.zootest.loginpage;

import io.qameta.allure.Epic;
import io.qameta.allure.TmsLink;
import org.example.zootest.SiteBaseUrl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.*;

@Epic("Zoo")
public class LoginPageTest implements SiteBaseUrl {

    @BeforeClass
    public void doBefore() {
        open(SITE_BASE_URL);
    }

    @TmsLink("1")
    @Test(description = "Check Login", priority = 10)
    public void testCheckAllLogin() {
        LoginPage page = new LoginPage();
        page.checkAllLogin();
    }
}