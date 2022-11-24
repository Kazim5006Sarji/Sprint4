package ru.yandex.praktikum.listPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.basePage.BasePage;

public class DownListPage extends BasePage {

    public DownListPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String getQuestion(int num) {
        return "accordion__heading-" + num;
    }


    protected By getAnswer(By by) {
        return By.xpath("//div[./div[@id='" + by.toString().replace("By.id: ", "")
                + "']]//following-sibling::div/p");
    }


    //    Локаторы вопросов
    protected By howMuchCostQuestion = By.id(getQuestion(0));
    protected By severalScooterQuestion = By.id(getQuestion(1));
    protected By rentTimeQuestion = By.id(getQuestion(2));
    protected By todayOrderQuestion = By.id(getQuestion(3));
    protected By extendReturnQuestion = By.id(getQuestion(4));
    protected By chargerQuestion = By.id(getQuestion(5));
    protected By cancellationQuestion = By.id(getQuestion(6));
    protected By MkadQuestion = By.id(getQuestion(7));
}