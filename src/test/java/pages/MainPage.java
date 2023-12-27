package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            searchIconAccount = $(".site-nav__link:nth-child(2) > .site-nav__icon-label"),
            searchIconRegister = $("#customer_register_link"),
            firstNameInput = $("#FirstName"),
            lastNameInput = $("#LastName"),
            userEmailInput = $("#Email"),
            userPassword = $("#CreatePassword"),
            buttonCreateAccount = $(".btn--full"),
            checkAccount = $(".grid"),
            searchItem = $(".site-header__search-input").setValue("Foam"),
            chooseItem = $$("a.grid-item__link").findBy(text("CARPRO Reset"));

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

    public MainPage searchNewItem() {
        searchItem.pressEnter();
        return this;
    }

    public MainPage chooseNewItem() {
        chooseItem.click();
        return this;
    }

}

