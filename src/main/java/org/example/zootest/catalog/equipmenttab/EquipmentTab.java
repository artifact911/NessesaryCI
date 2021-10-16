package org.example.zootest.catalog.equipmenttab;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class EquipmentTab implements EquipmentTabLocators{

    private final SelenideElement addEquipmentBtn = $(ADD_EQUIPMENT_BTN);
    private final SelenideElement searchEquipmentField = $(SEARCH_EQUIPMENT_FIELD);
    private final SelenideElement searchEquipmentBtn = $(SEARCH_EQUIPMENT_BTN);
    private final SelenideElement equipmentTable = $(EQUIPMENT_TABLE);
}
