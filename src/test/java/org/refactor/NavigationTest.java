package org.refactor;

import org.pom.base.BaseTest;
import org.pom.pages.HomePage;
import org.pom.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void navigateFromHomeToStoreUsingMainMenu(){
        HomePage homePage = new HomePage(driver).load();
        StorePage storePage = homePage.clickStoreMenuLink();
        Assert.assertEquals(storePage.storePagetitle(), "Store");
    }
}
