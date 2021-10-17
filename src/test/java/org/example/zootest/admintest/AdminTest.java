package org.example.zootest.admintest;

import io.qameta.allure.Epic;
import io.qameta.allure.TmsLink;
import org.example.zootest.BaseTest;
import org.example.zootest.loginpage.LoginPage;
import org.example.zootest.adminpage.AdminPage;
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
    @Test(alwaysRun = true, description = "Check admin role", priority = 10)
    public void testCheckAdminRole() {
        LoginPage loginPage = new LoginPage();
        loginPage.adminLogIn();
        AdminPage page = new AdminPage();
        page.checkAdminLogIn();
    }

    @TmsLink("admin")
    @Test(dependsOnMethods = {"testCheckAdminRole"}, description = "Add user", priority = 20)
    public void testAddUser() {
        AdminPage page = new AdminPage();
        page.checkAddUser();
    }

    @TmsLink("admin")
    @Test(dependsOnMethods = {"testAddUser"}, description = "Edit user", priority = 30)
    public void testEditUser() {
        AdminPage page = new AdminPage();
        page.checkEditUser();
    }

    @TmsLink("admin")
    @Test(dependsOnMethods = {"testEditUser"}, description = "Delete user", priority = 40)
    public void testDeleteUser() {
        AdminPage page = new AdminPage();
        page.checkDelUser();
    }
}
