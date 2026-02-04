package pages.component;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.element;

public class SearchComponent {

    private final SelenideElement
            search = element("#Inline-Search");

    @Step("Ввести запрос в меню поиска")
    public SearchComponent searchItem(String searchQuery) {
        search.setValue(searchQuery).pressEnter();
        return new SearchComponent (); //todo возвращаем текущий объект
    }
}
