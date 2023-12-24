package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final SelenideElement
            searchIconAccount = $(".site-nav__link:nth-child(2) > .site-nav__icon-label"),
            searchIconRegister = $("#customer_register_link"),
            firstNameInput = $("#FirstName"),
            lastNameInput = $("#LastName"),
            userEmailInput = $("#Email"),
            userPassword = $("#CreatePassword"),
            buttonCreateAccount = $(".btn--full"),
            checkAccount = $(".grid");

    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    public MainPage iconAccount() {
        searchIconAccount.click();
        return this;
    }

    public MainPage iconRegister() {
        searchIconRegister.click();
        return this;
    }

    public MainPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public MainPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public MainPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public MainPage setUserPassword(String value) {
        userPassword.setValue(value);
        return this;
    }

    public MainPage buttonCreate() {
        buttonCreateAccount.click();
        return this;
    }
    public MainPage checkInfoAccount() {
        checkAccount.should(Condition.visible);
        return this;
    }
}

