package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            search = $(".site-header__search-input"),
            choseItem = $$("a.grid-item__link").findBy(text("CARPRO Reset")),
            addBasket = $(".product-single__form"),
            openToBasket = $(byText("View cart")),
            checkToBasket = $(".cart__item"),
    clearToBasket = $(byText("Clear cart")),
    finalCheckToBasket = $("#shopify-section-template--16098691350679__main");

    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    @Step("Вводим запрос в меню поиска")
    public MainPage searchItem() {
        search.setValue("Foam").pressEnter();
        return this;
    }

    @Step("Вводим запрос в меню поиска")
    public MainPage selectItem() {
        choseItem.click();
        return this;
    }

    @Step("Добавляем товар в корзину ")
    public MainPage addToBasket() {
        addBasket.click();
        return this;
    }

    @Step("Переходим в корзину ")
    public MainPage openBasket() {
        openToBasket.click();
        return this;
    }

    @Step("Проверяем наличие товара в корзине ")
    public MainPage checkBasket() {
        checkToBasket.shouldBe(exist);
        return this;
    }
    @Step("Удаляем товар из корзины ")
    public MainPage clearBasket() {
        clearToBasket.click();
        return this;
    }
    @Step("Проверяем что товар отсутствует в корзине")
    public MainPage finalCheckBasket() {
        finalCheckToBasket.shouldBe(visible).shouldHave(text("Your cart is currently empty"));
        return this;
    }
}


