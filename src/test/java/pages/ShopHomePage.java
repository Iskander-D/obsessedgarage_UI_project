package pages;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopHomePage {

    private final ElementsCollection checkToList = $$("#ProductGridContainer");


    @Step("Проверить отображение не пустого списка элементов")
    public ShopHomePage checkElementList() {
        checkToList.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(1));
        return this;
    }
}
