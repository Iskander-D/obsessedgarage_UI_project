package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class RequestPage {

    private final SelenideElement
            setAtEmail = $("#request_anonymous_requester_email"),
            setAtName = $("#request_custom_fields_18258189708951"),
            setAtNumberOrder = $("#request_custom_fields_360052201613"),
            setAtSubject = $("#request_subject");


    @Step("Ввести Email ")
    public RequestPage setEmail(String value) {
        setAtEmail.setValue(value);
        return this;
    }

    @Step("Проверка строки Email")
    public RequestPage checkResultEmail() {
        setAtEmail.shouldBe(visible);
        return this;
    }

    @Step("Ввести Имя ")
    public RequestPage setName(String value) {
        setAtName.setValue(value);
        return this;
    }

    @Step("Проверка строки Имя ")
    public RequestPage checkResultName() {
        setAtName.shouldBe(visible);
        return this;
    }

    @Step("Ввести номер заказа ")
    public RequestPage setNumberOrder(String value) {
        setAtNumberOrder.setValue(value);
        return this;
    }

    @Step("Проверка строки 'номер заказа' ")
    public RequestPage checkResultNumberOrder() {
        setAtNumberOrder.shouldBe(visible);
        return this;
    }

    @Step("Ввести наименование продукта")
    public RequestPage setSubject(String value) {
        setAtSubject.setValue(value);
        return this;
    }

    @Step("Проверка строки 'наименование продукта' ")
    public RequestPage checkResultSubject() {
        setAtSubject.shouldBe(visible);
        return this;

    }
}
