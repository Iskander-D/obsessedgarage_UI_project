package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.BasketPage;
import pages.ItemPage;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование функционала корзины")
@Tag("ui")
@DisplayName("Тестирование функционала добавления и удаления товара")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasketPageTest extends TestBase {
    ItemPage itemPage = new ItemPage();
    BasketPage basketPage = new BasketPage();

    @Severity(SeverityLevel.NORMAL)
    @Order(8)
    @ValueSource(strings = {"sonic", "aid"})
    @ParameterizedTest(name = "Добавляем товар: {0}")
    @Story("Добавление товара в корзину")
    @DisplayName("Проверка наличия товара в корзине после его добавления.")
    void putItemToBasketTest(String searchQuery) {
        mainPage.openPage()
                .searchItem(searchQuery);
        searchPage.openFirstProductInList();
        itemPage.addToBasket();
        basketPage.openBasket()
                .checkBasket();
    }

    @Severity(SeverityLevel.NORMAL)
    @Order(9)
    @ValueSource(strings = {"grinder", "tool grid"})
    @ParameterizedTest(name = "Добавляем товар: {0}")
    @Story("Удаление товара из корзины")
    @DisplayName("Проверка удаления товара из корзины.")
    void deleteItemFromBasketTest(String value) {
        mainPage.openPage()
                .searchItem(value);
        searchPage.openFirstProductInList();
        itemPage.addToBasket();
        basketPage.openBasket()
                .checkBasket()
                .clearBasket()
                .finalCheckBasket();
    }

    @Severity(SeverityLevel.NORMAL)
    @Order(10)
    @ValueSource(strings = {"Detail Brush", "Sonic"})
    @ParameterizedTest(name = "Добавляем товар: {0}")
    @Story("Увеличение количества товаров в корзине")
    @DisplayName("Проверка увеличения количества товара в корзине.")
    void checkQuantityInBasketTest(String searchQuery) {
        mainPage.openPage()
                .searchItem(searchQuery);
        searchPage.openFirstProductInList();
        itemPage.addQuantityItem()
                .addToBasket();
        basketPage.openBasket()
                .checkQuantityItem();


    }
}
