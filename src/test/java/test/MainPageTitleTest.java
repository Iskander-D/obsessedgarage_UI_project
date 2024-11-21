package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка заголовка главной страницы")
@Tag("ui")
@DisplayName("Проверка заголовка главной страницы")
public class MainPageTitleTest extends TestBase {

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
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Поля регистрации")
    @DisplayName("Заполнение полей регистрации")
    void registrationTest() {
        mainPage.openPage();
        $(".site-nav").find(byText("Account")).click();
        $("#CustomerEmail").shouldBe(visible, Duration.ofSeconds(30)).click();
        $("#CustomerEmail").sendKeys("fedor@gmail.com");
        $("#CustomerPassword").shouldBe(visible, Duration.ofSeconds(30)).click();
        $("#CustomerPassword").sendKeys("363000");
//        $("#CustomerLoginForm").find(byText("Sign In")).click();


    }
}






