package org.example.zootest.assistantpage;

import lombok.Getter;
import org.example.zootest.SiteBaseUrl;
import org.example.zootest.catalog.Catalog;
import org.example.zootest.navbar.AssistantNavBar;

@Getter
public class AssistantPage implements SiteBaseUrl {

    private final AssistantNavBar navBar = new AssistantNavBar();
    private final Catalog catalog = new Catalog();
}
