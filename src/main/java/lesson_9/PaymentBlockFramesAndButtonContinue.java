package lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentBlockFramesAndButtonContinue {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Заполняем поля формы онлайн пополнения баланса:");
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
        String nameProductType = "Услуги связи";
        WebElement productTypeNow = driver.findElement(By.xpath("//button[@class = 'select__header']/span[@class = 'select__now']"));
        if (nameProductType.equals(productTypeNow.getText())) {
            System.out.println("Тип продукта выбран верно.\nЗаполняем поля.");
        } else {
            WebElement productTypeButton = driver.findElement(By.xpath("//button[@class = 'select__header']"));
            productTypeButton.click();
            WebElement CommunicationService = driver.findElement(By.xpath("//p[contains(text(), Услуги связи)]"));
            CommunicationService.click();
        }
        WebElement inputPhoneNumber = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
        inputPhoneNumber.click();
        inputPhoneNumber.sendKeys("297777777");

        WebElement inputCoast = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
        inputCoast.click();
        inputCoast.sendKeys("100");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id = 'connection-email']"));
        inputEmail.click();
        inputEmail.sendKeys("aston@yandex.ru");

        System.out.println("Все поля заполнены, нажимаем кнопку 'Продолжить'");
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@class = 'button button__default ']"));
        buttonSubmit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class = 'payment-widget-iframe']")));

        System.out.println("Фрейм переключился");
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() ='100.00 BYN']")));

        if (element.isDisplayed()) {
            System.out.println("Успешно, переход к фрейму окна оплаты подтвержден!");
        } else {
            System.out.println("Ошибка, неверно заполнены обязательные поля");
        }
        driver.quit();
    }
}