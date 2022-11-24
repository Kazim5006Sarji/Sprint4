package ru.yandex.praktikum.orderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.praktikum.basePage.BasePage;

import java.time.Duration;

public class OrderPage extends BasePage {

    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }


    //    Локатор для кнопки заказа верхний
    protected By topOrderButton = By.className("Button_Button__ra12g");

    //    Локатор для кнопки заказа внизу
    protected By bottomOrderButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //    Локатор поля Имя
    protected By name = By.xpath("//input[@placeholder='* Имя']");

    //    Локатор поля Фамилия
    protected By lastName = By.xpath("//input[@placeholder='* Фамилия']");

    //    Локатор поля адресс
    protected By address = By.xpath("//input[contains(@placeholder, 'куда')]");

    //    Локатор поля метро
    protected By metro = By.xpath("//input[@placeholder='* Станция метро']");


    //    Локатор выбора станции метро Черкизовская
    protected By cherkizovskaya = By.xpath("//div[@class='select-search__select']//*[text()='Черкизовская']");

    //    Локатор для поля номаре телефона
    protected By tel = By.xpath("//input[contains(@placeholder, 'на')]");

    //    Локатор для кнопки Далее
    protected By further = By.xpath("//*[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    //    Локатор отображения страницы после нажатия кнопки Далее
    protected By pageDisplay = By.xpath("//div[@class='Order_Content__bmtHS']");

    //    Локатор поля даты
    protected By data = By.
            xpath("//*[contains(@placeholder, '* Когда привезти самокат')]");

    //    Локатор поля выпадшки с выбором даты
    protected By calendarDate = By.
            xpath("//*[@class = 'react-datepicker__day react-datepicker__day--008']");

    //    Локатор срока аренды
    protected By rental = By.xpath("//*[@class='Dropdown-placeholder']");

    //    Локатор выпадашки срока аренды
    protected By rentalPeriod = By.xpath("//*[@class='Dropdown-placeholder']");

    //    Локатор выбора даты в выпадашке
    protected By datePicker = By.xpath("//*[text()='четверо суток']");

    //    Локатор выбора цвета самоката
    protected By color = By.id("black");

    //    Локатор комментария
    protected By comment = By.xpath("//*[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");

    //    Локатор кнопки заказать
    protected By order = By.
            xpath("//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать')]");

    //    Локатор кнопки подтверждения заказа ДА
    protected By confirmationOrder = By.
            xpath("//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text()='Да')]");


    //    Локатор подтверждения заказа
    protected By orderConfirmed = By.xpath("//*[contains(text(), 'Посмотреть статус')]");


    //    Метод клика по верхней кнопке заказа
    public void clickOrderButtonTop() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(topOrderButton));
        webDriver.findElement(topOrderButton).click();
    }

    //    Метод клика по нижней кнопке заказа
    public void clickOrderButtonBottom() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(bottomOrderButton));
        webDriver.findElement(bottomOrderButton).click();
    }

    //    Метод клика по кнопке Да
    public void clickBottomYes() {
        webDriver.findElement(confirmationOrder).click();
    }


    //    Метод ввода Имени в поле
    public void inputName(String text) {
        webDriver.findElement(name).sendKeys(text);
    }

    //    Метод ввода Фамилии в поле
    public void inputLastName(String text) {
        webDriver.findElement(lastName).sendKeys(text);
    }

    //    Метод ввода адреса в поле
    public void inputAddress(String text) {
        webDriver.findElement(address).sendKeys(text);
    }

    //Метод клика по поле Метро
    public void choiceOfMetroStation() {
        webDriver.findElement(metro).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cherkizovskaya));
        webDriver.findElement(cherkizovskaya).click();
    }

    //    Метод ввода в поле телефон
    public void enterPhone(String text) {
        webDriver.findElement(tel).sendKeys(text);
    }

    //    Метод клика по кнопке далее и ввода даты
    public void clickButtonFurther() {
        webDriver.findElement(further).click();
    }

    //    Метод ввода даты
    public void enterDate() {
        webDriver.findElement(data).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(calendarDate));
        webDriver.findElement(calendarDate).click();
    }

    //    Метод ввода срока аренды
    public void dateInput() {
        webDriver.findElement(rentalPeriod).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(datePicker));
        webDriver.findElement(datePicker).click();
    }

    //    Метод выбора цвета самоката
    public void blackColorChoice() {
        webDriver.findElement(color).click();
    }

    //    Метод ввода в поле коммента  для курьера
    public void inputComment(String text) {
        webDriver.findElement(comment).sendKeys(text);
    }

    // Метод получения текста подтверждающего заказ
    public String getTextFromButtonViewStatus() {
        return webDriver.findElement(orderConfirmed).getText();
    }

//   Метод клиака по кнопке ЗАКАЗАТЬ
    public void clickOnOrderButton() {
        webDriver.findElement(order).click();
    }
}
