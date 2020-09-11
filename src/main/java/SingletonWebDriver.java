import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebDriver {
    // instance of singleton class
    private static SingletonWebDriver instanceOfSingletonWebDriverClass = null;

    private WebDriver driver;

    // Constructor
    private SingletonWebDriver() {
        System.setProperty("webdriver.chrome.driver", TestProperties.config.chromeDriverPath());
        driver = new ChromeDriver();
    }

    // TO create instance of class
    public static SingletonWebDriver getInstanceOfSingletonWebDriverClass() {
        if (instanceOfSingletonWebDriverClass == null) {
            instanceOfSingletonWebDriverClass = new SingletonWebDriver();
        }
        return instanceOfSingletonWebDriverClass;
    }

    // To get driver
    public WebDriver getDriver() {
        return driver;
    }
}
