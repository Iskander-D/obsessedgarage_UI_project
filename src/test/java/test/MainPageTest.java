package test;

import data.TestDataFakers;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPageTest { //сделать extend tast Base
    MainPage mainPage = new MainPage();
    TestDataFakers testDataFakers = new TestDataFakers();


    @Owner("Aleksandr Drozenko")
    @CsvFileSource(resources = "/testData/searchResultShouldContainExpectedText.csv", delimiter = '|')
    @DisplayName("Проверка необхдимых значений в поисковой строке")
    @ParameterizedTest(name = "Для поискового запроса {0} есть карточка с именем {1}")
    @Tag("SMOKE")
    void searchResultShouldContainText(String searchQuery, String expectedName) {
        step("Открываем главную страницу Obsessed Garage", () -> {
            mainPage.openPage();
        });
        $(".site-header__search-input").setValue(searchQuery).pressEnter();
        $("#MainContent").shouldHave(text(expectedName));
    }

    @BeforeEach
    void setUp() {
        open("https://www.obsessedgarage.com/");
    }

    @Test
    @Tag("all-test")
    @Tag("SMOKE")
    @Owner("Aleksandr Drozenko")
    @DisplayName("Регистрация нового пользователя")
    void registrationTest() {
        //step("Открываем главную страницу Obsessed Garage", () -> {
        //   mainPage.openPage();
        // });
        step("Открываем ссылку Account", () -> {
            mainPage.iconAccount();
        });
        step("Открываем ссылку Create account", () -> {
            mainPage.iconRegister();
        });
        step("Вводим данные пользователя", () -> {
            mainPage.setFirstName(testDataFakers.firstNameInput);
            mainPage.setLastName(testDataFakers.lastNameInput);
            mainPage.setUserEmail(testDataFakers.userEmailInput);
            mainPage.setUserPassword(testDataFakers.userPassword);
        });
        step("Создаем пользователя нажимая кнопку Create ", () -> {
            mainPage.buttonCreate();
        });
        step("Проверяем данные по ссылке Account", () -> {
            mainPage.iconAccount();
        });
        step("Проверяем что данные о Пользователе отображаются", () -> {
            mainPage.checkInfoAccount();
        });
    }

}



