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
        basketPage.selectItem()
                .addToBasket()
                .openBasket()
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
        basketPage.selectItem()
                .addToBasket()
                .openBasket()
                .checkBasket()
                .clearBasket()
                .finalCheckBasket();
    }

}
