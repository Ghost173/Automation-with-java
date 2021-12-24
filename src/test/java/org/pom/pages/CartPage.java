package org.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pom.base.BasePage;

public class CartPage extends BasePage {

    private final By clickCheckoutBtn = By.xpath("//a[normalize-space()='Proceed to checkout']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage clickCheckoutBtn() {
        driver.findElement(clickCheckoutBtn).click();
        return new CheckoutPage(driver);
    }
}
