package ru.yandex.praktikum.listPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.basePage.BasePage;

public class DownListPage extends BasePage {

    public DownListPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String getQuestion(int num) {
        return "accordion__heading-" + String.valueOf(num);
    }

    private String getAnswer(int num) {
        return "//div[./div[@id='" + getQuestion(num) + "']]//following-sibling::div/p";
    }


    //    Локаторы вопроса стоимости
    protected By howMuchCostQuestion = By.id(getQuestion(0));
    //    Локатор вопроса о нескольких самокатах
    protected By severalScooterQuestion = By.id(getQuestion(1));
    protected By rentTimeQuestion = By.id(getQuestion(2));
    protected By todayOrderQuestion = By.id(getQuestion(3));
    protected By extendReturnQuestion = By.id(getQuestion(4));
    protected By chargerQuestion = By.id(getQuestion(5));
    protected By cancellationQuestion = By.id(getQuestion(6));
    protected By MkadQuestion = By.id(getQuestion(7));

    //    локаторы ответа стоимости
    protected By howMuchCostAnswer = By.xpath(getAnswer(0));

    protected By severalScooterAnswer = By.xpath(getAnswer(1));
    protected By rentTimeAnswer = By.xpath(getAnswer(2));
    protected By todayOrderAnswer = By.xpath(getAnswer(3));
    protected By extendReturnAnswer = By.xpath(getAnswer(4));
    protected By chargerAnswer = By.xpath(getAnswer(5));
    protected By cancellationAnswer = By.xpath(getAnswer(6));
    protected By MkadAnswer = By.xpath(getAnswer(7));

}