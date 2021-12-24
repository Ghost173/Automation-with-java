package org.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pom.base.BasePage;

public class CheckoutPage extends BasePage {

    private final By enterFirstname = By.id("billing_first_name");
    private final By enterLastName = By.id("billing_last_name");
    private final By enterCompanyName = By.id("billing_company");
    private final By enterStreetAddressLineOne = By.id("billing_address_1");
    private final By enterTown = By.id("billing_city");
    private final By enterZipCode = By.id("billing_postcode");
    private final By enterPhoneNumber = By.id("billing_phone");
    private final By enterEmailAddress = By.id("billing_email");
    private final By clickPlaceOrderBtn = By.id("place_order");


    private final By clickhereTologinBtn = By.xpath("//a[normalize-space()='Click here to login']");
    private final By enterUsername = By.id("username");
    private final By enterPassword = By.id("password");
    private final By clickLoginBtn = By.cssSelector("button[value='Login']");


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage clickhereTologinBtn() {
        driver.findElement(clickhereTologinBtn).click();
        return this;
    }

    public CheckoutPage enterUsername(String username) {
        driver.findElement(enterUsername).sendKeys(username);
        return this;
    }

    public CheckoutPage enterPassword(String password) {
        driver.findElement(enterPassword).sendKeys(password);
        return this;
    }

    public CheckoutPage clickLoginBtn() {
        driver.findElement(clickLoginBtn).click();
        return this;
    }

    public CheckoutPage enterFristnameInFld(String fname) {
        driver.findElement(enterFirstname).clear();
        driver.findElement(enterFirstname).sendKeys(fname);
        return this;
    }

    public CheckoutPage enterLastNameininFld(String lname) {
        driver.findElement(enterLastName).clear();
        driver.findElement(enterLastName).sendKeys(lname);
        return this;
    }

    public CheckoutPage enterCompanyNameiNfld(String company) {
        driver.findElement(enterCompanyName).clear();
        driver.findElement(enterCompanyName).sendKeys(company);
        return this;
    }

    public CheckoutPage enterBllingaddLineone(String addressl) {
        driver.findElement(enterStreetAddressLineOne).clear();
        driver.findElement(enterStreetAddressLineOne).sendKeys(addressl);
        return this;
    }

    public CheckoutPage enterTownInfld(String town) {
        driver.findElement(enterTown).clear();
        driver.findElement(enterTown).sendKeys(town);
        return this;
    }

    public CheckoutPage enterPosteCodeinFld(String postcode) {
        driver.findElement(enterZipCode).clear();
        driver.findElement(enterZipCode).sendKeys(postcode);
        return this;
    }

    public CheckoutPage enterPhoneInFld(String phone) {
        driver.findElement(enterPhoneNumber).clear();
        driver.findElement(enterPhoneNumber).sendKeys(phone);
        return this;
    }

    public CheckoutPage enterEmailInfld(String email) {
        driver.findElement(enterEmailAddress).clear();
        driver.findElement(enterEmailAddress).sendKeys(email);
        return this;
    }

    public OrderConfirmPage ClickprocesstoCheckoutBtn() {
        driver.findElement(clickPlaceOrderBtn).click();
        return new OrderConfirmPage(driver);
    }


}
