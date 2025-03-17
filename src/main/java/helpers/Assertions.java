package helpers;

import io.qameta.allure.Step;

/**
 * Класс для кастомных проверок с интеграцией в Allure-отчёт.
 * @author Yan
 */
public class Assertions {

    @Step("Проверяем, что нет ошибки: '{message}'")
    public static void assertTrue(boolean condition, String message) {
        org.junit.jupiter.api.Assertions.assertTrue(condition, message);
    }
}