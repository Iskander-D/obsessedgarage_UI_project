package test;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.AffiliatePage;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование страницы Affiliate")
@Tags({ @Tag("ui"), @Tag("smoke") })
@DisplayName("Тестирование страницы Affiliate")
public class AffiliatetPageTest extends TestBase {
    TestData testData = new TestData();
    AffiliatePage affiliatePage = new AffiliatePage();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка заполнения полей формы Affiliate")
    @DisplayName("Проверка заполнения основных полей формы Affiliate")
    void requestPageTest() {

        mainPage.openPage()
                .openAffiliatePage();
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
