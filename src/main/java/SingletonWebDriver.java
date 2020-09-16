import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonWebDriver {
    private static SingletonWebDriver instanceOfSingletonWebDriverClass = null;

    private WebDriver driver;
    private String driverType = System.getProperty("driverType");

    private SingletonWebDriver() {
        switch (driverType.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", TestProperties.config.chromeDriverPath());
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", TestProperties.config.firefoxDriverPath());
                driver = new FirefoxDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", TestProperties.config.edgeDriverPath());
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Driver type is not recognized >> " + driverType);
                break;
        }
    }

    public static SingletonWebDriver getInstanceOfSingletonWebDriverClass() {
        if (instanceOfSingletonWebDriverClass == null) {
            instanceOfSingletonWebDriverClass = new SingletonWebDriver();
        }
        return instanceOfSingletonWebDriverClass;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
