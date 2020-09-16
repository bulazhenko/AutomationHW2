import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @DataProvider(name = "TestDataProvider")
    public static Object[][] getDataFromDataProvider() {
        return new Object[][]{
                {TestProperties.config.googleTitle(), TestProperties.config.googleUrl()},
                {TestProperties.config.youtubeTitle(), TestProperties.config.youtubeUrl()},
                {TestProperties.config.stackoverflowTitle(), TestProperties.config.stackoverflowUrl()}
        };
    }

    @Test(dataProvider = "TestDataProvider")
    public void titleVerificationTest(String title, String url) {
        openUrl(url);
        String actualTitle = getTitle();
        Assert.assertTrue(actualTitle.contains(title));
    }
}
