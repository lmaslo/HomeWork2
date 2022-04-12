package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Properties;

public class DriverConfig {
    public static void configure() {

        Properties properties = System.getProperties();
        String runTest = properties.getProperty("runTest");

        Configuration.browser = Project.webConfig.browserName();
        Configuration.browserVersion = Project.webConfig.browserVersion();
       // Configuration.baseUrl = Project.webConfig.getBaseUrl();
        Configuration.browserSize = Project.webConfig.browserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--lang=en-en");


        if (Project.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = Project.webConfig.remoteUrl();
        }

        Configuration.browserCapabilities = capabilities;


    }
}
