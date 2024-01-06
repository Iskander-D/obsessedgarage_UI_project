package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Epic("UI")
public class MainPageTest extends TestBase {

    @Test
    @Tag("all-test")
    @Tag("simple")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Титл главной страницы")
    @Story("Проверка титла ")
    @DisplayName("Проверка заголовка главной страницы")
    void checkPageTitle() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Проверяем титл главной страницы", () -> {
            String expectedTitle = "Obsessed Garage | Home Of The Obsessed";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @CsvFileSource(resources = "/testData/searchResultShouldContainExpectedText.csv", delimiter = '|')
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Поисковые запросы")
    @Story("Проверка наличия значений в посковой строке")
    @DisplayName("Проверка необходимых значений в поисковой строке")
    @ParameterizedTest(name = "Для поискового запроса {0} есть карточка с именем {1}")
    @Tag("all-test")
    @Tag("simple")
    void searchResultShouldContainText(String searchQuery, String expectedName) {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        $(".site-header__search-input").setValue(searchQuery).pressEnter();
        $("#MainContent").shouldHave(text(expectedName));
    }


    @Test
    @Tag("all-test")
    @Tag("simple")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Добавление товара в корзину")
    @Story("Проверка наличия товара в корзине")
    @DisplayName("Проверка наличия товара в корзине после его добавления")
    void putItemInCart() {
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
        step("Закрываем окно добавления товара", () -> {
            $(".site-nav__close-cart").click();
        });
        step("Переходим в корзину ", () -> {
            $("#HeaderCartTrigger").click();
        });
        step("Проверяем наличие товара в корзине ", () -> {
            $(".cart__item-title").shouldBe(exist);
        });

    }


}






