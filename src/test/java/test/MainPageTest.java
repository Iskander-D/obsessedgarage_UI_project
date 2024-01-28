package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование общего функционала страници")
@Tags({@Tag("ui"), @Tag("all_page_test")})
public class MainPageTest extends TestBase {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка титла ")
    @DisplayName("Проверка заголовка главной страницы")
    void checkPageTitleTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
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
    @ParameterizedTest(name = "Для поискового запроса {0} есть карточка с именем {1}")
    @Tag("all-test")
    @Tag("simple")
    void searchResultShouldContainTextTest(String searchQuery, String expectedName) {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Вводим поисковой запрос", () -> {
        $(".site-header__search-input").setValue(searchQuery).pressEnter();
        });
        step("Проверяем наличие товаров по запросу", () -> {
        $("#MainContent").shouldHave(text(expectedName));
        });
    }


    @Test
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Story("Добавление товара в корзину")
    @DisplayName("Проверка наличия товара в корзине после его добавления")
    void putItemInCartTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Вбиваем в поисе название товара", () -> {
            $(".site-header__search-input").setValue("Foam").pressEnter();
        });
        step("Выбираем товар ", () -> {
            $$("a.grid-item__link").findBy(text("CARPRO Reset")).click();
        });
        step("Добавляем товар в корзину ", () -> {
            $(".product-single__form").click();
        });
        step("Переходим в корзину ", () -> {
            $(byText("View cart")).click();
        });
        step("Проверяем наличие товара в корзине ", () -> {
            $(".cart__item").shouldBe(exist);
        });


    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Story("Удаление товара из корзины")
    @DisplayName("Проверка наличия товара в корзине после его удаления")
    void deleteItemInCartTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Вбиваем в поисе название товара", () -> {
            $(".site-header__search-input").setValue("Foam").pressEnter();
        });
        step("Выбираем товар ", () -> {
            $$("a.grid-item__link").findBy(text("CARPRO Reset")).click();
        });
        step("Добавляем товар в корзину ", () -> {
            $(".product-single__form").click();
        });
        step("Переходим в корзину ", () -> {
            $(byText("View cart")).click();
        });
        step("Проверяем наличие товара в корзине ", () -> {
            $(".cart__item").shouldBe(exist);
        });
        step("Удаляем товар из корзины ", () -> {
            $(byText("Clear cart")).click();
        });
        step("Проверяем что товар отсутствует в корзине ", () -> {
            $("#shopify-section-template--16098691350679__main").shouldBe(visible).shouldHave(text("Your cart is currently empty"));
        });
    }


}






