package config;

import org.aeonbits.owner.Config;



@Config.Sources("classpath:${remote}.properties")
public interface WebDriverConfig extends Config {

    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    String browserVersion();
}