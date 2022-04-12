package config;

import org.aeonbits.owner.Config;


@Config.Sources("classpath:${runTest}.properties")
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://demoqa.com")
    String getBaseUrl();

    @Key("browserSize")
    String browserSize();


    @Key("browserName")
    String browserName();


    @Key("browserVersion")
    String browserVersion();


    @Key("remoteUrl")
    String remoteUrl();



}
