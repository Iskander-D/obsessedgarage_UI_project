package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            search = $("#Inline-Search"),
            openToSupportPage = $("a[href='https://support.obsessedgarage.com']"),
            openToAffiliatePage = $("#FooterMenus"),
            checkToCurrency = $(".product-grid"),
            openToListCurrency = $(".localization-form");

//    private final ElementsCollection selectToCurrency = $$(".disclosure__item");

    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    @Step("Убираем Cooke")
    public void removeCooke() {
        executeJavaScript("arguments[0].style.display = 'none';", $(".kl-private-reset-css-Xuajs1"));
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
        openToAffiliatePage.find(byText("Affiliate")).scrollTo().click();
        return this;
    }


    @Step("Открыть список  денежных единиц")
    public MainPage openListCurrency() {
        openToListCurrency.click();
        return this;
    }

    @Step("Выбрать  страну {country} ")
    public MainPage selectCountry(String country) {
//        selectToCurrency.findBy(text(country)).click();
      $(byText(country)).shouldBe(Condition.visible).scrollTo().click();
        return this;
    }

    @Step("Проверить отображение денежной единицы {currency}")
    public MainPage checkThatCurrencyChanged(String currency) {
        checkToCurrency.shouldHave(text(currency)).shouldBe(exist);
        return this;
    }
}




