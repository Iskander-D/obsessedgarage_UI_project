package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование страницы Delivery")
@Tag("ui")
@DisplayName("Тестирование страницы Delivery")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeliveryPageTest extends TestBase {


    @Test
    @Order(6)
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
