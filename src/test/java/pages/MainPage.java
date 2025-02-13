package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            search = $(".site-header__search-input"),
            openToSupportPage = $("a[href='https://support.obsessedgarage.com']"),
            openToAffiliatePage = $("#FooterMenus"),
            checkToCurrency = $(".grid-product__price--from"),
            openToListCurrency = $(".disclosure-list__label"),
            selectToCurrency = $$(".disclosure-list__label").findBy(text("MUR"));


    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    @Step("Открыть ссылку SUPPORT PAGE")
    public MainPage openSupportPage() {
        openToSupportPage.click();
        return this;
    }

    @Step("Ввести запрос в меню поиска")
    public MainPage searchItem(String searchQuery) {
        search.setValue(searchQuery).pressEnter();
        return this;
    }

    @Step("Открыть страницу Affiliate")
    public MainPage openAffiliatePage() {
        openToAffiliatePage.find(byText("Affiliate")).click();
        return this;
    }


    @Step("Открыть список  денежных единиц")
    public MainPage openListCurrency() {
        openToListCurrency.click();
        return this;
    }

    @Step("Выбрать  денежную единицу MUR")
    public MainPage selectCurrency() {
        selectToCurrency.click();
        return this;
    }

    @Step("Проверить отображение денежной единицы Rs")
    public MainPage checkThatCurrencyChanged() {
        checkToCurrency.shouldHave(text("Rs")).shouldBe(exist);
        return this;
    }
}




