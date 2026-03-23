package lesson_9Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentBlockFramesAndButtonContinueTest {
    public static WebDriver driver;

    public static void closeBannerCookie() {
        try {
            WebElement cookieBanner = driver.findElement(By.xpath("//div[@class = 'cookie__wrapper']"));
            if (cookieBanner.isDisplayed()) {
                WebElement acceptButton = driver.findElement(By.xpath("//button[@id = 'cookie-agree']"));
                acceptButton.click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                wait.until(ExpectedConditions.invisibilityOf(cookieBanner));
                System.out.println("Баннер cookies закрыт");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Баннер cookies не найден — продолжаем");
        }
    }

    @BeforeAll
    public static void setUpClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        closeBannerCookie();
    }

    @Test
    public void shouldCompareTheValueOfDropDownList() {
        String expected = "Услуги связи";
        String actual = driver.findElement
                (By.xpath("//button[@class = 'select__header']/span[@class = 'select__now']")).getText().trim();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonContinueShouldWork() {
        WebElement inputPhoneNumber = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
        inputPhoneNumber.click();
        inputPhoneNumber.sendKeys("297777777");

        WebElement inputCoast = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
        inputCoast.click();
        inputCoast.sendKeys("100");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id = 'connection-email']"));
        inputEmail.click();
        inputEmail.sendKeys("aston@yandex.ru");

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@class = 'button button__default ']"));
        buttonSubmit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class = 'payment-widget-iframe']")));

        String expected = "100.00 BYN";
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() ='100.00 BYN']"))).getText().trim();

        Assertions.assertEquals(actual, expected);
        driver.quit();
    }

    @Test
    public void buttonContinueShouldWorkWithOtherSum() {
        WebElement inputPhoneNumber = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
        inputPhoneNumber.click();
        inputPhoneNumber.sendKeys("297777777");

        WebElement inputCoast = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
        inputCoast.click();
        inputCoast.sendKeys("200");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id = 'connection-email']"));
        inputEmail.click();
        inputEmail.sendKeys("aston@yandex.ru");

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@class = 'button button__default ']"));
        buttonSubmit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class = 'payment-widget-iframe']")));

        String expected = "100.00 BYN";
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() ='100.00 BYN']"))).getText().trim();

        Assertions.assertEquals(actual, expected);
        driver.quit();
    }
}