package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ReturnPage {
    private final SelenideElement
            textToReturnPage = $(".wysiwyg-font-size-x-large"),
            submitAtRequest = $("a.submit-a-request");


    @Step("Проверяем заголовок страницы Returns ")
    public ReturnPage checkTextReturnPage() {
        textToReturnPage.shouldHave(text("How do I start a Return?"));
        return this;
    }

    @Step("Открываем ссылку Submit a Request")
    public ReturnPage openSubmitRequestPage() {
        submitAtRequest.click();
        return this;
    }
}
