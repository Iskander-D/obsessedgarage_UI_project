package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NewProductsPage {
    private final SelenideElement
            checkToText = $("#shopify-section-template--18159877292183__rich_text_yAwnji");

    private ElementsCollection checkToList = $$("#ProductGridContainer");

    @Step("Проверка наличие заголовка Check Out These Other Collections")
    public NewProductsPage checkThatNewProductsPageOpened() {
        checkToText.shouldHave(text("Check Out These Other Collections"));
        return this;
    }

    @Step("Проверить отображение не пустого списка эементов")
    public NewProductsPage checkElementList() {
        checkToList.shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }
}

