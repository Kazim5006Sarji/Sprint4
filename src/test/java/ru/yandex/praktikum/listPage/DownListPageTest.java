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


    @Test
    public void scooterHelpAnswersTest() {
        DownListPage downListPage = new DownListPage(driver);
        String[] textsToCheck = new String[]{
                howMuchCostAnswerText,
                severalscooterAnswerText,
                rentTimeAnswerText,
                todayOrderAnswerText,
                extendReturnAnswerText,
                chargerAnswerText,
                cancellationAnswerText,
                MkadAnswerText};
        By[] elementsToCheck = new By[]{
                downListPage.howMuchCostQuestion,
                downListPage.severalScooterQuestion,
                downListPage.rentTimeQuestion,
                downListPage.todayOrderQuestion,
                downListPage.extendReturnQuestion,
                downListPage.chargerQuestion,
                downListPage.cancellationQuestion,
                downListPage.MkadQuestion};
        for (int i = 0; i < textsToCheck.length; i++) {
            downListPage.clickElement(elementsToCheck[i]);
            downListPage.waitForElement(downListPage.getAnswer(elementsToCheck[i]));
            Assert.assertEquals("Текст в поле " + elementsToCheck[i] + " не соответствует " + textsToCheck[i],
                    textsToCheck[i], driver.findElement(downListPage.getAnswer(elementsToCheck[i])).getText());
        }
    }

}
