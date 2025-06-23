package test;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AccountPage;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Заполнение регистрации")
@Tag("ui")
@DisplayName("Проверка заполнения регистрации")

public class RegistrationTest extends TestBase {

    TestData testData = new TestData();
    AccountPage accountPage = new AccountPage();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Регистрация")
    @DisplayName("Заполнение полей регистрации")
    void registrationTest() {
        mainPage.openPage();
        accountPage.openAccountPage()
                   .verifyEmailFieldIsVisible()
                   .setEmail(testData.userEmail)
                   .verifyPasswordFieldIsVisible()
                   .setPassword(testData.password)
                   .checkVisibilityEmail()
                   .checkVisibilityPassword();


    }
}
