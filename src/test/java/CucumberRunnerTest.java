import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Класс запуска тестов Cucumber
 */
@CucumberOptions(
    strict = false,
    monochrome = true,
    features = "src/test/java/features",
    glue = {"stepdefs", "hooks"},
    tags ="not @excluded"
)

@RunWith(Cucumber.class)
public class CucumberRunnerTest {
}

