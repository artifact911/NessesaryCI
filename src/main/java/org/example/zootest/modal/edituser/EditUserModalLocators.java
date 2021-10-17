package org.example.zootest.modal.edituser;

import org.openqa.selenium.By;

public interface EditUserModalLocators {

    String EDIT_USER_MODAL = "//div[@class='modal-content']";
    String H5 = "//h5[text()='Редактирование пользователя']";
    String FORM = "//form[@id='edit_user']";

    By H5_MODAL = By.xpath(EDIT_USER_MODAL + H5);
    By CROSS_CLOSE = By.xpath(EDIT_USER_MODAL + H5 + "/../button[@class='btn-close']");
    By LAST_NAME = By.xpath(EDIT_USER_MODAL + H5 + "/../..//input[@name='lastName']");
    By FIRST_NAME = By.xpath(EDIT_USER_MODAL + H5 + "/../..//input[@name='firstName']");
    By MIDDLE_NAME = By.xpath(EDIT_USER_MODAL + H5 + "/../..//input[@name='middleName']");
    By LOGIN = By.xpath(EDIT_USER_MODAL + H5 + "/../..//input[@name='login']");
    By PASSWORD = By.xpath(EDIT_USER_MODAL + H5 + "/../..//input[@name='password']");
    By ROLE_ADMIN = By.xpath(EDIT_USER_MODAL + H5 + "/../..//option[@value='ADMIN']");
    By ROLE_ASSISTANT = By.xpath(EDIT_USER_MODAL + H5 + "/../..//option[@value='ASSISTANT']");
    By ROLE_CUSTOMER = By.xpath(EDIT_USER_MODAL + H5 + "/../..//option[@value='CUSTOMER']");
    By STATUS_ACTIVE = By.xpath(EDIT_USER_MODAL + H5 + "/../..//input[@value='ACTIVE']");
    By STATUS_BANE = By.xpath(EDIT_USER_MODAL + H5 + "/../..//input[@value='BANE']");
    By CLOSE_BTN = By.xpath(EDIT_USER_MODAL + FORM + "/../..//button[@type='button']");
    By SAVE_BTN = By.xpath(EDIT_USER_MODAL + FORM + "/../..//button[@type='submit']");
}
