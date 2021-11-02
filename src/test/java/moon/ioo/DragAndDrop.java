package moon.ioo;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void moveDragAndDrop(){
        // открыть страницу https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // переместить прямоугольник А на место прямоугольника B  $(element).dragAndDrop($(to-element))
        $("#column-a").dragAndDropTo($("#column-b"));
        // проверить, что прямоугольники поменялись местами
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
