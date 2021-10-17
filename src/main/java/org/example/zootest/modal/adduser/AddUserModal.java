package org.example.zootest.modal.adduser;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class AddUserModal implements AddUserModalLocators {

    private final SelenideElement addModal = $(ADD_USER_MODAL);
    private final SelenideElement h5 = $(H5_MODAL);
    private final SelenideElement crossClose = $(CROSS_CLOSE);
    private final SelenideElement lastName = $(LAST_NAME);
    private final SelenideElement firstName = $(FIRST_NAME);
    private final SelenideElement middleName = $(MIDDLE_NAME);
    private final SelenideElement login = $(LOGIN);
    private final SelenideElement password = $(PASSWORD);
    private final SelenideElement roleAdmin = $(ROLE_ADMIN);
    private final SelenideElement roleAssistant = $(ROLE_ASSISTANT);
    private final SelenideElement roleCustomer = $(ROLE_CUSTOMER);
    private final SelenideElement statusActive = $(STATUS_ACTIVE);
    private final SelenideElement statusBane = $(STATUS_BANE);
    private final SelenideElement closeBtn = $(CLOSE_BTN);
    private final SelenideElement saveBtn = $(SAVE_BTN);
}
