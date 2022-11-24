package ru.yandex.praktikum.basePageTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BasePageTest {

    protected WebDriver webDriver;

    protected final String URL = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver = new FirefoxDriver();
//        webDriver = new ChromeDriver();
        webDriver.get(URL);
    }

    @After
    public void teardown() {
        webDriver.quit();
    }
}
