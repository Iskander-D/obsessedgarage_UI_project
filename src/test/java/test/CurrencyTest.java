package test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка изменения денежной единицы")
@Tag("ui")
@DisplayName("Проверка изменения денежной единицы ")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CurrencyTest extends TestBase {


    @CsvSource(value = {"koch", "tool grid"})
    @Order(7)
    @ParameterizedTest
    @DisplayName("Проверка изменения денежной единицы")
    void changeCurrencyTest(String searchQuery) {
        mainPage.openPage()
                .searchItem(searchQuery)
                .openListCurrency()
                .selectCurrency()
                .checkThatCurrencyChanged();


    }
}
