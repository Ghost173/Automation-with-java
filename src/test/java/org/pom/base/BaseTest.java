package org.pom.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pom.factory.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startDriver() {
        driver = new DriverManager().initializeDriver();
    }

    @AfterMethod
    public void quitDriver(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            File destFile = new File("scrdev" + File.separator + "browser" + File.separator +
                    result.getTestClass().getRealClass().getSimpleName()+ "_" +
                    result.getMethod().getMethodName() + ".png"
                    );
            takeScrenshot(destFile);
        }

        driver.quit();
    }


    public void takeScrenshot(File destFile) throws IOException {
        TakesScreenshot takescreenshot = (TakesScreenshot) driver;
        File srcFile = takescreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, destFile);
    }
}
