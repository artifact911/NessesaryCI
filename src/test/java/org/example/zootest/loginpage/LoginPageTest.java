package org.example.zootest.loginpage;

import io.qameta.allure.Epic;
import io.qameta.allure.TmsLink;
import org.example.zootest.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("Zoo")
public class LoginPageTest extends BaseTest {

    @BeforeClass(alwaysRun = true)
    @Override
    protected void beforeClass() {
        super.beforeClass();
    }

    @TmsLink("Login")
    @Test(description = "Check Login", priority = 11)
    public void testCheckAllLogin() {
        LoginPage page = new LoginPage();
        page.checkAllLogin();
    }
}