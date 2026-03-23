package lesson_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentBlockTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        System.out.println("Проверка названия блока:");
        String title = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/h2")).getText().trim();
        System.out.println(title);
        driver.quit();
    }
}