package org.example.zootest.admintest;

import io.qameta.allure.Epic;
import io.qameta.allure.TmsLink;
import org.example.zootest.BaseTest;
import org.example.zootest.loginpage.LoginPage;
import org.example.zootest.userpage.UserPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("Admin")
public class AdminTest extends BaseTest {

    @BeforeClass(alwaysRun = true)
    @Override
    protected void beforeClass() {
        super.beforeClass();
    }

    @TmsLink("admin")
    @Test(description = "Check admin role", priority = 10)
    public void testCheckAdminRole() {
        LoginPage loginPage = new LoginPage();
        loginPage.adminLogIn();
        UserPage page = new UserPage();
        page.checkAdminLogIn();
    }
}
