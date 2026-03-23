package lesson_9Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentBlockTitleTest {
    @Test
    public void shouldFindTitlePaymentBlock() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        String actual = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/h2")).getText().trim();
        String expected = "Онлайн пополнение\n" + "без комиссии";
        Assert.assertEquals(expected, actual);
        driver.quit();
    }
}