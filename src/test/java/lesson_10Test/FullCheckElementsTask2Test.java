package lesson_10Test;

import lesson_10.PaymentBlockPageObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FullCheckElementsTask2Test {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.closeBannerCookie(driver);
    }

    @Test
    public void buttonContinueShouldWork() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectCommunicationServices(driver);
        select.preconditions(driver);
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@class = 'button button__default ']"));
        buttonSubmit.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class = 'payment-widget-iframe']")));

        String expected = "100.00 BYN";
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() ='100.00 BYN']"))).getText().trim();
        Assertions.assertEquals(actual, expected);
        System.out.println("Сумма в заголовке сходится");

        expected = "Оплатить 100.00 BYN";
        actual = driver.findElement(By.xpath("//button[@class = 'colored disabled']/span")).getText().trim();
        Assertions.assertEquals(actual, expected);
        System.out.println("Сумма на кнопке сходится");

        expected = "Оплата: Услуги связи Номер:375297777777";
        actual = driver.findElement(By.xpath("//div[@class = 'pay-description__text']/span")).getText().trim();
        Assertions.assertEquals(actual, expected);
        System.out.println("Номер телефона совпадает");

        expected = "Номер карты";
        actual = driver.findElement(By.xpath("//label[text() = 'Номер карты']")).getText().trim();
        Assertions.assertEquals(actual, expected);
        System.out.println("Плейсхолдер Номер карты соответствует");

        expected = "Срок действия";
        actual = driver.findElement(By.xpath("//label[text() = 'Срок действия']")).getText().trim();
        Assertions.assertEquals(actual, expected);
        System.out.println("Плейсхолдер срока действия совпадает");

        expected = "Имя и фамилия на карте";
        actual = driver.findElement(By.xpath("//label[text() = 'Имя и фамилия на карте']")).getText().trim();
        Assertions.assertEquals(actual, expected);
        System.out.println("Плейсхолдер имени и фамилии совпадает");

        expected = "CVC";
        actual = driver.findElement(By.xpath("//label[text() = 'CVC']")).getText().trim();
        Assertions.assertEquals(actual, expected);
        System.out.println("Плейсхолдер CVC совпадает");
        System.out.println(" ");

        boolean isVisible = false;
        actual = "Иконка 'Visa' не найдена";
        expected = "Иконка 'Visa' видима!";
        WebElement iconVisa = driver.findElement(By.xpath("//img[@class='ng-tns-c2797898136-1 ng-star-inserted']"));
        isVisible = iconVisa.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'Visa' видима!";
        } else {
            actual = "Иконка 'Visa' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        System.out.println("Иконка 'Visa' видна");
        driver.quit();
    }

    @Test
    public void IconsFromPlaceholderMustBeVisibility() {
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.preconditions(driver);
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@class = 'button button__default ']"));
        buttonSubmit.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class = 'payment-widget-iframe']")));
        String expected = "";
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text() = 'Сохранить данные карты для последующих оплат']"))).getText().trim();

        boolean isVisible = false;
        actual = "Иконка 'Visa' не найдена";
        expected = "Иконка 'Visa' видима!";
        WebElement iconVisa = driver.findElement(By.xpath("//img[@class='ng-tns-c2797898136-1 ng-star-inserted']"));
        isVisible = iconVisa.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'Visa' видима!";
        } else {
            actual = "Иконка 'Visa' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        System.out.println("Иконка 'Visa' видна");

        isVisible = false;
        actual = "Иконка 'Master' не найдена";
        expected = "Иконка 'Master' видима!";
        WebElement iconMaster = driver.findElement(By.xpath("//img[@class='ng-tns-c2797898136-1 ng-star-inserted']"));
        isVisible = iconMaster.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'Master' видима!";
        } else {
            actual = "Иконка 'Master' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        System.out.println("Иконка 'Master' видна");

        isVisible = false;
        actual = "Иконка 'Белкарт' не найдена";
        expected = "Иконка 'Белкарт' видима!";
        WebElement iconBelCard = driver.findElement(By.xpath("//img[@class='ng-tns-c2797898136-1 ng-star-inserted']"));
        isVisible = iconBelCard.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'Белкарт' видима!";
        } else {
            actual = "Иконка 'Белкарт' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        System.out.println("Иконка 'Белкарт' видна");

        isVisible = false;
        actual = "Иконка 'World' не найдена";
        expected = "Иконка 'World' видима!";
        WebElement iconWorld = driver.findElement(By.xpath("//img[@src = 'assets/images/payment-icons/card-types/maestro-system.svg']"));
        isVisible = iconWorld.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'World' видима!";
        } else {
            actual = "Иконка 'World' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        System.out.println("Иконка 'World' видна");
        driver.quit();
    }
}