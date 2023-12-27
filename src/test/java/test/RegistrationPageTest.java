package test;

import data.TestDataFakers;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class RegistrationPageTest {
    @BeforeEach
    void setUp() {
        open("https://www.obsessedgarage.com/");
    }

    MainPage mainPage = new MainPage();
    TestDataFakers testDataFakers = new TestDataFakers();

    @Test
    @Tag("all-test")
    @Tag("smoke")
    @Owner("Aleksandr Drozenko")
    @Feature("Регистрация пользователя")
    @DisplayName("Регистрация нового пользователя")
    void registrationTest() {
        // step("Открываем главную страницу Obsessed Garage", () -> {
        //   mainPage.openPage();
        // });
        step("Открываем ссылку Account", () -> {
            mainPage.iconAccount();
        });
        step("Открываем ссылку Create account", () -> {
            mainPage.iconRegister();
        });
        step("Вводим данные пользователя", () -> {
            mainPage.setFirstName(testDataFakers.firstNameInput)
                    .setLastName(testDataFakers.lastNameInput)
                    .setUserEmail(testDataFakers.userEmailInput)
                    .setUserPassword(testDataFakers.userPassword);
        });
        step("Создаем пользователя нажимая кнопку Create ", () -> {
            mainPage.buttonCreate();
        });
        step("Проверяем данные по ссылке Account", () -> {
            mainPage.iconAccount();
        });
        step("Проверяем что данные о новом Пользователе отображаются", () -> {
            mainPage.checkInfoAccount();
        });
    }


    @Test
    @Tag("all-test")
    @Tag("smoke")
    @Owner("Aleksandr Drozenko")
    @Feature("Авторизация пользователя")
    @DisplayName("Авторизация нового пользователя")
    void loginTest() {
        // step("Открываем главную страницу Obsessed Garage", () -> {
        //   mainPage.openPage();
        // });
        step("Открываем ссылку Account", () -> {
            mainPage.iconAccount();
        });
        step("Вводим Email пользователя ", () -> {
            $("#CustomerEmail").setValue("drozenko21@gmail.com");
        });
        step("Вводим Password пользователя ", () -> {
            $("#CustomerPassword").setValue("363000000").pressEnter();
        });
        step("Открываем ссылку Account", () -> {
            mainPage.iconAccount();
        });
        step("Проверяем что данные о новом Пользователе отображаются", () -> {
            mainPage.checkInfoAccount();
        });
    }
}
