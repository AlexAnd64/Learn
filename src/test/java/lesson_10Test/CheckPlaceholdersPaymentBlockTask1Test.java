package lesson_10Test;

import lesson_10.PaymentBlockPageObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPlaceholdersPaymentBlockTask1Test {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.closeBannerCookie(driver);
    }

    // -------------- УСЛУГИ СВЯЗИ ------------------
    @Test
    public void checkPhoneInputPlaceHolderCS() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectCommunicationServices(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'phone']")).getAttribute("placeholder");
        String expected = "Номер телефона";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkAmountInputPlaceHolderCS() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectCommunicationServices(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'total_rub']")).getAttribute("placeholder");
        String expected = "Сумма";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkEmailPlaceHolderCS() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectCommunicationServices(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'email']")).getAttribute("placeholder");
        String expected = "E-mail для отправки чека";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    // -------------- ДОМАШНИЙ ИНТЕРЕНТ ------------------
    @Test
    public void checkPhoneInputPlaceHolderHI() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectHomeInternet(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'phone']")).getAttribute("placeholder");
        String expected = "Номер телефона";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkAmountInputPlaceHolderHI() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectHomeInternet(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'total_rub']")).getAttribute("placeholder");
        String expected = "Сумма";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkEmailPlaceHolderHI() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectHomeInternet(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'email']")).getAttribute("placeholder");
        String expected = "E-mail для отправки чека";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    // -------------- РАССРОЧКА ------------------
    @Test
    public void checkPhoneInputPlaceHolderIP() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectInstallmentPlan(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'phone']")).getAttribute("placeholder");
        String expected = "Номер телефона";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkAmountInputPlaceHolderIP() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectInstallmentPlan(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'total_rub']")).getAttribute("placeholder");
        String expected = "Сумма";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkEmailPlaceHolderIP() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectInstallmentPlan(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'email']")).getAttribute("placeholder");
        String expected = "E-mail для отправки чека";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    // -------------- ЗАДОЛЖЕННОСТЬ ------------------
    @Test
    public void checkPhoneInputPlaceHolderDebt() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectDebt(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'phone']")).getAttribute("placeholder");
        String expected = "Номер телефона";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkAmountInputPlaceHolderDebt() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectDebt(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'total_rub']")).getAttribute("placeholder");
        String expected = "Сумма";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void checkEmailPlaceHolderDebt() {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectDebt(driver);
        String actual = driver.findElement(By.xpath("//input[@class = 'email']")).getAttribute("placeholder");
        String expected = "E-mail для отправки чека";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }
}