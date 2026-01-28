package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.BasketPage;
import pages.ItemPage;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование функционала корзины")
@Tag("ui")
@DisplayName("Тестирование функционала добавления и удаления товара")
public class BasketPageTest extends TestBase {
    ItemPage itemPage = new ItemPage();
    BasketPage basketPage = new BasketPage();

    @Severity(SeverityLevel.NORMAL)
    @ValueSource(strings = {"cleaner", "tools"})
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
    @ValueSource(strings = {"karcher", "Ledermax"})
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
                  .finalCheckBasket("Your cart is empty, but your garage does not have to be!");
    }

    @Severity(SeverityLevel.NORMAL)
    @ValueSource(strings = {"karcher", "cleaner"})
    @ParameterizedTest(name = "Добавляем товар: {0}")
    @Story("Увеличение количества товаров в корзине")
    @DisplayName("Проверка увеличения количества товара в корзине.")
    void checkQuantityInBasketTest(String searchQuery) {
        mainPage.openPage()
                .searchItem(searchQuery);
        searchPage.openFirstProductInList();
        itemPage.addQuantityItem("2")
                .addToBasket();
        basketPage.openBasket()
                  .checkQuantityItem();


    }
}
