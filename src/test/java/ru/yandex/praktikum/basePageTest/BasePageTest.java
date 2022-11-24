package ru.yandex.praktikum.basePageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.yandex.praktikum.configuration.TestProperties;

import java.util.Collections;

public abstract class BasePageTest {

    protected static TestProperties properties = TestProperties.getInstance();

    protected static WebDriver driver;

    protected final String URL = "https://qa-scooter.praktikum-services.ru/";

    public static WebDriver initDriver() {
        if (properties.getProperties("browser").equals("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(firefoxOptions);
            driver.manage().window().maximize();
        } else {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("useAutomationExtension", false);
            chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
        }
        return driver;
    }

    @Before
    public void setUp() {
        initDriver().get(URL);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
