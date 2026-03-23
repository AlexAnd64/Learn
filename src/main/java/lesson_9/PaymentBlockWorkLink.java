package lesson_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentBlockWorkLink {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        System.out.println("Проверка работоспособности ссылки 'Подробнее о сервисе':");
        try {
            WebElement cookieBanner = driver.findElement(By.xpath("//div[@class = 'cookie__wrapper']"));
            if (cookieBanner.isDisplayed()) {
                WebElement acceptButton = driver.findElement(By.xpath("//button[@id = 'cookie-agree']"));
                acceptButton.click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.invisibilityOf(cookieBanner));
            }
        } catch (NoSuchElementException e) {
            System.out.println("Баннер cookies не найден — продолжаем");
        }
        String titleAboutService = "Порядок оплаты и безопасность интернет платежей";
        WebElement linkAboutService = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/a"));
        linkAboutService.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(webDriver -> !webDriver.getTitle().isEmpty());
        String titleOpenedPage = driver.getTitle();
        if (titleOpenedPage.equals(titleAboutService)) {
            System.out.println("Переход по ссылке осуществлен!");
        } else {
            System.out.println("Переход по ссылке не сработал!");
        }
        driver.quit();
    }
}