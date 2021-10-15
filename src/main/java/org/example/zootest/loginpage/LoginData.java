package org.example.zootest.loginpage;

import lombok.Getter;

@Getter
public enum LoginData {

    ADMIN("admin", "111"),
    ASSISTANT("assistant", "111"),
    CUSTOMER("иван", "111"),
    INVALID("взломщик", "***");

    String login;
    String password;

    LoginData(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
