package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка элементов навигационной панели")
@Tag("ui")
public class NavigationPanelTest extends TestBase {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка наличия элемента SHOP GARAGE в списке ссылок")
    @DisplayName("Проверка наличия элемента SHOP GARAGE в списке ссылок навигационной панели главной страницы")
    void checkMainPageIconTest() {
        mainPage.openPage();
        navigationPanel.checkElement();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка наличия ссылки OBSESSED DESIGN")
    @DisplayName("Проверка наличия ссылки OBSESSED DESIGN в навигационной панели главной страницы")
    void checkContainMainPageIconTest() {
        mainPage.openPage();
        navigationPanel.checkElementInList();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка кликабельности элементов навигационной панели")
    @DisplayName("Проверка кликабельности элементов страницы")
    void checkPageHeaderTest() {
        mainPage.openPage();
        navigationPanel.openLink()
                .checkHeader();

    }

}
