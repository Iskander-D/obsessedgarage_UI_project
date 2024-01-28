package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class RegistrationPage {

    private final SelenideElement
            searchIconAccount = $(".site-nav__link:nth-child(2) > .site-nav__icon-label"),
            searchIconRegister = $("#customer_register_link"),
            firstNameInput = $("#FirstName"),
            lastNameInput = $("#LastName"),
            userEmailInput = $("#Email"),
            userPassword = $("#CreatePassword"),
            buttonCreateAccount = $(".btn--full"),
            checkAccount = $(".grid"),
            customerEmail = $("#CustomerEmail"),
            customerPassword = $("#CustomerPassword"),
            search = $(".site-header__search-input");

    public RegistrationPage openPage() {
        open(baseUrl);
        return this;
    }

    public RegistrationPage searchItem() {
        search.setValue("Foam").pressEnter();
        return this;
    }

    public RegistrationPage iconAccount() {
        searchIconAccount.click();
        return this;
    }

    public RegistrationPage iconRegister() {
        searchIconRegister.click();
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserPassword(String value) {
        userPassword.setValue(value);
        return this;
    }

    public RegistrationPage buttonCreate() {
        buttonCreateAccount.click();
        return this;
    }

    public RegistrationPage checkInfoAccount() {
        checkAccount.should(Condition.exist);
        return this;
    }

    public RegistrationPage setCustomerEmail() {
        customerEmail.setValue("drozenko21@gmail.com");
        return this;
    }

    public RegistrationPage setCustomerPassword() {
        customerPassword.setValue("363000000").pressEnter();
        return this;
    }
}


