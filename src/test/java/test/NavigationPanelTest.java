package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;
@Epic("UI")
@Owner("Aleksandr Drozenko")
@Feature("Проверка элементов навигационной панели")
@Tags({@Tag("ui"), @Tag("Навигационная панель")})
public class NavigationPanelTest extends TestBase{

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка наличия элемента навигационной панели")
    @DisplayName("Проверка наличия элемента Garage Design в навигационной панели главной страницы")
    void checkMainPageIconTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Проверяем наличие элемента Garage Design в списке ссылок ", () -> {
            $("#shopify-section-header").shouldHave(text("Garage Design"));
        });
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка наличия элемента в выпадающем списке")
    @DisplayName("Проверка наличия элемента из списка For the obsessed в навигационной панели главной страницы")
    void checkContainMainPageIconTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Проверяем наличие элемента For Customers в выпадающем списке FOR THE OBSESSED", () -> {
            $$(".site-nav__item").find(text("FOR THE OBSESSED"))
                    .hover().shouldHave(text("For Customers"));
        });
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка кликабельности элементов навигационной панели")
    @DisplayName("Проверка кликабельности элементов страницы")
    void checkPageHeaderTest() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });

        step("Открываем ссылку Open Box/Discount", () -> {
            $$(".site-nav__item").find(text("Open Box/Discount")).click();
        });
        step("Проверяем наличие заголовка открывшейся страницы Matty's Trinkets & Treasures ", () -> {
            $("h1.section-header__title").shouldHave(text("Matty's Trinkets & Treasures"));
        });
    }

}
