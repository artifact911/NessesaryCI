package org.example.zootest.assistantpage;

import lombok.Getter;
import org.example.zootest.SiteBaseUrl;
import org.example.zootest.catalog.Catalog;
import org.example.zootest.navbar.AssistantNavBar;
import org.example.zootest.order.Order;

@Getter
public class AssistantPage implements SiteBaseUrl {

    private final AssistantNavBar navBar = new AssistantNavBar();
    private final Catalog catalog = new Catalog();
    private final Order order = new Order();
}
