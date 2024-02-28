package test;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RequestPage;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование страницы Submit a request")
@Tag("ui")
@DisplayName("Тестирование страницы Submit a request")
public class RequestPageTest extends TestBase {
    TestData testData = new TestData();
    RequestPage requestPage = new RequestPage();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка заполнения полей формы Submit a request")
    @DisplayName("Проверка заполнения основных полей формы Submit a request")
    void requestPageTest()  {
        mainPage.openPage()
                .openSubmitRequestPage();
        requestPage.setEmail(testData.userEmail)
                .setName(testData.name)
                .setNumberOrder(testData.number)
                .setSubject(testData.subject)
                .checkResultEmail()
                .checkResultName()
                .checkResultNumberOrder()
                .checkResultSubject();

    }

}
