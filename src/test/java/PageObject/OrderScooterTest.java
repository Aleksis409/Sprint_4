package PageObject;

    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.Parameterized;


    @RunWith(Parameterized.class)

public class OrderScooterTest extends BaseTest {


        private final String positionOrderBottom; //нажатие верхней кнопки "Заказать" - topOrderButton, нижней кнопки -  bottomOrderButton
        private final String name;
        private final String lastName;
        private final String address;
        private final String metroStation;
        private final String telefon;
        private final String delyveryData;
        private final String rentalPeriod;
        private final String scooterColor; // можно выбрать "black" или "grey", все остальное игнорируется
        private final String commentsForCourier;


        public OrderScooterTest(String positionOrderBottom, String name, String lastName, String address, String metroStation, String telefon,
                                       String delyveryData, String rentalPeriod, String scooterColor, String commentsForCourier) {

            this.positionOrderBottom = positionOrderBottom;
            this.name = name;
            this.lastName = lastName;
            this.address = address;
            this.metroStation = metroStation;
            this.telefon = telefon;
            this.delyveryData = delyveryData;
            this.rentalPeriod = rentalPeriod;
            this.scooterColor = scooterColor;
            this.commentsForCourier = commentsForCourier;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"topOrderButton", "Ив", "Зю", "5 Сим", "Сокольники", "+1234567890", "01.08.2022", "сутки", "black", "Двадцать Четыре Символа."},
                    {"topOrderButton", "ПятнадцатьБуквъ", "ПятнадцатьБуквъ", "49 симв-в, 123456789 АБВГДЕЁЖ. абвгдеёж- 12345678", "Динамо", "123456789012", "31.08.2022", "семеро суток", "grey", ""},
                    {"bottomOrderButton", "К а", "ПятнадцатьБуквЪ", "5.Сим", "Лубянка", "+12345678901", "01.09.2022", "двое суток", "", "Двадцать-Четыре, Символа"},
                    {"bottomOrderButton", "Пятнадцать Букв", "Пу", "49 симв-в, 123456789 АБВГДЕЁЖ. абвгдеёж- 12345678", "Парк Победы", "12345678901", "30.09.2022", "пятеро суток", "", ""},
            };
        }

        @Test
        public void scooterOrderPositivTest() {
            MainPage mainPage = new MainPage(driver);
            mainPage.openPage();
            mainPage.clickCookieButton();
            mainPage.clickOrderButton(positionOrderBottom);

            FirstOrderPage firstOrderPage = new FirstOrderPage(driver);
            firstOrderPage.inputName(name);
            firstOrderPage.inputLastName(lastName);
            firstOrderPage.inputAddress(address);
            firstOrderPage.inputMetroStation(metroStation);
            firstOrderPage.inputTelefon(telefon);
            firstOrderPage.clickBottonNext();

            SecondOrderPage secondOrderPage = new SecondOrderPage(driver);
            secondOrderPage.inputScooterDelyveryDate(delyveryData);
            secondOrderPage.inputRentalPeriod(rentalPeriod);
            secondOrderPage.inputScooterColor(scooterColor);
            secondOrderPage.inputCommentsForCourier(commentsForCourier);
            secondOrderPage.clickOrderButton();
            secondOrderPage.clickOrderButtonYes(); //в хроме баг - не нажимается кнопка "Да" в сообщении "Хотите оформить заказ"
            secondOrderPage.orderHasBeenPlaced();
        }
}





