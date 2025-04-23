package test;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AccountPage;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка заголовка главной страницы")
@Tag("ui")
@DisplayName("Проверка заголовка главной страницы")
public class MainPageTitleTest extends TestBase {
    TestData testData = new TestData();
    AccountPage accountPage = new AccountPage();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка титла ")
    @DisplayName("Проверка заголовка главной страницы")
    void checkPageTitleTest() {
        mainPage.openPage();
        step("Проверяем заголовок главной страницы", () -> {
            String expectedTitle = "Obsessed Garage | Home Of The Obsessed";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }


}






