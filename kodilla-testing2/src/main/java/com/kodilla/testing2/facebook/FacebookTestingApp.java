package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = " (//span[normalize-space()='Allow all cookies']/ancestor::div[@role='button']) [2] ";
    public static final String XPATH_NEW_ACCOUNT = "//*[@data-testid='open-registration-form-button']";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]" ;
    public static final String XPATH_DAY = "//*[@id=\"day\"]" ;
    public static final String XPATH_YEAR = "//*[@id=\"year\"]" ;


    private static void acceptCookiesIfPresent(WebDriver driver) {
        driver.findElements(By.xpath(XPATH_COOKIES))
                .stream()
                .filter(WebElement::isDisplayed)
                .findFirst()
                .ifPresent(WebElement::click);
    }

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/?locale=en_US");

        acceptCookiesIfPresent(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement newAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_NEW_ACCOUNT)));
        newAccountButton.click();

        acceptCookiesIfPresent(driver);

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectCombo);
        selectMonth.selectByValue("1");

        selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByValue("22");

        selectCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectCombo);
        selectYear.selectByValue("1985");
    }
}
