package org.refactor;

import org.pom.base.BaseTest;
import org.pom.pages.CartPage;
import org.pom.pages.CheckoutPage;
import org.pom.pages.StorePage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartProduct() {
        StorePage storePage = new StorePage(driver).load();
        storePage.clickAddToCartBtn();
        CartPage cartPage = storePage.clickViewcartLbl();
        CheckoutPage checkoutPage = cartPage.clickCheckoutBtn();
    }
}
