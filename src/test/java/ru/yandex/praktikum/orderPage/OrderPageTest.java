package ru.yandex.praktikum.orderPage;

import org.junit.Test;
import ru.yandex.praktikum.basePageTest.BasePageTest;

import static org.junit.Assert.assertEquals;

public class OrderPageTest extends BasePageTest {

    // Тестовые данные  1
    protected String nameIvan = "Иван";
    protected String lastNameIvan = "Иванов";
    protected String addressIvan = "г.Москва, Севанская 8, кв 36";
    protected String telIvan = "81233455678";
    protected String commentIvan = "Комментарий для курьера";
    //Тестовые данные 2
    protected String nameVictor = "Виктор";
    protected String lastNameVictor = "Викторов";
    protected String addressVictor = "г.Москва, Кутузовский 10, кв 36";
    protected String telVictor = "812000765328";
    protected String commentVictor = "Без комментариев";

    // Тест для Chrome клик по верхней кнопке заказа
    @Test
    public void checkRentOrderChromeOfClickTopButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButtonTop();
        orderPage.inputName(nameIvan);
        orderPage.inputLastName(lastNameIvan);
        orderPage.inputAddress(addressIvan);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telIvan);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentIvan);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //   Тест для FireFox клик по верхней кнопке заказа
    @Test
    public void checkRentOrderFireFoxClickTopButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButtonTop();
        orderPage.inputName(nameVictor);
        orderPage.inputLastName(lastNameVictor);
        orderPage.inputAddress(addressVictor);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telVictor);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentVictor);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //     Тест для Chrome клик по нижней кнопке заказа
    @Test
    public void checkRentOrderChromeClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButtonBottom();
        orderPage.inputName(nameIvan);
        orderPage.inputLastName(lastNameIvan);
        orderPage.inputAddress(addressIvan);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telIvan);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentIvan);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //    Тест для FireFox  клик по нижней кнопке заказа
    @Test
    public void checkRentOrderFireFoxClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButtonBottom();
        orderPage.inputName(nameVictor);
        orderPage.inputLastName(lastNameVictor);
        orderPage.inputAddress(addressVictor);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telVictor);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentVictor);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }
}