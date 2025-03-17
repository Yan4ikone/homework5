package stepdefs;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.Assertions;
import io.cucumber.java.bg.То;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class PhonesMarket {

    private final SelenideElement allProductsButton = $x("//span[contains(text(), 'Показать всё')]");
    SelenideElement searchFieldEnter = $x("//*[@placeholder='Найти']");
    SelenideElement phoneApple = $x("//span[text()='Apple']");
    SelenideElement buttonNext = $x("//span[text()='Вперёд']");
    ElementsCollection titles = $$x("//span[@data-auto='snippet-title' and not(ancestor::*[@data-auto='searchIncut'])]");

    @То("проверка {string}")
    public void проверкаЗаголовка(String title) {
    String  isTitle = Selenide.title();
        assert isTitle != null;
        Assertions.assertTrue(isTitle.contains(title), "Неверный заголовок: " + title);
    }

    @Когда("ввожу {string} поиска")
    public void ввожуПараметыПоиска(String product) {
        allProductsButton.click();
        searchFieldEnter.setValue(product);
        phoneApple.click();
        do {
            buttonNext.scrollIntoView(false);
        } while ((buttonNext.is(exist)));

    }


    @Тогда("сравниваю {string} с {string}")
    public void сравниваюСПараметрами(List<String> isTitles, String product) {
        isTitles = titles.texts();
        Assertions.assertTrue(isTitles.contains(product), "Заголовок не совпадает с названиями: " + isTitles);
    }
}
