package stepdefs;

import io.cucumber.java.ru.Дано;

import static com.codeborne.selenide.Selenide.open;
import static helpers.Properties.configProperties;

public class OpenSite {

    @Дано("Открытие главной страницы {string}")
    public void открытиеСайта(String url) {
        open(configProperties.baseUrl(url));
    }
}
