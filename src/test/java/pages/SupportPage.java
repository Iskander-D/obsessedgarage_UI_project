package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SupportPage {
    private final SelenideElement

            openArticles = $(".article-list ");


    @Step("Открываем ссылку Returns ")
    public SupportPage openReturnPage() {
        openArticles.find(byText("Returns")).click();
        return this;
    }
}
