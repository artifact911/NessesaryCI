package org.example.zootest.catalog.equipmenttab;

import org.openqa.selenium.By;

public interface EquipmentTabLocators {

    String SEARCH_EQUIPMENT = "//a[@href='references/equipments/filter']";

    By ADD_EQUIPMENT_BTN = By.xpath("//a[@href='references/equipments/addEquipment']");
    By SEARCH_EQUIPMENT_FIELD = By.xpath(SEARCH_EQUIPMENT + "/preceding-sibling::input");
    By SEARCH_EQUIPMENT_BTN = By.xpath(SEARCH_EQUIPMENT);
    By EQUIPMENT_TABLE = By.xpath("//div[@class='equipment_list']");
}
