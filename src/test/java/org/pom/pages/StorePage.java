package org.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pom.base.BasePage;

public class StorePage extends BasePage {

    private final By searchFld = By.xpath("//input[@id='woocommerce-product-search-field-0']");
    private final By searchBtn = By.cssSelector("button[value='Search']");
    private final By searchTitle = By.xpath("//h1[contains(text(),'Search results: “blue”')]");
    private final By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
    private final By clickViewCartLable = By.cssSelector("a[title='View cart']");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage enterTextInSearchFld (String txt) {
        driver.findElement(searchFld).sendKeys(txt);
        return this;
    }

    public StorePage clickSearchBtn() {
        driver.findElement(searchBtn).click();
        return this;
    }

    public String getTitle () {
       return driver.findElement(searchTitle).getText();
    }

    public StorePage clickAddToCartBtn() {
        driver.findElement(addToCartBtn).click();
        return this;
    }

    public CartPage clickViewcartLbl() {
        driver.findElement(clickViewCartLable).click();
        return new CartPage(driver);
    }
}
