package test;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование функционала корзины")
@Tag("ui")
@DisplayName("Тестирование функционала добавления и удаления товара")
public class BasketPageTest extends TestBase {
    @Severity(SeverityLevel.NORMAL)
    @ValueSource(strings = {"sonic", "carpro"})
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
    @ValueSource(strings = {"koch", "tool grid"})
    @ParameterizedTest(name = "Добавляем товар: {0}")
    @Story("Удаление товара из корзины")
    @DisplayName("Проверка наличия товара в корзине после его удаления.")
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
    @ValueSource(strings = {"Angelwax", "Pressol"})
    @ParameterizedTest(name = "Добавляем товар: {0}")
    @Story("Увеличение количества товаров в корзине")
    @DisplayName("Проверка увеличения количества товара в корзине.")
    void checkQuantityInBasket(String searchQuery) {
        mainPage.openPage()
                .searchItem(searchQuery);
        searchPage.openFirstProductInList();
        itemPage.addQuantityItem()
                .addToBasket();
        basketPage.openBasket()
                .checkQuantityItem();


    }
}
