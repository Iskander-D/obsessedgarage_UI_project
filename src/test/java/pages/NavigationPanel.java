package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class NavigationPanel {
    private final SelenideElement


            openToShopHomePage = $$(".Meteor-Navigation__Link__desktop").findBy(text("SHOP HOME")),
            openToNewProduct = $$(".Meteor-Navigation__Link__desktop").findBy(text("NEW PRODUCTS"));


    @Step("Открыть страницу SHOP HOME")
    public NavigationPanel openShopHomePage() {
        openToShopHomePage.click();
        return this;
    }

    @Step("Открыть страницу New Products")
    public NavigationPanel openNewProductsPage() {
        openToNewProduct.click();
        return this;
    }

}