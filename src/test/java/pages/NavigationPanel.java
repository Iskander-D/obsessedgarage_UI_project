package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class NavigationPanel {
    private final SelenideElement


            openToHomePage = $$(".block").findBy(text("Home")),
            openToNewProduct = $$("#HeaderMenu-new-products").findBy(text("New Products"));


    @Step("Открыть страницу Home")
    public NavigationPanel openHomePage() {
        openToHomePage.click();
        return this;
    }

    @Step("Открыть страницу New Products")
    public NavigationPanel openNewProductsPage() {
        openToNewProduct.click();
        return this;
    }
    @Step("Открыть главную страницу")
    public MainPage openHomeMainPage() { //todo тут мы просто переписывам емотод из MainPage чтобы возвращать MainPage
        open(baseUrl);
        return page(MainPage.class);  // ← Selenide сам создаст/вернёт экземпляр MainPage
    }

    @Step("Открыть страницу поддержки (Support Page)")
    public MainPage openSupportPage() { //todo тут мы просто переписывам емотод из MainPage чтобы возвращать MainPage
        return page(MainPage.class);  // ← Selenide сам создаст/вернёт экземпляр MainPage
    }

}