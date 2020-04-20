import factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFactory {



@Test
    public void webBrowser() {
    String browser = System.getProperty("browser");
    WebDriver wd = new WebDriverFactory().create(browser);
    wd.get("https://otus.ru/");
}
}
