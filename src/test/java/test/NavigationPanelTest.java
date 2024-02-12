package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка страниц навигационной панели")
@Tag("ui")
@DisplayName("Тестирование функционала страниц навигационной панели")
public class NavigationPanelTest extends TestBase {


    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка открытия страницы New Products")
    @DisplayName("Проверка отображения элементов страницы New Products")
    void checkContainListPagesTest() {
        mainPage.openPage();
        navigationPanel.findElementInList()
                .checkElementInList()
                .checkText();

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка открытия страницы из выпадающего списка")
    @DisplayName("Проверка открытия страницы Audio")
    void checkPageHeaderTest() {
        mainPage.openPage();
        navigationPanel.openLink()
                .byAudio()
                .checkElementList()
                .checkTextPage();

    }
}
