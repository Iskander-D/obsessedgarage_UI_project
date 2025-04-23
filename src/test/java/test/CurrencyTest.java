package test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка изменения денежной единицы")
@Tag("ui")
@DisplayName("Проверка изменения денежной единицы ")

public class CurrencyTest extends TestBase {


    @CsvSource(value = {"koch", "tool grid"})
    @ParameterizedTest
    @DisplayName("Проверка изменения денежной единицы")
    void changeCurrencyTest(String searchQuery) {
        mainPage.openPage()
                .searchItem(searchQuery)
                .openListCurrency()
                .selectCurrency("MUR")
                .checkThatCurrencyChanged("Rs");


    }
}
