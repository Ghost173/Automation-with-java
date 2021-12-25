package org.refactor;

import org.pom.base.BaseTest;
import org.pom.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class SearchTest extends BaseTest {

    @Test
    public void searchProductInstorepage() {
        StorePage storePage = new StorePage(driver).load();
        storePage.enterTextInSearchFld("blue").clickSearchBtn();
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
    }
}
