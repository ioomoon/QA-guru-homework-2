package moon.ioo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SearchJUnit5CodeInSoftAssertionsWiki {
    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
    }

    @Test
    void findJUnit5CodeInSoftAssertionsWiki(){
        // Открыть страницу Selenide в Github https://github.com/selenide/selenide
        open("https://github.com/selenide/selenide");
        // Перейти в раздел Wiki проекта
        $("#repository-container-header").$("nav").$("li", 5).click();
        // Убедится, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").$(withText("SoftAssertions")).click();
        // Открыть страницу SoftAssertions, проверить что внутри есть пример кода для JUnit5
        $("#wiki-body")
                .shouldHave(text("JUnit5 extension - com.codeborne.selenide.junit5.SoftAssertsExtension"));
        sleep(5000);

    }
}
