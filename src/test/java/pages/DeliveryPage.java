package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DeliveryPage {
    private final SelenideElement
            textToDeliveryPage = $("#categoryHead");

    private ElementsCollection checkToArticleList = $$(".articleList li");


    @Step("Проверить заголовок страницы Shipping & Delivery")
    public DeliveryPage checkTextDeliveryPage() {
        textToDeliveryPage.shouldHave(text("Shipping & Delivery"));
        return this;
    }

    @Step("Проверить в списке  Shipping & Delivery более 4 параграфов")
    public DeliveryPage checkArticleList() {
        checkToArticleList.shouldHave(CollectionCondition.sizeGreaterThan(4));
        return this;
    }
}
