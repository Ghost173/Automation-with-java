package org.scture;

import org.pom.base.BaseTest;
import org.pom.objects.BillingAddress;
import org.pom.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FPObjectTest extends BaseTest {

    @Test
    public void guestCheckoutusingDirectBanktranfer() throws InterruptedException{
        BillingAddress billingAddress = new BillingAddress()
        .setFirstName("meepo")
        .setLastName("troll").setCompanytName("blooooui")
        .setAddressLineone("1/1 lane23 moor rd")
        .setTown("space town")
        .setPostCode("00600")
        .setPhone("3214569870")
        .setEmail("ghost173@mail.com");
        HomePage homePage = new HomePage(driver).load();
        StorePage storePage = homePage.clickStoreMenuLink();
        Thread.sleep(5000);
        storePage.enterTextInSearchFld("blue").clickSearchBtn();
        Thread.sleep(5000);
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
        Thread.sleep(5000);
        storePage.clickAddToCartBtn();
        Thread.sleep(5000);
        CartPage cartPage = storePage.clickViewcartLbl();
        Thread.sleep(5000);
        CheckoutPage checkoutPage = cartPage.clickCheckoutBtn();
        Thread.sleep(5000);

        checkoutPage.setBillingAddress(billingAddress);

        OrderConfirmPage orderConfrimPage = checkoutPage.ClickprocesstoCheckoutBtn();
        Thread.sleep(3000);
        Assert.assertEquals(orderConfrimPage.getOrderConfirmSuccessMgs(), "Thank you. Your order has been received.");

    }

    @Test
    public void loginCheckoutUsingDirectBankTranfer() throws InterruptedException{
        HomePage homePage = new HomePage(driver).load();
        StorePage storePage = homePage.clickStoreMenuLink();
        Thread.sleep(5000);
        storePage.enterTextInSearchFld("blue").clickSearchBtn();
        Thread.sleep(5000);
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
        Thread.sleep(5000);
        storePage.clickAddToCartBtn();
        Thread.sleep(5000);
        CartPage cartPage = storePage.clickViewcartLbl();
        Thread.sleep(5000);
        CheckoutPage checkoutPage = cartPage.clickCheckoutBtn();
        Thread.sleep(5000);
        checkoutPage.clickhereTologinBtn();
        Thread.sleep(5000);
        checkoutPage.enterUsername("ghost173@mail.com").enterPassword("ghost173@mail.com").clickLoginBtn();
        Thread.sleep(5000);
        checkoutPage.
                enterFristnameInFld("fnamedem").
                enterLastNameininFld("lastnamej").
                enterCompanyNameiNfld("matrix").
                enterBllingaddLineone("1/1 lane23 moor rd").
                enterTownInfld("space town").
                enterPosteCodeinFld("00600").
                enterPhoneInFld("1234598765").
                enterEmailInfld("ghost173@mail.com");
        OrderConfirmPage orderConfrimPage = checkoutPage.ClickprocesstoCheckoutBtn();
        Thread.sleep(3000);
        Assert.assertEquals(orderConfrimPage.getOrderConfirmSuccessMgs(), "Thank you. Your order has been received.");
    }

}
