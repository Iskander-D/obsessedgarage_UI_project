package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;
@Epic("UI")
public class NavigationPanelTest extends TestBase{

    @Test
    @Tag("all-test")
    @Tag("simple")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Навигационная панель")
    @Story("Проверка наличия элемента навигационной панели")
    @DisplayName("Проверка наличия элемента Garage Design в навигационной панели главной страницы")
    void checkMainPageIcon() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Проверяем наличие элемента Garage Design в списке ссылок ", () -> {
            $("#shopify-section-header").shouldHave(text("Garage Design"));
        });
    }

    @Test
    @Tag("all-test")
    @Tag("simple")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Навигационная панель")
    @Story("Проверка наличия элемента в выпадающем списке")
    @DisplayName("Проверка наличия элемента из списка For the obsessed в навигационной панели главной страницы")
    void checkContainMainPageIcon() {
        step("Открываем главную страницу Obsessed Garage", () -> {
            registrationPage.openPage();
        });
        step("Проверяем наличие элемента For Customers в выпадающем списке FOR THE OBSESSED", () -> {
            $$(".site-nav__item").find(text("FOR THE OBSESSED"))
                    .hover().shouldHave(text("For Customers"));
        });
    }
    @Test
    @Tag("all-test")
    @Tag("simple")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Aleksandr Drozenko")
    @Feature("Навигационная панель")
    @Story("Проверка кликабельности элементов навигационной панели")
    @DisplayName("Проверка кликабельности элементов страницы")
    void checkPageHeader() {
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
