package org.example.zootest.modal.delete;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class DeleteUserModal implements DeleteUserModalLocators {

    private final SelenideElement h5 = $(H5_DELETE);
    private final SelenideElement crossClose = $(CROSS_CLOSE);
    private final SelenideElement closeBtn = $(CLOSE_BTN);
    private final SelenideElement agreeBtn = $(AGREE_BTN);
}
