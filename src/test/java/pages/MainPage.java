package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.error.ShouldBe.shouldBe;

public class MainPage {
    private final SelenideElement
            search = $(".site-header__search-input"),
            checkSearchResult= $("#MainContent"),

            contactUS = $(byText("CONTACT US")),
            checkToPage = $(".container");


    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    @Step("Вводим запрос в меню поиска")
    public MainPage searchItem(String searchQuery) {
        search.setValue(searchQuery).pressEnter();
        return this;
    }
    @Step("Проверяем результат поиска")
    public MainPage checkResult(String expectedName) {
        checkSearchResult.shouldHave(text(expectedName));
        return this;
    }



    @Step("Находим ссылку Связаться с нами ")
    public MainPage contactMenu() {
        contactUS.click();
        return this;
    }

    @Step("Проверяем что открылась страница для отправки запроса")
    public MainPage checkPage() {
        checkToPage.shouldBe(visible).shouldHave(text("Submit a request"));
        return this;
    }


}


