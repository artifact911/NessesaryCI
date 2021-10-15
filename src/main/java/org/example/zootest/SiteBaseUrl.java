package org.example.zootest;

public interface SiteBaseUrl {

    String SITE_BASE_URL = "http://localhost:8080";
    String SITE_LOGIN_URL = SITE_BASE_URL + "/auth/login";
    String ADMIN_USERS = SITE_BASE_URL + "/users";
    String USER_GOODS = SITE_BASE_URL + "/index";
    String USER_PERSONAL_OFFICE = SITE_BASE_URL + "/personaloffice";
    String CATALOG = SITE_BASE_URL + "/references";
    String ORDERS = SITE_BASE_URL + "/orders/order";
}
