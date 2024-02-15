package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopCoffeeProductsPage {
    private final SelenideElement

            checkNewShopCoffeeProductsPageOpened = $(".section-header__title");
    private ElementsCollection checkToList = $$(".grid-item__content");

    @Step("Проверить наличие заголовка Coffee")
    public ShopCoffeeProductsPage checkThatNewShopCoffeeProductsPageOpened() {
        checkNewShopCoffeeProductsPageOpened.shouldHave(text("Coffee"));
        return this;
    }

    @Step("Проверить отображение не пустого списка эементов")
    public ShopCoffeeProductsPage checkElementList() {
        checkToList.shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }
}