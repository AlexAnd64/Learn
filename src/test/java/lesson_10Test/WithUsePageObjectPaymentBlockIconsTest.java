package lesson_10Test;

import lesson_10.PaymentBlockPageObject;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithUsePageObjectPaymentBlockIconsTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        PaymentBlockPageObject method = new PaymentBlockPageObject();
        method.closeBannerCookie(driver);
    }

    @Test
    void shouldFindIconVisa() {
        boolean isVisible = false;
        String actual = "Иконка не найдена";
        String expected = "Иконка 'Visa' видима!";
        WebElement visaIcon = driver.findElement(By.xpath("//img[@alt = 'Visa']"));
        isVisible = visaIcon.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'Visa' видима!";
        } else {
            actual = "Иконка 'Visa' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    void shouldFindIconVerifiedByVisa() {
        boolean isVisible = false;
        String actual = "Иконка не найдена";
        String expected = "Иконка 'Verified By Visa' видима!";
        WebElement visaIcon = driver.findElement(By.xpath("//img[@alt = 'Verified By Visa']"));
        isVisible = visaIcon.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'Verified By Visa' видима!";
        } else {
            actual = "Иконка 'Verified By Visa' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void shouldFindIconMasterCard() {
        boolean isVisible = false;
        String actual = "Иконка не найдена";
        String expected = "Иконка 'MasterCard' видима!";
        WebElement visaIcon = driver.findElement(By.xpath("//img[@alt = 'MasterCard']"));
        isVisible = visaIcon.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'MasterCard' видима!";
        } else {
            actual = "Иконка 'MasterCard' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void shouldFindIconBelCard() {
        boolean isVisible = false;
        String actual = "Иконка не найдена";
        String expected = "Иконка 'Белкарт' видима!";
        WebElement visaIcon = driver.findElement(By.xpath("//img[@alt = 'Белкарт']"));
        isVisible = visaIcon.isDisplayed();
        if (isVisible) {
            actual = "Иконка 'Белкарт' видима!";
        } else {
            actual = "Иконка 'Белкарт' не отображается!";
        }
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }
}