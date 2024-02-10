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
            checkToElementInList = $$("a.Meteor-Navigation__Link__desktop").findBy(text("New Products")),
            checkTolist = $("#CollectionAjaxContent"),
            openToLink = $$("a.Meteor-Navigation__Link__desktop").find(text("SHOP GARAGE")),
            findToByBrand = $("[class=m-links-container]").$(byText("Audio")),
            checkToPage = $("#PageContainer");
    @Step("Проверяем наличие элемента SHOP GARAGE в списке ссылок ")
    public NavigationPanel checkElement() {
        checkToElement.shouldHave(text("SHOP GARAGE"));
        return this;
    }

    @Step("Открываем ссылку New Products")
    public NavigationPanel checkElementInList() {
        checkToElementInList.click();
        return this;
    }
    @Step("Проверяем отображение не пустого списка эементов")
    public NavigationPanel checkList() {
        checkTolist.shouldBe(visible);
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
