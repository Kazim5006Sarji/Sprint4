package ru.yandex.praktikum.listPage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.praktikum.basePageTest.BasePageTest;


public class DownListPageTest extends BasePageTest {

    private String howMuchCostAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    private String severalscooterAnswerText = "Пока что у нас так: один заказ — один самокат." +
            " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    private String rentTimeAnswerText = "Допустим, вы оформляете заказ на 8 мая." +
            " Мы привозим самокат 8 мая в течение дня." +
            " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
            " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    private String todayOrderAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    private String extendReturnAnswerText = "Пока что нет!" +
            " Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    private String chargerAnswerText = "Самокат приезжает к вам с полной зарядкой." +
            " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
            " Зарядка не понадобится.";

    private String cancellationAnswerText = "Да, пока самокат не привезли." +
            " Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    private String MkadAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    private DownListPage downListPage = new DownListPage(webDriver);

    @Test
    public void checkPanel1() {
        String[] textsToCheck = new String[] {howMuchCostAnswerText, severalscooterAnswerText, rentTimeAnswerText,
                todayOrderAnswerText, extendReturnAnswerText, chargerAnswerText, cancellationAnswerText, MkadAnswerText};
        By[] elementsToCheck = new By[]{downListPage.howMuchCostAnswer, downListPage.severalScooterAnswer,
                downListPage.rentTimeAnswer, downListPage.todayOrderAnswer, downListPage.extendReturnAnswer,
                downListPage.chargerAnswer, downListPage.cancellationAnswer, downListPage.MkadAnswer};
        for ()
        downListPage.scrollToElement(downListPage.howMuchCostQuestion);
        downListPage.clickList(downListPage.howMuchCostQuestion);
        Assert.assertEquals("Текст в поле не верный", howMuchCostAnswerText,
                downListPage.getTextFromDropdownField(downListPage.howMuchCostAnswer));
    }

    @Test
    public void checkPanel2() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.severalScooterQuestion);
        downListPage.clickList(downListPage.severalScooterQuestion);
        String expected = "Пока что у нас так: один заказ — один самокат." +
                " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = downListPage.getTextFromDropdownField(downListPage.severalScooterAnswer);
        Assert.assertEquals("Текст в поле не верный", expected, actual);
    }

    @Test
    public void checkPanel3() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.rentTimeQuestion);
        downListPage.clickList(downListPage.rentTimeQuestion);
        String expected = "Допустим, вы оформляете заказ на 8 мая." +
                " Мы привозим самокат 8 мая в течение дня." +
                " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = downListPage.getTextFromDropdownField(downListPage.rentTimeAnswer);
        Assert.assertEquals("Текст в поле не верный", expected, actual);
    }

    @Test
    public void checkPanel4() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.todayOrderQuestion);
        downListPage.clickList(downListPage.todayOrderQuestion);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = downListPage.getTextFromDropdownField(downListPage.todayOrderAnswer);
        Assert.assertEquals("Текст в поле не верный", expected, actual);
    }

    @Test
    public void checkPanel5() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.extendReturnQuestion);
        downListPage.clickList(downListPage.extendReturnQuestion);
        String expected = "Пока что нет!" +
                " Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = downListPage.getTextFromDropdownField(downListPage.extendReturnAnswer);
        Assert.assertEquals("Текст в поле не верный", expected, actual);
    }

    @Test
    public void checkPanel6() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.chargerQuestion);
        downListPage.clickList(downListPage.chargerQuestion);
        String expected = "Самокат приезжает к вам с полной зарядкой." +
                " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                " Зарядка не понадобится.";
        String actual = downListPage.getTextFromDropdownField(downListPage.chargerAnswer);
        Assert.assertEquals("Текст в поле не верный", expected, actual);
    }

    @Test
    public void checkPanel7() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.cancellationQuestion);
        downListPage.clickList(downListPage.cancellationQuestion);
        String expected = "Да, пока самокат не привезли." +
                " Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = downListPage.getTextFromDropdownField(downListPage.cancellationAnswer);
        Assert.assertEquals("Текст в поле не верный", expected, actual);
    }

    @Test
    public void checkPanel8() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.MkadQuestion);
        downListPage.clickList(downListPage.MkadQuestion);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = downListPage.getTextFromDropdownField(downListPage.MkadAnswer);
        Assert.assertEquals("Текст в поле не верный", expected, actual);
    }
}
