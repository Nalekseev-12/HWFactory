package factory;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {

    protected enum enumName {
        CHROME,
        FIREFOX
    }


    public WebDriver create(String webDriverName, String... options) {

            WebDriver driver;
            if (enumName.CHROME.name().equalsIgnoreCase(webDriverName)) {
                if (options != null) {
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments(options);
                    driver = new ChromeDriver(chromeOptions);
                } else {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            } else if (enumName.FIREFOX.name().equalsIgnoreCase(webDriverName)) {
                if (options != null) {
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments(options);
                    driver = new FirefoxDriver();
                } else {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }

            } else {
                driver = null;
            }

            return driver;

        }
}


