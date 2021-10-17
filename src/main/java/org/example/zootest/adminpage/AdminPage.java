package org.example.zootest.adminpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class AdminPage implements AdminPageLocators, SiteBaseUrl {

    private final AdminNavBar navBar = new AdminNavBar();
    private final AddUserModal addUserModal = new AddUserModal();
    private final EditUserModal editUserModal = new EditUserModal();
    private final DeleteUserModal deleteUserModal = new DeleteUserModal();
    private final User users = new User();
    private final Catalog catalog = new Catalog();
    private final Order order = new Order();
    private final Actions actions = new Actions(WebDriverRunner.getWebDriver());

    @Step("Проверка входа под ролью admin")
    public void checkAdminLogIn() {
        waitVisible(navBar.getUserLink());
        Assert.assertTrue(navBar.getUserLink().isDisplayed());
    }

    @Step("Добавление пользователя")
    public void checkAddUser() {
        users.getAddUserBtn().click();
        waitVisible(addUserModal.getH5());
        fillFields(addUserModal.getFirstName(), "fNameAdd");
        fillFields(addUserModal.getLastName(), "lNameAdd");
        fillFields(addUserModal.getMiddleName(), "mNameAdd");
        fillFields(addUserModal.getLogin(), "addTest");
        fillFields(addUserModal.getPassword(), "111");
        scrollTo(addUserModal.getRoleCustomer());
        addUserModal.getRoleCustomer().click();
        scrollTo(addUserModal.getStatusActive());
        addUserModal.getStatusActive().click();
        scrollTo(addUserModal.getSaveBtn());
        addUserModal.getSaveBtn().click();
        actions.sendKeys(Keys.F5);
        SelenideElement element = $(By.xpath("//td[text()='addTest']"));
        waitVisible(element);
        Assert.assertTrue(element.isDisplayed());
    }

    @Step("Редактирование пользователя")
    public void checkEditUser() {
        refresh();
        actions.sendKeys(Keys.F5);
        SelenideElement el = $(By.xpath("//td[text()='addTest']/..//a[contains(text(), 'Edit')]"));
        actions.sendKeys(Keys.F5);
        el.click();
        waitVisible(editUserModal.getH5());
        fillFields(editUserModal.getFirstName(), "Edited");
        fillFields(editUserModal.getLastName(), "Edited");
        fillFields(editUserModal.getMiddleName(), "Edited");
        fillFields(editUserModal.getLogin(), "Edited");
        fillFields(editUserModal.getPassword(), "111");
        editUserModal.getSaveBtn().click();
        actions.sendKeys(Keys.F5);
        waitVisible(users.getUserTable());
        SelenideElement elNew = $(By.xpath("//td[text()='addTestEdited']"));
        Assert.assertTrue(el.isEnabled());
    }

    @Step("Удаление пользователя")
    public void checkDelUser() {
        final int startSize = users.getUserTableElem().size();
        refresh();
        actions.sendKeys(Keys.F5);
        SelenideElement el = $(By.xpath("//td[text()='addTestEdited']/..//a[contains(text(), 'Delete')]"));
        actions.sendKeys(Keys.F5);
        el.click();
        waitVisible(deleteUserModal.getAgreeBtn());
        deleteUserModal.getAgreeBtn().click();
        actions.sendKeys(Keys.F5);
        refresh();
        final int finishSize = users.getUserTableElem().size();
        Assert.assertTrue(startSize > finishSize);
    }

    private void fillFields(SelenideElement el, String value) {
        waitVisible(el);
        scrollTo(el);
        el.click();
        el.sendKeys(value);
    }

    private void waitVisible(SelenideElement el) {
        el.shouldBe(Condition.visible, Duration.ofSeconds(3));
    }

    private void scrollTo(SelenideElement el) {
        actions.moveToElement(el).build().perform();
    }

    private void refresh() {
        navBar.getCatalogLink().click();
        navBar.getUserLink().click();
    }

}
