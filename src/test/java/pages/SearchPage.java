package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private final SelenideElement
            checkSearchResult = $("#MainContent"),
            choseItem = $(".product-card");


    @Step("Проверить результат поиска")
    public SearchPage checkResult(String expectedName) {
        checkSearchResult.shouldHave(text(expectedName));
        return this;
    }

    @Step("Выбрать товар")
    public SearchPage openFirstProductInList() {
        choseItem.click();
        return this;
    }
}
