package lesson_10Test;

import lesson_10.PaymentBlockPageObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithUsePageObjectPaymentBlockTitleTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void shouldFindTitlePaymentBlock() {
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.closeBannerCookie(driver);
        String actual = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/h2")).getText().trim();
        String expected = "Онлайн пополнение\n" + "без комиссии";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }
}