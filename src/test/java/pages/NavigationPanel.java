package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NavigationPanel {
    private final SelenideElement
            checkToElement = $("#shopify-section-header"),
            findToElementInList = $$(".Meteor-Navigation__Link__desktop").findBy(text("NEW PRODUCTS")),
            checkToList = $("#CollectionAjaxContent"),
            openToLink = $$(".Meteor-Navigation__Link__desktop").findBy(text("SHOP GARAGE")),
            findToByBrand = $(".m-layout").$(byText("Audio")),
            checkToPage = $("#PageContainer");
    @Step("Проверяем наличие элемента SHOP GARAGE в списке ссылок ")
    public NavigationPanel checkElement() {
        checkToElement.shouldHave(text("SHOP GARAGE"));
        return this;
    }

    @Step("Открываем ссылку New Products")
    public NavigationPanel findElementInList() {
        findToElementInList.click();
        return this;
    }
    @Step("Проверяем отображение не пустого списка эементов")
    public NavigationPanel checkElementInList() {
        checkToList.click();
        return this;
    }


    @Step("Открываем ссылку SHOP GARAGE")
    public NavigationPanel openLink() {
        openToLink.hover();
        return this;
    }

    @Step("Открываем ссылку Audio")
    public NavigationPanel byAudio() {
       findToByBrand.click();
        return this;
    }
    @Step("Проверяем что страница отображается")
    public NavigationPanel  checkPage() {
        checkToPage.shouldBe(visible);
        return this;
    }
}
