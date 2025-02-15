package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SupportPage {
    private final SelenideElement

            openToReturnPage = $("#category-178");

    @Step("Открыть ссылку Shipping & Returns")
    public SupportPage openReturnPage() {

        openToReturnPage.click();
        return this;
    }
}
