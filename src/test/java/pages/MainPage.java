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
            openToNewProduct = $$(".Meteor-Navigation__Link__desktop").findBy(text("NEW PRODUCTS")),
            openToSupportPage = $("#FooterMenus");


    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    @Step("Открыть ссылку Support")
    public MainPage openSupportPage() {
        openToSupportPage.find(byText("Support")).click();
        return this;
    }

    @Step("Ввести запрос в меню поиска")
    public MainPage searchItem(String searchQuery) {
        search.setValue(searchQuery).pressEnter();
        return this;
    }

    @Step("Открыть страницу New Products")
    public MainPage openNewProductsPage() {
        openToNewProduct.click();
        return this;
    }


}


