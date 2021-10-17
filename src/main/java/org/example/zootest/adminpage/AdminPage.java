package org.example.zootest.adminpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.example.zootest.SiteBaseUrl;
import org.example.zootest.catalog.Catalog;
import org.example.zootest.modal.adduser.AddUserModal;
import org.example.zootest.modal.delete.DeleteUserModal;
import org.example.zootest.modal.edituser.EditUserModal;
import org.example.zootest.navbar.AdminNavBar;
import org.example.zootest.order.Order;
import org.example.zootest.user.User;
import org.testng.Assert;

import java.time.Duration;

@Getter
public class AdminPage implements AdminPageLocators, SiteBaseUrl {

    private final AdminNavBar navBar = new AdminNavBar();
    private final AddUserModal addUserModal = new AddUserModal();
    private final EditUserModal editUserModal = new EditUserModal();
    private final DeleteUserModal deleteUserModal = new DeleteUserModal();
    private final User users = new User();
    private final Catalog catalog = new Catalog();
    private final Order order = new Order();

    @Step("Проверка входа под ролью admin")
    public void checkAdminLogIn() {
        waitVisible(navBar.getUserLink());
        Assert.assertTrue(navBar.getUserLink().isDisplayed());
    }

    private void waitVisible(SelenideElement el) {
        el.shouldBe(Condition.visible, Duration.ofSeconds(3));
    }

}
