import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:TestProperties.properties")
public interface TestProperties extends Config {

    TestProperties config = ConfigFactory.create(TestProperties.class, System.getenv(), System.getProperties());

    @Key("google.url")
    String googleUrl();

    @Key("google.title")
    String googleTitle();

    @Key("chrome.driver.path")
    String chromeDriverPath();

    @Key("youtube.title")
    String youtubeTitle();

    @Key("youtube.url")
    String youtubeUrl();

    @Key("stackoverflow.title")
    String stackoverflowTitle();

    @Key("stackoverflow.url")
    String stackoverflowUrl();
}

