package lesson_9Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentBlockWorkLinkTest {
    @Test
    public void shouldFindAndEqualsCurrentTitleOnOpenedPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        try {
            WebElement cookieBanner = driver.findElement(By.xpath("//div[@class = 'cookie__wrapper']"));
            if (cookieBanner.isDisplayed()) {
                WebElement acceptButton = driver.findElement(By.xpath("//button[@id = 'cookie-agree']"));
                acceptButton.click();

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                wait.until(ExpectedConditions.invisibilityOf(cookieBanner));
            }
        } catch (
                NoSuchElementException e) {
            System.out.println("Баннер cookies не найден — продолжаем");
        }
        String expected = "Порядок оплаты и безопасность интернет платежей";
        WebElement linkAboutService = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/a"));
        linkAboutService.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(webDriver -> !webDriver.getTitle().isEmpty());
        String actual = driver.getTitle();
        Assertions.assertEquals(expected, actual);
        System.out.println("Тест успешен, ссылка кликабельна и ведет на нужную страницу.");
        driver.quit();
    }
}