package moon.ioo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class BestSelenideContributor {
    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
    }

    @Test
    void findBestSelenideContributor () {
        // открыть страницу https://github.com/selenide/selenide
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому элементу в области Contributors
        // hover - подвести мышь
        $(".BorderGrid").$(byText("Contributors"))
                .closest("div").$("li").hover();
        sleep(5000);
        // проверка: в появившемся окошечке (overlay)
        $$(".Popover-message").findBy(Condition.visible).shouldHave(text("Andrei Solntsev"));
    }
}
