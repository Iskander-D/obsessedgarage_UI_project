package test;

import data.Currency;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка изменения денежной единицы")
@Tag("ui")
@DisplayName("Проверка изменения денежной единицы ")

public class CurrencyTest extends TestBase {

    @EnumSource(Currency.class)
//    @CsvSource(value = {"wash", "audio"})
    @ParameterizedTest(name = "Проверка изменения валюты при выборе страны: {0}")
    @DisplayName("Проверка изменения денежной единицы при выборе страны")
    void changeCurrencyTest(Currency currency) {
        mainPage.openPage()
                .searchItem("audio")
                .openListCurrency()
                .findCountry(currency.name())
                .selectCountry(currency.name())
                .checkThatCurrencyChanged(currency.label);


    }
}
