package moon.ioo;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {
    // ARRANGE - подготовка
    // ACT - действия
    // ASSERT - проверка

    @Test
    void test () {
        // открыть страницу https://github.com/
        open("https://github.com/");
        // ввести в поле поиска Selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        // нажимаем линк первого результата
        $$(".repo-list li").first().$("a").click();
        // проверить что в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
    }


}
