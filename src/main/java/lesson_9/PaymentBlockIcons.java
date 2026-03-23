package lesson_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentBlockIcons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        System.out.println("Проверка наличия логотипов платёжных систем:");
        try {
            WebElement visaIcon = driver.findElement(By.xpath("//img[@alt='Visa']"));
            if (visaIcon.isDisplayed()) {
                System.out.println("Иконка 'Visa' на месте!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка! Иконка 'Visa' не отображается!");
        }
        try {
            WebElement verifiedByVisa = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
            if (verifiedByVisa.isDisplayed()) {
                System.out.println("Иконка 'Verified By Visa' на месте!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка! Иконка 'Verified By Visa' не отображается!");
        }
        try {
            WebElement MasterCard = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
            if (MasterCard.isDisplayed()) {
                System.out.println("Иконка 'MasterCard' на месте!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка! Иконка 'MasterCard' не отображается!");
        }
        try {
            WebElement BelCard = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
            if (BelCard.isDisplayed()) {
                System.out.println("Иконка 'Белкарт' на месте!");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка! Иконка 'Белкарт' не отображается!");
        }
        driver.quit();
    }
}