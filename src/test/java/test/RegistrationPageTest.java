package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

@Epic("UI")
public class RegistrationPageTest extends TestBase {

    @Test
    @Tag("all-test")
    @Tag("smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Регистрация пользователя")
    @DisplayName("Регистрация нового пользователя")
    void registrationTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Открываем ссылку Account", () -> {
            registrationPage.iconAccount();
        });
        step("Открываем ссылку Create account", () -> {
            registrationPage.iconRegister();
        });
        step("Вводим данные пользователя", () -> {
            registrationPage.setFirstName(testDataFakers.firstNameInput)
                    .setLastName(testDataFakers.lastNameInput)
                    .setUserEmail(testDataFakers.userEmailInput)
                    .setUserPassword(testDataFakers.userPassword);
        });
        step("Создаем пользователя нажимая кнопку Create ", () -> {
            registrationPage.buttonCreate();
        });
        step("Проверяем данные по ссылке Account", () -> {
            registrationPage.iconAccount();
        });
        step("Проверяем что данные о новом Пользователе отображаются", () -> {
            registrationPage.checkInfoAccount();
        });
    }

    @Test
    @Tag("all-test")
    @Tag("smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Авторизация пользователя")
    @DisplayName("Авторизация нового пользователя")
    void loginTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Открываем ссылку Account", () -> {
            registrationPage.iconAccount();
        });
        step("Вводим Email пользователя ", () -> {
            registrationPage.setCustomerEmail();
        });
        step("Вводим Password пользователя ", () -> {
            registrationPage.setCustomerPassword();
        });
        step("Открываем ссылку Account", () -> {
            registrationPage.iconAccount();
        });
        step("Проверяем что данные о новом Пользователе отображаются", () -> {
            registrationPage.checkInfoAccount();
        });
    }
}
