package pages;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class BasketPage {
    private final SelenideElement


            openToBasket = $(byText("View cart")),
            checkToBasket = $(".cart__item"),
            clearToBasket = $(byText("Clear cart")),
            finalCheckToBasket = $(".section-header ");

    private final ElementsCollection checkAtQuantityItem = $$(".hidden-label");


    @Step("Перейти в корзину")
    public BasketPage openBasket() {
        openToBasket.click();
        return this;
    }

    @Step("Проверить наличие товара в корзине")
    public BasketPage checkBasket() {
        checkToBasket.shouldBe(exist);
        return this;
    }

    @Step("Удалить товар из корзины")
    public BasketPage clearBasket() {
        clearToBasket.click();
        return this;
    }

    @Step("Проверить что товар отсутствует в корзине")
    public BasketPage finalCheckBasket(String value) {
        finalCheckToBasket.shouldBe(visible).shouldHave(text(value));
        return this;
    }


    @Step("Проверить количество товар в корзине")
    public BasketPage checkQuantityItem() {
        checkAtQuantityItem.shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }


}
