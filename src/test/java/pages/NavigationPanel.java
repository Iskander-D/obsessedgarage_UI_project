package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NavigationPanel {
    private final SelenideElement
            checkToElement = $("#shopify-section-header"),
            checkToElementInList = $$("#meteor-desktop-nav").find(text("OBSESSED DESIGN")),
            openToLink = $$("#meteor-desktop-nav").find(text("SHOP LIFE")),
            checkToHeader = $(".hero__text-wrap");

    @Step("Проверяем наличие элемента SHOP GARAGE в списке ссылок ")
    public NavigationPanel checkElement() {
        checkToElement.shouldHave(text("SHOP GARAGE"));
        return this;
    }

    @Step("Проверяем наличие ссылки OBSESSED DESIGN")
    public NavigationPanel checkElementInList() {
        checkToElementInList.shouldBe(exist);
        return this;
    }

    @Step("Открываем ссылку Open Box/Discount")
    public NavigationPanel openLink() {
        openToLink.click();
        return this;
    }

    @Step("Проверяем наличие заголовка открывшейся страницы MERCHANDISE ")
    public NavigationPanel checkHeader() {
        checkToHeader.shouldHave(text("MERCHANDISE"));
        return this;
    }
}
