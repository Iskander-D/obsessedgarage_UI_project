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
            search = element("#Inline-Search"),
            openToSupportPage = element("a[href='https://support.obsessedgarage.com']"),
            openToAffiliatePage = element("#CollapsibleAccordion-collapsible_link_list_3H8mTj"),
            checkToCurrency = element(".product-grid"),
            openToListCurrency = element(".localization-form"),
            findToCountry = element("#AnnouncementLocalizationcountry-filter-input");

   private final ElementsCollection selectToCountry = elements(".disclosure__item");

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
    public MainPage selectввCountry(String country) {
//        selectToCurrency.findBy(text(country)).click();
        $(byText(country)).shouldBe(Condition.visible).scrollTo().click();
        return this;
    }

    @Step("Проверить отображение денежной единицы {currency}")
    public MainPage checkThatCurrencyChanged(String currency) {
        checkToCurrency.shouldHave(text(currency)).shouldBe(exist);
        return this;
    }

    @Step("Ввести значение страны {value} ")
    public MainPage findCountry(String value) {
        findToCountry.sendKeys(value);
        return this;
    }

    @Step("Выбрать страну в списке  {value} ")
    public MainPage selectCountry(String value) {
        selectToCountry.find(text(value)).scrollIntoView(true).click();
        return this;
    }

}




