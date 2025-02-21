package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование страницы Delivery")
@Tag("ui")
@DisplayName("Тестирование страницы Delivery")
public class DeliveryPageTest extends TestBase {


    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка открытия страницы Delivery")
    @DisplayName("Проверка элементов страницы Delivery")
    void returnPageTest() {
        mainPage.openPage()
                .openSupportPage();
        supportPage.openReturnPage();
        deliveryPage.checkTextDeliveryPage()
                .checkArticleList();

    }

}
