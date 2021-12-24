package org.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pom.base.BasePage;

public class HomePage extends BasePage {

    private final  By storeMenuLink = By.xpath("//li[@id='menu-item-1227']//a[@class='menu-link'][normalize-space()='Store']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public StorePage clickStoreMenuLink() {
        driver.findElement(storeMenuLink).click();
        return new StorePage(driver);
    }

}
