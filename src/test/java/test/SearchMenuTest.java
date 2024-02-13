package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование функционала поиска")
@Tag("ui")
@DisplayName("Тестирование функционала поиска")
public class SearchMenuTest extends TestBase {

    @CsvFileSource(resources = "/searchResultShouldContainExpectedText.csv", delimiter = '|')
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка поиска товара")
    @DisplayName("Проверка поиска товара")
    @ParameterizedTest(name = "При поиске товара {0} в списке есть товар {1}")
    @Tag("all-test")
    @Tag("simple")
    void searchResultShouldContainTextTest(String searchQuery, String expectedName) {
        mainPage.openPage()
                .searchItem(searchQuery)
                .checkResult(expectedName);
    }
}
