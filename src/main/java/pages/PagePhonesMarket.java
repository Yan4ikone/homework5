package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helpers.Assertions;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PagePhonesMarket {

    @Step("Проверка соответствия выборки товаров с {product}")
    public void choosePhone(String productApple, String product) {
        $x("//span[contains(text(), 'Показать всё')]").click(); // нажатие вкладки показать всё
        SelenideElement searchFieldEnter = $x("//*[@placeholder='Найти']");
        searchFieldEnter.setValue(productApple); // ввод фирмы Apple в поисковую строку
        SelenideElement phoneApple = $x("//span[text()='Apple']");
        phoneApple.click();// нажатие кнопки Apple
        SelenideElement buttonNext = $x("//span[text()='Вперёд']");
        do {
            buttonNext.scrollIntoView(false);
        } while ((buttonNext.is(exist)));
        ElementsCollection titles = $$x("//span[@data-auto='snippet-title' and not(ancestor::*[@data-auto='searchIncut'])]");
        for (SelenideElement item : titles) {
            Assertions.assertTrue(item.text().toLowerCase().contains(product),
                    "Элементы по заданным параметрам");
        }
    }
}
