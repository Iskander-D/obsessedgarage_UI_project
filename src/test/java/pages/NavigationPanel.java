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
            checkToElementInList = $$(".site-nav__item").find(text("OBSESSED DESIGN")),
            openToLink = $$(".site-nav__item").find(text("SHOP DISCOUNTS")),
            checkToHeader = $("h1.section-header__title");

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

    @Step("Проверяем наличие заголовка открывшейся страницы Matty's Trinkets & Treasures ")
    public NavigationPanel checkHeader() {
        checkToHeader.shouldHave(text("Matty's Trinkets & Treasures"));
        return this;
    }
}
