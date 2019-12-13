import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TestHtmlForm {
//    TODO добавить DataProvider для запуска параметризованных тестов
//    TODO добавить многопоточность
//    TODO удалять все TODO после выполнения

    // TODO сделать тест параметризованным
    @Test
    public void testMyHtml() throws InterruptedException {
        Selenide.open("file://C:\\Users\\sueti\\IdeaProjects\\Lesson 5\\src\\main\\resources\\index.html");
        // TODO исправить XPATH
        $x("//input[@name='name']").sendKeys("Мне повезёт");
        $x("//*[@type='submit']").click();
        $("select").selectOption(2);

        // TODO параметризовать эту проверку
        $("#head")
                .shouldBe(text("123"));
    }

    // TODO сделать тест параметризованным
    @Test
    public void testGoogle() {
        Selenide.open("http://google.com");
        $x("//input[@name='name']").sendKeys("10 * 10", Keys.ENTER);
        // TODO реализовать проверку результата в гугл

    }

}
