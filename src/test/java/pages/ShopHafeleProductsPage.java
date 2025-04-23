package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopHafeleProductsPage {
    private final SelenideElement

            checkShopHafeleProductsPageOpened = $(".enlarge-text");

    private final ElementsCollection checkToList = $$("#CollectionAjaxContent");

    @Step("Проверить наличие заголовка Premier Kitchen Organization and Hardware")
    public ShopHafeleProductsPage checkThatShopHafeleProductsPageOpened() {
        checkShopHafeleProductsPageOpened.shouldHave(text("The kitchen is undoubtedly one of the most visited spaces in the home. We go here to cook, clean, and congregate with family and friends. What’s frustrating is when things are out of order, whether that be a spoon missing, a pot in the wrong spot, or some other cooking utensil we need that’s nowhere to be found."));
        return this;
    }

    @Step("Проверить отображение не пустого списка элементов")
    public ShopHafeleProductsPage checkElementList() {
        checkToList.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(1));
        return this;
    }
}