package ru.yandex.praktikum.listPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.praktikum.basePage.BasePage;

import java.time.Duration;

public class DownListPage extends BasePage {

    public DownListPage(WebDriver webDriver) {
        super(webDriver);
    }

    //    Локаторы для полей с выпадающим текстом
    protected By heading0 = By.id("accordion__heading-0");
    protected By heading1 = By.id("accordion__heading-1");
    protected By heading2 = By.id("accordion__heading-2");
    protected By heading3 = By.id("accordion__heading-3");
    protected By heading4 = By.id("accordion__heading-4");
    protected By heading5 = By.id("accordion__heading-5");
    protected By heading6 = By.id("accordion__heading-6");
    protected By heading7 = By.id("accordion__heading-7");

    //    локаторы выпадающих полей после клика
    protected By accordion0 = By.
            xpath("//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    protected By accordion1 = By.
            xpath("//p[text()='Пока что у нас так: один заказ — один самокат." +
                    " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    protected By accordion2 = By.
            xpath("//p[text()='Допустим, вы оформляете заказ на 8 мая." +
                    " Мы привозим самокат 8 мая в течение дня." +
                    " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                    " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    protected By accordion3 = By.
            xpath("//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    protected By accordion4 = By.
            xpath("//p[text()='Пока что нет!" +
                    " Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    protected By accordion5 = By.
            xpath("//p[text()='Самокат приезжает к вам с полной зарядкой." +
                    " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                    " Зарядка не понадобится.']");
    protected By accordion6 = By.
            xpath("//p[text()='Да, пока самокат не привезли." +
                    " Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    protected By accordion7 = By.
            xpath("//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

}