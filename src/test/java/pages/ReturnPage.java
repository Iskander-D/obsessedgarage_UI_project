package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ReturnPage {
    private final SelenideElement
            openArticles = $(".article-list "),
            textToReturnPage = $(".wysiwyg-font-size-x-large");
    @Step("Открываем ссылку Returns ")
    public ReturnPage openReturnPage() {
        openArticles.find(byText("Returns")).click();
        return this;
    }
    @Step("Проверяем заголовок страницы Returns ")
    public ReturnPage checkTextReturnPage() {
        textToReturnPage.shouldHave(text("How do I start a Return?"));
        return this;
    }
}
