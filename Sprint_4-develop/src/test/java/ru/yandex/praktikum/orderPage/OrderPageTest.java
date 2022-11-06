package ru.yandex.praktikum.orderPage;

import org.junit.Test;
import ru.yandex.praktikum.basePageTest.BasePageTest;

import static org.junit.Assert.assertEquals;

public class OrderPageTest extends BasePageTest {

    // Тестовые данные  1
    protected String nameTest1 = "Иван";
    protected String lastNameTest1 = "Иванов";
    protected String addressTest1 = "г.Москва, Севанская 8, кв 36";
    protected String telTest1 = "81233455678";
    protected String commentTest1 = "Комментарий для курьера";
    //Тестовые данные 2
    protected String nameTest2 = "Виктор";
    protected String lastNameTest2 = "Викторов";
    protected String addressTest2 = "г.Москва, Кутузовский 10, кв 36";
    protected String telTest2 = "812000765328";
    protected String commentTest2 = "Без комментариев";

    // Тест для Chrome клик через по верхней кнопке заказа
    @Test
    public void checkRentOrderChromeOfClickTopButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButtonTop();
        orderPage.inputName(nameTest1);
        orderPage.inputLastName(lastNameTest1);
        orderPage.inputAddress(addressTest1);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest1);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentTest1);
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
        orderPage.inputName(nameTest2);
        orderPage.inputLastName(lastNameTest2);
        orderPage.inputAddress(addressTest2);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest2);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentTest2);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //     Тест для Chrome клик через по нижней кнопке заказа
    @Test
    public void checkRentOrderChromeClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButtonBottom();
        orderPage.inputName(nameTest1);
        orderPage.inputLastName(lastNameTest1);
        orderPage.inputAddress(addressTest1);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest1);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentTest1);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }

    //    Тест для FireFox  клик через по нижней кнопке заказа
    @Test
    public void checkRentOrderFireFoxClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButtonBottom();
        orderPage.inputName(nameTest2);
        orderPage.inputLastName(lastNameTest2);
        orderPage.inputAddress(addressTest2);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest2);
        orderPage.clickButtonFurther();
        orderPage.enterDate();
        orderPage.dateInput();
        orderPage.blackColorChoice();
        orderPage.inputComment(commentTest2);
        orderPage.clickOnOrderButton();
        orderPage.clickBottomYes();
        String expected = "Посмотреть статус";
        String actual = orderPage.getTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expected, actual);
    }
}