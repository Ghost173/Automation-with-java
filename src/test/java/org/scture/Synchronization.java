package org.scture;

import org.pom.base.BaseTest;
import org.pom.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Synchronization extends BaseTest {
    @Test
    public void guestCheckoutusingDirectBanktranfer() throws InterruptedException{
        HomePage homePage = new HomePage(driver).load();
        StorePage storePage = homePage.clickStoreMenuLink();
        storePage.enterTextInSearchFld("blue").clickSearchBtn();
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
        storePage.clickAddToCartBtn();
        CartPage cartPage = storePage.clickViewcartLbl();
        CheckoutPage checkoutPage = cartPage.clickCheckoutBtn();
        checkoutPage.
                enterFristnameInFld("fnamedem").
                enterLastNameininFld("lastnamej").
                enterCompanyNameiNfld("matrix").
                selectCountry("United States (US)").
                enterBllingaddLineone("1/1 lane23 moor rd").
                enterTownInfld("space town").
                seletState("California").
                enterPosteCodeinFld("00600").
                enterPhoneInFld("1234598765").
                enterEmailInfld("ghost173@mail.com").
                slectdirectbanktrfr();

        OrderConfirmPage orderConfrimPage = checkoutPage.ClickprocesstoCheckoutBtn();
        Assert.assertEquals(orderConfrimPage.getOrderConfirmSuccessMgs(), "Thank you. Your order has been received.");
    }

    @Test
    public void loginCheckoutUsingDirectBankTranfer() throws InterruptedException{
        HomePage homePage = new HomePage(driver).load();
        StorePage storePage = homePage.clickStoreMenuLink();
        storePage.enterTextInSearchFld("blue").clickSearchBtn();
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
        storePage.clickAddToCartBtn();
        CartPage cartPage = storePage.clickViewcartLbl();
        CheckoutPage checkoutPage = cartPage.clickCheckoutBtn();
        checkoutPage.clickhereTologinBtn();
        checkoutPage.enterUsername("ghost173@mail.com").enterPassword("ghost173@mail.com").clickLoginBtn();
        checkoutPage.
                enterFristnameInFld("fnamedem").
                enterLastNameininFld("lastnamej").
                enterCompanyNameiNfld("matrix").
                selectCountry("United States (US)").
                enterBllingaddLineone("1/1 lane23 moor rd").
                enterTownInfld("space town").
                seletState("California").
                enterPosteCodeinFld("00600").
                enterPhoneInFld("1234598765").
                enterEmailInfld("ghost173@mail.com");
        OrderConfirmPage orderConfrimPage = checkoutPage.ClickprocesstoCheckoutBtn();
        Assert.assertEquals(orderConfrimPage.getOrderConfirmSuccessMgs(), "Thank you. Your order has been received.");
    }

}
