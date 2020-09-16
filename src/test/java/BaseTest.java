import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
    WebDriver driver = SingletonWebDriver.getInstanceOfSingletonWebDriverClass().getDriver();

    public void openUrl(String url) {
        driver.get(url);
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
