package org.example.zootest.loginpage;

import org.openqa.selenium.By;

public interface LoginPageLocators {

    String BASE = "//form";

    By LOGIN = By.xpath(BASE + "//input[@name='username']");
    By PASSWORD = By.xpath(BASE + "//input[@name='password']");
    By SIGN_IN_BTN = By.xpath(BASE + "//button[@type='submit']");
    By REMEMBER_ME = By.xpath(BASE + "//input[@type='checkbox']");
}
