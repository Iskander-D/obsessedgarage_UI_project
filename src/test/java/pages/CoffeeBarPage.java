package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CoffeeBarPage {
    private final SelenideElement

            openToCoffeeBarPage = $("#MainContent").$(byText("Shop"));

    @Step("Открыть товар SHOP Coffee Products")
    public CoffeeBarPage openCoffeeBarPage() {
        openToCoffeeBarPage.click();
        return this;
    }
}
