package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование общего функционала страници")
@Tag("ui")
@DisplayName("Тестирование функционала главной страницы")
public class MainPageTest extends TestBase {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка титла ")
    @DisplayName("Проверка заголовка главной страницы")
    void checkPageTitleTest() {
        mainPage.openPage();
        step("Проверяем титл главной страницы", () -> {
            String expectedTitle = "Obsessed Garage | Home Of The Obsessed";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @CsvFileSource(resources = "/searchResultShouldContainExpectedText.csv", delimiter = '|')
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка наличия значений в посковой строке")
    @DisplayName("Проверка необходимых значений в поисковой строке")
    @ParameterizedTest(name = "Для поискового запроса {0} есть товар с именем {1}")
    @Tag("all-test")
    @Tag("simple")
    void searchResultShouldContainTextTest(String searchQuery, String expectedName) {
        mainPage.openPage();
        step("Вводим поисковой запрос", () -> {
            $(".site-header__search-input").setValue(searchQuery).pressEnter();
        });
        step("Проверяем наличие товаров по запросу", () -> {
            $("#MainContent").shouldHave(text(expectedName));
        });
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Добавление товара в корзину")
    @DisplayName("Проверка наличия товара в корзине после его добавления")
    void putItemToBasketTest() {

        mainPage.openPage()
                .searchItem()
                .selectItem()
                .addToBasket()
                .openBasket()
                .checkBasket();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Удаление товара из корзины")
    @DisplayName("Проверка наличия товара в корзине после его удаления")
    void deleteItemInBasketTest() {
        mainPage.openPage()
                .searchItem()
                .selectItem()
                .addToBasket()
                .openBasket()
                .checkBasket()
                .clearBasket()
                .finalCheckBasket();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка открытия страницы <Связаться с нами>  ")
    @DisplayName("Проверка отображения формы для отправки запроса")
    void emailSubscribeTest() {
        mainPage.openPage()
                .contactMenu()
                .checkPage();
    }
}






