package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SupportPage {
    private final SelenideElement

            openToReturnPage = $(".article-list ");


    @Step("Открываем ссылку Returns ")
    public SupportPage openReturnPage() {
        openToReturnPage.find(byText("Returns")).click();
        return this;
    }
}
