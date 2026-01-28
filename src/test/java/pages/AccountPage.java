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

            emailInput = element("#email"),
            passwordInput = element("#CustomerPassword");

    @Step("Перейти на страницу Аккаунта ")
    public AccountPage openAccountPage() {
        open("https://account.obsessedgarage.com/authentication/login?client_id=cb80a3d3-68b6-4c32-a4e6-e38b3b969334&locale=en&redirect_uri=%2Fauthentication%2Foauth%2Fauthorize%3Fclient_id%3Dcb80a3d3-68b6-4c32-a4e6-e38b3b969334%26locale%3Den%26nonce%3D574a0094-b984-431d-94d1-39b073d481e6%26redirect_uri%3Dhttps%253A%252F%252Faccount.obsessedgarage.com%252Fcallback%26region_country%3DDO%26response_type%3Dcode%26scope%3Dopenid%2Bemail%2Bcustomer-account-api%253Afull%26state%3DhWN88E0SDZKHiYcVz86BfBdy&region_country=DO");
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
