package test;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.AffiliatePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование страницы Affiliate")
@Tags({ @Tag("ui"), @Tag("smoke") })
@DisplayName("Тестирование страницы Affiliate")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AffiliatetPageTest extends TestBase {
    TestData testData = new TestData();
    AffiliatePage affiliatePage = new AffiliatePage();

    @Test
    @Order(9)
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка заполнения полей формы Affiliate")
    @DisplayName("Проверка заполнения основных полей формы Affiliate")
    void requestPageTest() {

        mainPage.openPage();
        executeJavaScript("arguments[0].style.display = 'none';", $(".kl-private-reset-css-Xuajs1"));
        mainPage   .openAffiliatePage();
        affiliatePage.signUpHere()
                .setEmail(testData.userEmail)
                .setName(testData.name)
                .setPassword(testData.number)
                .setDescription(testData.description)
                .selectCountry(testData.country)
                .checkResultEmail()
                .checkResultName()
                .checkPassword()
                .checkResultDescription()
                .checkCountry(testData.country);

    }

}
