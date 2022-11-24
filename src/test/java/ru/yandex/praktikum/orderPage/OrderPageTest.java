package ru.yandex.praktikum.orderPage;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.yandex.praktikum.basePageTest.BasePageTest;
import ru.yandex.praktikum.data.Client;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class OrderPageTest extends BasePageTest {

    private Client ivan = new Client("Иван", "Иванов", "г.Москва, Севанская 8, кв 36",
            "81233455678", "Комментарий для курьера");

    private Client victor = new Client("Виктор", "Викторов", "г.Москва, Кутузовский 10, кв 36",
            "812000765328", "Без комментариев");

    private final Object[] getTestData() {
        return new Object[]{
                new Object[]{"top", ivan},
                new Object[]{"bottom", ivan},
                new Object[]{"bottom", victor},
                new Object[]{"top", victor}
        };
    }

    @Test
    @Parameters(method = "getTestData")
    public void rentScooterTest(String buttonPosition, Client client) {
        OrderPage orderPage = new OrderPage(driver);
        switch (buttonPosition) {
            case ("top"):
                orderPage.clickOrderButtonTop();
            case ("bottom"):
                orderPage.scrollToElement(orderPage.bottomOrderButton);
                orderPage.clickOrderButtonBottom();
        }
        orderPage.inputName(client.getName());
        orderPage.inputLastName(client.getLastName());
        orderPage.inputAddress(client.getAddress());
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(client.getPhone());
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(client.getComment());
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

}