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
    @DisplayName("Проверка элементов страницы New Products")
    void openNewProductsTest() {
        mainPage.openPage();
        navigationPanel.openNewProductsPage();
        newProductsPage.checkThatNewProductsPageOpened()
                .checkElementList();

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка открытия страницы SHOP Coffee Products")
    @DisplayName("Проверка элементов страницы SHOP Coffee Products")
    void openShopCoffeeProducts() {
        mainPage.openPage();
        navigationPanel.openShopHomePage();
        shopHomePage.openShopCoffeeProducts();
        shopCoffeeProducts.checkThatNewShopCoffeeProductsPageOpened()
                .checkElementList();

    }
}
