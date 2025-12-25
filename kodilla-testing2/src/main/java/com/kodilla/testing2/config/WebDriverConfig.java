package com.kodilla.testing2.config;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String CHROME = "CHROME_DRIVER";
    public final static String FIREFOX = "FIREFOX_DRIVER";

    public static WebDriver getDriver(final String driver) {
        /*System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Firefox\\geckodriver.exe");
*/
        if (CHROME.equals(driver)) {
            WebDriverManager.chromedriver().setup(); //Znajdź, pobierz i skonfiguruj poprawny chromedriver dla mojego systemu i przeglądarki
            return new ChromeDriver();     //uruchomienie przeglądarki (tu juz zna ścieżkę do drivera)
        }
        else if (FIREFOX.equals(driver)) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        return null;
    }
}
