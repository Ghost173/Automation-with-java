package org.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.base.BasePage;
import org.pom.objects.BillingAddress;

import java.time.Duration;
import java.util.List;

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
    private final By countryDropdown = By.id("billing_country");
    private final By slsetState = By.id("billing_state");
    private final By slectdirectbanktrfr = By.id("payment_method_cod");

    private final By overlay = By.cssSelector(".blockUI.blockOverlay");


    private final By clickhereTologinBtn = By.xpath("//a[normalize-space()='Click here to login']");
    private final By enterUsername = By.id("username");
    private final By enterPassword = By.id("password");
    private final By clickLoginBtn = By.cssSelector("button[value='Login']");


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    public CheckoutPage selectCountry (String contryName) {
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(contryName);
        return this;
    }

    public CheckoutPage seletState (String state) {
        Select select = new Select(driver.findElement(slsetState));
        select.selectByVisibleText(state);
        return this;
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
       List<WebElement> overlays = driver.findElements(overlay);
       if (overlays.size() > 0) {
           new WebDriverWait(driver, Duration.ofSeconds(15)).until(
                   ExpectedConditions.invisibilityOfAllElements(overlays)
           );
       }
        driver.findElement(clickPlaceOrderBtn).click();
        return new OrderConfirmPage(driver);
    }


    public CheckoutPage setBillingAddress (BillingAddress billingAddress) {
      return  enterFristnameInFld(billingAddress.getFirstName())
                .enterLastNameininFld(billingAddress.getLastName())
                .enterCompanyNameiNfld(billingAddress.getCompanytName())
                .enterBllingaddLineone(billingAddress.getAddressLineone())
                .enterTownInfld(billingAddress.getTown())
                .enterPosteCodeinFld(billingAddress.getPostCode())
                .enterPhoneInFld(billingAddress.getPhone())
                .enterEmailInfld(billingAddress.getEmail());
    }


    public CheckoutPage slectdirectbanktrfr() {
//        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(slectdirectbanktrfr));
        driver.findElement(slectdirectbanktrfr).click();
        return this;
    }

}
