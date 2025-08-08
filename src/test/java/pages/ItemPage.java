package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ItemPage {
    private final SelenideElement
            addBasket = $(".product-form__buttons"),
            addAtQuantityItem = $(".quantity__input");

    @Step("Добавить товар в корзину ")
    public ItemPage addToBasket() {
        addBasket.click();
        return this;
    }

    @Step("Увеличить количество товар в корзине")
    public ItemPage addQuantityItem() {
        addAtQuantityItem.clear();
        addAtQuantityItem.setValue("3");
        return this;
    }
}
