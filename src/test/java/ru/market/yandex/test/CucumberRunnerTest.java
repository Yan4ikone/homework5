package ru.market.yandex.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Класс запуска тестов Cucumber
 */
@CucumberOptions(
    strict = false,
    monochrome = true,
    plugin = {"pretty"},
    features = "src/test/java/features",
    glue = {"src/main/java/stepdefs", "src/main/java/hooks"},
    tags ="not @excluded"
)

@RunWith(Cucumber.class)
public class CucumberRunnerTest {
}

