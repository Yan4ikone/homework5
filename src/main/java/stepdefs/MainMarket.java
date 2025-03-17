package stepdefs;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Когда;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

public class MainMarket {

    private final SelenideElement catalogButton = $x("//div[@data-zone-name ='catalog']");
    private final SelenideElement electronicTab = ($x("//li[@data-zone-name='category-link']" +
            "/a[@href='https://market.yandex.ru/special/electronics_dep']"));
    private SelenideElement phonesButton = $x("//a[text()='Смартфоны']");

    @Когда("^пользователь нажимает на вкладку смартфоны")
    public void переходСмартфоны() {
        catalogButton.click();
        actions().moveToElement(electronicTab).perform();
        phonesButton.click();
    }
}

