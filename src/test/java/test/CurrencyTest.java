package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка изменения денежной единицы")
@Tag("ui")
@DisplayName("Проверка изменения денежной единицы ")

public class CurrencyTest extends TestBase {


    @CsvSource(value = {"wash", "audio"})
    @ParameterizedTest
    @DisplayName("Проверка изменения денежной единицы при выборе страны")
    void changeCurrencyTest(String searchQuery) {
        mainPage.openPage()
                .searchItem(searchQuery)
                .openListCurrency();
//        $x("//li[contains(., 'Croatia')]").click();
        $("#AnnouncementLocalizationcountry-filter-input").sendKeys("Brunei");

       $$(".disclosure__item").findBy(text("Brunei")).scrollIntoView(true).click();
//                .selectCountry("Belize")
      mainPage           .checkThatCurrencyChanged("BND");


    }
}
