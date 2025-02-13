package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ShopHomePage {
    private final SelenideElement

            openToShopHafeleProductsPage = $("#MainContent").$(byText("SHOP Hafele Products"));

    @Step("Открыть вкладку SHOP Hafele Products")
    public ShopHomePage openShopHafeleProductsPage() {
        openToShopHafeleProductsPage.click();
        return this;
    }
}
