package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

public class AccountPage {
    private final SelenideElement
//            openToAccountPage = $x("//a[contains(@href, 'customer_authentication/login')]"),

            emailInput = $("#email"),
            passwordInput = $("#CustomerPassword");

    @Step("Перейти на страницу Аккаунта ")
    public AccountPage openAccountPage() {
        open("https://account.obsessedgarage.com/authentication/login?client_id=aabed6c6-61b5-4941-a484-69c91271311f&locale=en&redirect_uri=https://account.obsessedgarage.com/authentication/oauth/authorize%3Fclient_id%3Daabed6c6-61b5-4941-a484-69c91271311f%26consent_id%3D%26locale%3Den%26nonce%3Dbea4810a-e760-4a66-97da-f989b9c835bc%26redirect_uri%3Dhttps%253A%252F%252Fwww.obsessedgarage.com%252Fcustomer_authentication%252Fcallback%253Fsource%253Dcore%26response_type%3Dcode%26scope%3Dopenid%2Bemail%2Bcustomer-account-api%253Afull%26state%3D01K317VK6ENQ5G5TAWRM8SS8YE");
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
