package lesson_10Test;

import lesson_10.PaymentBlockPageObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WithUsePageObjectPaymentBlockWorkLinkTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void shouldFindAndEqualsCurrentTitleOnOpenedPage() {
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.closeBannerCookie(driver);
        String expected = "Порядок оплаты и безопасность интернет платежей";
        WebElement linkAboutService = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/a"));
        linkAboutService.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(webDriver -> !webDriver.getTitle().isEmpty());
        String actual = driver.getTitle();
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }
}