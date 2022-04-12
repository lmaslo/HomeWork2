package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:${runTest}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://demoqa.com")
    String getBaseUrl();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();


    @Key("browserName")
    @DefaultValue("chrome")
    String browserName();


    @Key("browserVersion")
    @DefaultValue("100.0")
    String browserVersion();


    @Key("remoteUrl")
    @DefaultValue("")
    String remoteUrl();



}
