package org.example.zootest.catalog;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.example.zootest.catalog.equipmenttab.EquipmentTab;
import org.example.zootest.catalog.insecttab.InsectTab;
import org.example.zootest.catalog.lizardtab.LizardTab;
import org.example.zootest.catalog.scorpiontab.ScorpionTab;
import org.example.zootest.catalog.snaketab.SnakeTab;
import org.example.zootest.catalog.spidertab.SpiderTab;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class Catalog implements CatalogLocators {

    private final SelenideElement spiderTab = $(SPIDER_TAB);
    private final SelenideElement snakeTab = $(SNAKE_TAB);
    private final SelenideElement scorpionTab = $(SCORPION_TAB);
    private final SelenideElement lizardTab = $(LIZARD_TAB);
    private final SelenideElement insectTab = $(INSECT_TAB);
    private final SelenideElement equipmentTab = $(EQUIP_TAB);

    private final SpiderTab spiderTable = new SpiderTab();
    private final SnakeTab snakeTable = new SnakeTab();
    private final ScorpionTab scorpionTable = new ScorpionTab();
    private final LizardTab lizardTable = new LizardTab();
    private final InsectTab insectTable = new InsectTab();
    private final EquipmentTab equipmentTable = new EquipmentTab();
}
