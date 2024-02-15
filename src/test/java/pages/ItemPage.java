package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {
    private final SelenideElement
            addBasket = $(".product-single__form"),
            addAtQuantityItem = $(".icon-plus");

    @Step("Добавить товар в корзину ")
    public ItemPage addToBasket() {
        addBasket.click();
        return this;
    }

    @Step("Увеличить количество товар в корзине")
    public ItemPage addQuantityItem() {
        addAtQuantityItem.click();
        return this;
    }
}
