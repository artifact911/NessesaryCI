package org.example.zootest.modal.delete;

import org.openqa.selenium.By;

public interface DeleteUserModalLocators {

    String H5 = "//h5[text()='Удаление']";
    String CROSS = "/../button";

    By H5_DELETE = By.xpath(H5);
    By CROSS_CLOSE = By.xpath(H5 + CROSS);
    By CLOSE_BTN = By.xpath(H5 + CROSS + "/../../div[@class='modal-footer']/button");
    By AGREE_BTN = By.xpath(H5 + CROSS + "/../../div[@class='modal-footer']/a");
}
