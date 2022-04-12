package config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.function.Supplier;



public class WebDriverProveder  {

    /*private final WebDriverConfig config;
    public WebDriverProveder() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        return driver;
    }*/

    /*private WebDriver createWebDriver(){
        if (Objects.nonNull(config.getBrowser())){
            switch (config.getBrowser()){
                case CHROME: {
                    return  new ChromeDriver();
                }
                case FIREFOX: {
                    return  new FirefoxDriver();
                }
                default: {
                    throw new RuntimeException("Тип браузера не поддерживаниется");
                }
            }
        }
        throw new RuntimeException("Тип браузера не может быть null");
    }*/

}
