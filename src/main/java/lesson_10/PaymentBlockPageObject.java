package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentBlockPageObject {
    private WebDriver driver;

    public void closeBannerCookie(WebDriver driver) {
        try {
            WebElement cookieBanner = driver.findElement(By.xpath("//div[@class = 'cookie__wrapper']"));
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'cookie__wrapper']")));
            if (cookieBanner.isDisplayed()) {
                WebElement acceptButton = driver.findElement(By.xpath("//button[@id = 'cookie-agree']"));
                acceptButton.click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                wait.until(ExpectedConditions.invisibilityOf(cookieBanner));
            }
        } catch (NoSuchElementException e) {
            System.out.println("Баннер cookies не найден — продолжаем");
        }
    }

    public void selectCommunicationServices(WebDriver driver) {
        WebElement buttonDropDown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        buttonDropDown.click();
        WebElement communicationServices = driver.findElement(By.xpath("//p[text() = 'Услуги связи']"));
        communicationServices.click();
        System.out.println("Выбран пункт 'Услуги связи'");
    }

    public void selectHomeInternet(WebDriver driver) {
        WebElement buttonDropDown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        buttonDropDown.click();
        WebElement homeInternet = driver.findElement(By.xpath("//p[text() = 'Домашний интернет']"));
        homeInternet.click();
        System.out.println("Выбран пункт 'Домашний интернет'");
    }

    public void selectInstallmentPlan(WebDriver driver) {
        WebElement buttonDropDown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        buttonDropDown.click();
        WebElement installmentPlan = driver.findElement(By.xpath("//p[text() = 'Рассрочка']"));
        installmentPlan.click();
        System.out.println("Выбран пункт 'Рассрочка'");
    }

    public void selectDebt(WebDriver driver) {
        WebElement buttonDropDown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        buttonDropDown.click();
        WebElement installmentPlan = driver.findElement(By.xpath("//p[text() = 'Задолженность']"));
        installmentPlan.click();
        System.out.println("Выбран пункт 'Задолженность'");
    }

    public void preconditions(WebDriver driver) {
        PaymentBlockPageObject select = new PaymentBlockPageObject();
        select.selectCommunicationServices(driver);
        WebElement inputPhoneNumber = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
        inputPhoneNumber.click();
        inputPhoneNumber.sendKeys("297777777");
        WebElement inputCoast = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
        inputCoast.click();
        inputCoast.sendKeys("100");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id = 'connection-email']"));
        inputEmail.click();
        inputEmail.sendKeys("aston@yandex.ru");
    }
}