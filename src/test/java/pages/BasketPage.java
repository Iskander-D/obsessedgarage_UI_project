package pages;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class BasketPage {
    private final SelenideElement
            choseItem = $(".grid-product__title"),
            addBasket = $(".product-single__form"),
            openToBasket = $(byText("View cart")),
            checkToBasket = $(".cart__item"),
            clearToBasket = $(byText("Clear cart")),
            finalCheckToBasket = $("#shopify-section-template--16098691350679__main"),
            addAtQuantityItem = $(".icon-plus");
    private ElementsCollection checkAtQuantityItem = $$(".hidden-label");


    @Step("Выбрать товар")
    public BasketPage selectItem() {
        choseItem.click();
        return this;
    }

    @Step("Добавить товар в корзину ")
    public BasketPage addToBasket() {
        addBasket.click();
        return this;
    }

    @Step("Перейти в корзину ")
    public BasketPage openBasket() {
        openToBasket.click();
        return this;
    }

    @Step("Проверить наличие товара в корзине ")
    public BasketPage checkBasket() {
        checkToBasket.shouldBe(exist);
        return this;
    }

    @Step("Удалить товар из корзины ")
    public BasketPage clearBasket() {
        clearToBasket.click();
        return this;
    }

    @Step("Проверить что товар отсутствует в корзине")
    public BasketPage finalCheckBasket() {
        finalCheckToBasket.shouldBe(visible).shouldHave(text("Your cart is currently empty"));
        return this;
    }

    @Step("Увеличить количество товар в корзине")
    public BasketPage addQuantityItem() {
        addAtQuantityItem.click();
        return this;
    }

    @Step("Проверить количество товар в корзине")
    public BasketPage checkQuantityItem() {
        checkAtQuantityItem.shouldHave(CollectionCondition.sizeGreaterThan(1));
        return this;
    }


}
