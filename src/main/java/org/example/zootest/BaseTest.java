package org.example.zootest;

import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest implements SiteBaseUrl {

    @BeforeClass(alwaysRun = true)
    protected void beforeClass() {
        prepare(SITE_BASE_URL);
    }

    protected void prepare(String url) {
        open(url);
    }
}
