import factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFactory {



@Test
    public void browser() {
    WebDriver wd = new WebDriverFactory().create("chrome");
    wd.get("https://otus.ru/");
}
}
