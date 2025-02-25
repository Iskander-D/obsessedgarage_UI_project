package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.NavigationPanel;
import pages.NewProductsPage;
import pages.ShopHafeleProductsPage;
import pages.ShopHomePage;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка страниц навигационной панели")
@Tag("ui")
@DisplayName("Тестирование функционала страниц навигационной панели")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NavigationPanelTest extends TestBase {
    ShopHafeleProductsPage shopHafeleProductsPage = new ShopHafeleProductsPage();
    ShopHomePage shopHomePage = new ShopHomePage();
    NewProductsPage newProductsPage = new NewProductsPage();
    NavigationPanel navigationPanel = new NavigationPanel();

    @Test
    @Order(2)
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
    @Order(1)
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка открытия страницы Shop Hafele Products")
    @DisplayName("Проверка элементов страницы Shop Hafele Products")
    void openShopHafeleProductsPage()  {
        mainPage.openPage();
        navigationPanel.openShopHomePage();
        shopHomePage.openShopHafeleProductsPage();
        shopHafeleProductsPage.checkThatShopHafeleProductsPageOpened()
                .checkElementList();

    }
}
