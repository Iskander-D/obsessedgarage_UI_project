package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NavigationPanel {
    private final SelenideElement

            findToElementInList = $$(".Meteor-Navigation__Link__desktop").findBy(text("NEW PRODUCTS")),
            checkToList = $(".page-width"),
            openToLink = $$(".Meteor-Navigation__Link__desktop").findBy(text("SHOP GARAGE")),

            findToByBrand = $(".meteor-menu").$(byText("Audio")),

            checkToText = $(".section-header__title");





    @Step("Проверяем наличие заголовка New Products")
    public NavigationPanel checkText() {
        checkToText.shouldHave(text("New Products"));
        return this;
    }
    @Step("Открываем ссылку New Products")
    public NavigationPanel findElementInList() {
        findToElementInList.click();
        return this;
    }

    @Step("Проверяем отображение не пустого списка эементов")
    public NavigationPanel checkElementInList() {
        checkToList.shouldBe(visible);
        return this;
    }
    @Step("Проверяем отображение не пустого списка эементов")
    public NavigationPanel checkElementList() {
        checkToList.shouldBe(visible);
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

    @Step("Проверяем наличие заголовка Audio Packages")
    public NavigationPanel checkTextPage() {
        checkToText.shouldHave(text("Audio Packages"));
        return this;

    }

}