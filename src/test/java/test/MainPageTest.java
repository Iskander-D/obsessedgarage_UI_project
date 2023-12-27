package test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.MainPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPageTest { //сделать extend tast Base

    @BeforeEach
    void setUp() {
        open("https://www.obsessedgarage.com/");
    }

    MainPage mainPage = new MainPage();

    @Owner("Aleksandr Drozenko")
    @CsvFileSource(resources = "/testData/searchResultShouldContainExpectedText.csv", delimiter = '|')
    @Feature("Поисковые запросы")
    @Story("Проверка наличия значений в посковой строке")
    @DisplayName("Проверка необходимых значений в поисковой строке")
    @ParameterizedTest(name = "Для поискового запроса {0} есть карточка с именем {1}")
    @Tag("all-test")
    @Tag("simple")
    void searchResultShouldContainText(String searchQuery, String expectedName) {
        step("Открываем главную страницу Obsessed Garage", () -> {
            mainPage.openPage();
        });
        $(".site-header__search-input").setValue(searchQuery).pressEnter();
        $("#MainContent").shouldHave(text(expectedName));
    }


    @Test
    @Owner("Aleksandr Drozenko")
    @Tag("all-test")
    @Tag("simple")
    @Feature("Навигационная панель")
    @Story("Проверка наличия элемента навигационной панели")
    @DisplayName("Проверка наличия элемента Garage Design в навигационной панели главной страницы")
    void checkMainPageIcon() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие элемента Garage Design в списке ссылок ", () -> {
            $("#shopify-section-header").shouldHave(text("Garage Design"));
        });
    }

    @Test
    @Owner("Aleksandr Drozenko")
    @Tag("all-test")
    @Tag("simple")
    @Feature("Навигационная панель")
    @Story("Проверка наличия элемента в выпадающем списке")
    @DisplayName("Проверка наличия элемента из списка For the obsessed в навигационной панели главной страницы")
    void checkContainMainPageIcon() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие элемента For Customers в выпадающем списке FOR THE OBSESSED", () -> {
            $$(".site-nav__item").find(text("FOR THE OBSESSED"))
                    .hover().shouldHave(text("For Customers"));
        });
    }

    @Test
    @Owner("Aleksandr Drozenko")
    @Tag("all-test")
    @Tag("simple")
    @Feature("Добавление товара в корзину")
    @Story("Проверка наличия товара в корзине")
    @DisplayName("Проверка наличия товара в корзине после его добавления")
    void putItemInCart() {
        // step("Открываем главную страницу Obsessed Garage", () -> {
        // mainPage.openPage();
        // });
        step("Вбиваем в поисе название товара", () -> {
            $(".site-header__search-input").setValue("Foam").pressEnter();
        });
        step("Выбираем товар ", () -> {
            $$("a.grid-item__link").findBy(text("CARPRO Reset")).click();
        });
        step("Добавляем товар в корзину ", () -> {
            $("#AddToCartForm-template--16098694594711__main-7644593520791").click();
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

    @Test
    @Owner("Aleksandr Drozenko")
    @Tag("all-test")
    @Tag("simple")
    @Feature("Навигационная панель")
    @Story("Проверка кликабельности элементов навигационной панели")
    @DisplayName("Проверка кликабельности элементов страницы")
    void checkPageHeader() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            mainPage.openPage();
        });
        step("Открываем ссылку Open Box/Discount", () -> {
            $$(".site-nav__item").find(text("Open Box/Discount")).click();
        });
        step("Проверяем наличие заголовка открывшейся страницы Matty's Trinkets & Treasures ", () -> {
            $("h1.section-header__title").shouldHave(text("Matty's Trinkets & Treasures"));
        });
    }


}



