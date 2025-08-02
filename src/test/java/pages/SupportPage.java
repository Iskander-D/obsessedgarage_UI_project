package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class SupportPage {
    private final SelenideElement

            openToReturnPage = $("#category-181");


    @Step("Открыть ссылку Returns")
    public SupportPage openReturnPage() {

        openToReturnPage.click();
        return this;
    }
}
