package PageObject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainPageImportantQuestionsTest extends BaseTest{

    //Выпадающий список "Вопросы о важном"
    //значение ответа на вопрос "Сколько это стоит? И как оплатить?"
    private final String answerAboutTheImportantItemHowMuchItCosts = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    //значение ответа на вопрос"Хочу сразу несколько самокатов! Так можно?"
    private final String answerAboutTheImportantItemSeveralScooters = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    //значение ответа на вопрос "Как рассчитывается время аренды?"
    private final String answerAboutTheImportantRentalTime = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    //значение ответа на вопрос "Можно ли заказать самокат прямо на сегодня?"
    private final String answerAboutTheImportantItemScooterToday = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    //значение ответа на вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    private final String answerAboutTheImportantItemExtendTheOrder = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    //значение ответа на вопрос "Вы привозите зарядку вместе с самокатом?"
    private final String answerAboutTheImportantItemChargingForScooter = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    //значение ответа на вопрос "Можно ли отменить заказ?"
    private final String answerAboutTheImportantItemCancelTheOrder = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    //значение ответа на вопрос "Я живу за МКАДом, привезёте?"
    private final String answerAboutTheImportantItemLiveBeyondTheMKAD = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    // тест соответствия ответа вопросу "Сколько это стоит? И как оплатить?"
    @Test
    public void questionsAboutTheImportantItemHowMuchItCostsComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemHowMuchItCosts();
        String actual = mainPage.actualAnswerAboutTheImportantItemHowMuchItCosts();
        assertEquals("Ответ несоответствует вопросу!", answerAboutTheImportantItemHowMuchItCosts, actual);
    }

    // тест соответствия ответа вопросу "Хочу сразу несколько самокатов! Так можно?"
    @Test
    public void questionsAboutTheImportantItemSeveralScootersComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemSeveralScooters();
        String actual = mainPage.actualAnswerAboutTheImportantItemSeveralScooters();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemSeveralScooters, actual);
    }

    // тест соответствия ответа вопросу "Как рассчитывается время аренды?"
    @Test
    public void questionsAboutTheImportantRentalTimeComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantRentalTime();
        String actual = mainPage.actualAnswerAboutTheImportantRentalTime();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantRentalTime, actual);
    }

    // тест соответствия ответа вопросу "Можно ли заказать самокат прямо на сегодня?"
    @Test
    public void questionsAboutTheImportantItemScooterTodayComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemScooterToday();
        String actual = mainPage.actualAnswerAboutTheImportantItemScooterToday();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemScooterToday, actual);
    }

    // тест соответствия ответа вопросу "Можно ли продлить заказ или вернуть самокат раньше?"
    @Test
    public void questionsAboutTheImportantItemExtendTheOrderComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemExtendTheOrder();
        String actual = mainPage.actualAnswerAboutTheImportantItemExtendTheOrder();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemExtendTheOrder, actual);
    }

    // тест соответствия ответа вопросу "Вы привозите зарядку вместе с самокатом?"
    @Test
    public void questionsAboutTheImportantItemChargingForScooterComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemChargingForScooter();
         String actual = mainPage.actualAnswerAboutTheImportantItemChargingForScooter();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemChargingForScooter, actual);
    }

    // тест соответствия ответа вопросу "Можно ли отменить заказ?"
    @Test
    public void questionsAboutTheImportantItemCancelTheOrderComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemCancelTheOrder();
        String actual = mainPage.actualAnswerAboutTheImportantItemCancelTheOrder();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemCancelTheOrder, actual);
    }

    // тест соответствия ответа вопросу "Я жизу за МКАДом, привезёте?"
    @Test
    public void questionsAboutTheImportantItemLiveBeyondTheMKADComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemLiveBeyondTheMKAD();
        String actual = mainPage.actualAnswerAboutTheImportantItemLiveBeyondTheMKAD();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemLiveBeyondTheMKAD, actual);
    }


}
