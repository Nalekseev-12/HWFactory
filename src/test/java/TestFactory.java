import com.beust.jcommander.Parameter;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class TestFactory {



    @Test
    public void webBrowser() {
       String browser = System.getProperty("browser");
        WebDriver wd = new WebDriverFactory().create(browser);
        if (wd == null) {
            wd = new WebDriverFactory().create("chrome");
        }
        wd.get("https://otus.ru/");
    }
}