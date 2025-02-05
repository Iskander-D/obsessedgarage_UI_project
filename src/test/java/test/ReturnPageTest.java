package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Тестирование страницы Returns")
@Tag("ui")
@DisplayName("Тестирование страницы Returns")
public class ReturnPageTest extends TestBase {

    @Disabled
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка открытия страницы Returns")
    @DisplayName("Проверка элементов страницы Returns")
    void returnPageTest() {
        mainPage.openPage()
                .openSupportPage();
        supportPage.openReturnPage();
        returnPage.checkTextReturnPage();

    }

}
