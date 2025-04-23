package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.NavigationPanel;
import pages.NewProductsPage;
import pages.ShopHafeleProductsPage;
import pages.ShopHomePage;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка страниц навигационной панели")
@Tag("ui")
@DisplayName("Тестирование функционала страниц навигационной панели")
public class NavigationPanelTest extends TestBase {
    ShopHafeleProductsPage shopHafeleProductsPage = new ShopHafeleProductsPage();
    ShopHomePage shopHomePage = new ShopHomePage();
    NewProductsPage newProductsPage = new NewProductsPage();
    NavigationPanel navigationPanel = new NavigationPanel();

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
    @Story("Проверка открытия страницы Shop Hafele Products")
    @DisplayName("Проверка элементов страницы Shop Hafele Products")
    void openShopHafeleProductsPage() {
        mainPage.openPage();
        navigationPanel.openShopHomePage();
        shopHomePage.openShopHafeleProductsPage();
        shopHafeleProductsPage.checkThatShopHafeleProductsPageOpened()
                .checkElementList();

    }
}
