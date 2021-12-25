package org.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    public WebDriver initializeDriver() {
//        System.setProperty("webdriver.chrome.driver", "/home/prakash/IdeaProjects/Askohmautomation_dec/driver/chromedriver");
      WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
