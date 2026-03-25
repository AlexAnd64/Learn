package lesson_10Test;

import lesson_10.PaymentBlockPageObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WithUsePageObjectButtonContinueTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.closeBannerCookie(driver);
    }

    @Test
    public void buttonContinueShouldWork() {
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.preconditions(driver);
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@class = 'button button__default ']"));
        buttonSubmit.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class = 'payment-widget-iframe']")));
        String expected = "";
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text() = 'Сохранить данные карты для последующих оплат']"))).getText().trim();
        expected = "100.00 BYN";
        actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() ='100.00 BYN']"))).getText().trim();
        Assertions.assertEquals(actual, expected);
        driver.quit();
    }
}