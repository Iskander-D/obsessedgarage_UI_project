package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class AffiliatePage {

    private final SelenideElement
            signAtIn = $(".hero__link"),
            setAtEmail = $("#email"),
            setAtName = $("#last_name"),
            setAtPassword = $("#password"),
            setAtDescription = $("#custom_56459"),
            selectAtCountry = $("#country");

    @Step("Выбрать страну  ")
    public AffiliatePage selectCountry(String value) {
        selectAtCountry.click();
        selectAtCountry.find(byText(value)).click();
        return this;
    }


    @Step("Нажать Sign Up Here ")
    public AffiliatePage signUpHere() {
        signAtIn.find(byText("Sign Up Here")).click();
        return this;
    }

    @Step("Ввести Email ")
    public AffiliatePage setEmail(String value) {
        setAtEmail.setValue(value);
        return this;
    }

    @Step("Проверка строки Email")
    public AffiliatePage checkResultEmail() {
        setAtEmail.shouldBe(visible);
        return this;
    }

    @Step("Ввести Имя ")
    public AffiliatePage setName(String value) {
        setAtName.setValue(value);
        return this;
    }

    @Step("Проверка строки Имя")
    public AffiliatePage checkResultName() {
        setAtName.shouldBe(visible);
        return this;
    }

    @Step("Ввести пароль")
    public AffiliatePage setPassword(String value) {
        setAtPassword.setValue(value);
        return this;
    }

    @Step("Проверить строку 'пароль' ")
    public AffiliatePage checkPassword() {
        setAtPassword.shouldBe(visible);
        return this;
    }

    @Step("Ввести комментарий к форме ")
    public AffiliatePage setDescription(String value) {
        setAtDescription.setValue(value);
        return this;
    }

    @Step("Проверить строку 'комментарий к форме' ")
    public AffiliatePage checkResultDescription() {
        setAtDescription.shouldBe(visible);
        return this;

    }

    @Step("Проверить строку 'комментарий к форме' ")
    public AffiliatePage checkCountry(String value) {
        selectAtCountry.shouldHave(text(value));
        return this;

    }
}
