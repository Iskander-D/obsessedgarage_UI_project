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
            openToLink = $$(".Meteor-Navigation__Link__desktop").findBy(text("SHOP HOME")),

            openToItem= $(".page-container").$(byText("SHOP Coffee Products")),

            checkToText = $(".section-header__title");




    @Step("Проверяем наличие заголовка New Products")
    public NavigationPanel checkText() {
        checkToText.shouldHave(text("New Products"));
        return this;
    }
    @Step("Открываем страницу New Products")
    public NavigationPanel findElementInList() {
        findToElementInList.click();
        return this;
    }

    @Step("Открываем товар SHOP Coffee Products")
    public NavigationPanel openItem() {
        openToItem.click();
        return this;
    }
    @Step("Проверяем отображение не пустого списка эементов")
    public NavigationPanel checkElementList() {
        checkToList.shouldBe(visible);
        return this;
    }

    @Step("Открываем страницу SHOP HOME")
    public NavigationPanel openLink() {
        openToLink.click();
        return this;
    }

    @Step("Проверяем наличие заголовка Coffee")
    public NavigationPanel checkTextPage() {
        checkToText.shouldHave(text("Coffee"));
        return this;

    }

}