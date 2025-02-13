package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SupportPage {
    private final SelenideElement

            openToReturnPage = $(".category");

    @Step("Открыть ссылку Shipping & Returns")
    public SupportPage openReturnPage() {
        openToReturnPage.find(byText("Shipping & Returns")).click();
        return this;
    }
}
