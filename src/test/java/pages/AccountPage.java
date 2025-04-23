package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class AccountPage {
    private final SelenideElement
            openToAccountPage = $(".site-nav").find(byText("Account")),
            emailInput = $("#CustomerEmail"),
            passwordInput = $("#CustomerPassword");

    @Step("Перейти на страницу Аккаунта ")
    public AccountPage openAccountPage() {
        openToAccountPage.click();
      return this;
    }

    @Step("Проверить видимость поля Email")
    public AccountPage verifyEmailFieldIsVisible() {
        emailInput.shouldBe(visible, ofSeconds(30));
        return this;
    }

    @Step("Ввести Email {email}")
    public AccountPage setEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    @Step("Проверить видимость поля Password")
    public AccountPage verifyPasswordFieldIsVisible() {
        passwordInput.shouldBe(visible, ofSeconds(30));
        return this;
    }

    @Step("Ввести Password {password}")
    public AccountPage setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    @Step("Убедиться что Password виден ")
    public AccountPage checkVisibilityPassword() {
        passwordInput.shouldBe(visible);
        return this;
    }

    @Step("Убедиться что Email виден ")
    public AccountPage checkVisibilityEmail() {
        emailInput.shouldBe(visible);
        return this;
    }

}
