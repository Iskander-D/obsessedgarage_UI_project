package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ReturnPage {
    private final SelenideElement
            textToReturnPage = $("#categoryHead");

    private ElementsCollection checkToArticleList = $$(".articleList li");


    @Step("Проверить заголовок страницы Returns")
    public ReturnPage checkTextReturnPage() {
        textToReturnPage.shouldHave(text("Shipping & Returns"));
        return this;
    }

    @Step("Проверить в списке  Shipping & Returns более 7 параграфов")
    public ReturnPage checkArticleList() {
        checkToArticleList.shouldHave(CollectionCondition.sizeGreaterThan(7));
        return this;
    }
}
