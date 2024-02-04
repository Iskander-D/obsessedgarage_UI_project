package test;


import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("Aleksandr Drozenko")

public class ManualTest {
    @Test
    @Tag("manual")
    @DisplayName("Авторизация пользователя")
    public void manualAuthorizationTest() {
        step("Открываем главню страницу");
        step("Кликаем по кнопке Account");
        step("Заполняем таблицу Login", () -> {
            step("Вводим Email");
            step("Вводим Password");
        });
        step("Кликаем по кнопке Account");
        step("Проходим Captcha");
        step("Проверяем что Авторизация прошла успешно");
    }
    @Test
    @Tag("manual")
    @DisplayName("Авторизация пользователя")
    public void manualRegistrationTest() {
        step("Открываем главню страницу");
        step("Кликаем по кнопке Account");
        step("Кликаем кнопку Create Account", () -> {
            step("Вводим Имя");
            step("Вводим Фамилию");
            step("Вводим Email");
            step("Вводим Password");
        });
        step("Кликаем по кнопке Create");
        step("Проходим Captcha");
        step("Проверяем что регистрация прошла успешно");
    }
}

