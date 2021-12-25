package org.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    public WebDriver initializeDriver() {
      WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.addArguments("-headless");
        chromeOption.addArguments("window-size=1920,1080");
        WebDriver driver = new ChromeDriver(chromeOption);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
