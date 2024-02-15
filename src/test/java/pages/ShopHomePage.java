package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ShopHomePage {
    private final SelenideElement

            openToShopCoffeeProducts = $(".page-container").$(byText("SHOP Coffee Products"));

    @Step("Открыть товар SHOP Coffee Products")
    public ShopHomePage openShopCoffeeProducts() {
        openToShopCoffeeProducts.click();
        return this;
    }
}
