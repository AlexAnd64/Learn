package lesson_9Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentBlockIconsTest {
    public static WebDriver driver;

    public static void closeBannerCookie() {
        try {
            WebElement cookieBanner = driver.findElement(By.xpath("//div[@class = 'cookie__wrapper']"));
            if (cookieBanner.isDisplayed()) {
                WebElement acceptButton = driver.findElement(By.xpath("//button[@id = 'cookie-agree']"));
                acceptButton.click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                wait.until(ExpectedConditions.invisibilityOf(cookieBanner));
                System.out.println("Баннер cookies закрыт");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Баннер cookies не найден — продолжаем");
        }
    }

    @BeforeAll
    public static void setUpClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        closeBannerCookie();
    }

    @AfterAll
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
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
    }
}