package org.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pom.base.BasePage;

public class OrderConfirmPage extends BasePage {

    private final By getConfirmText = By.cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received");

    public OrderConfirmPage(WebDriver driver) {
        super(driver);
    }

    public String getOrderConfirmSuccessMgs(){
       return driver.findElement(getConfirmText).getText();
    }
}
