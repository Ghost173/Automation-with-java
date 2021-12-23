package org.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myfirstTastCase extends BaseTest {


    @Test
    public void guestCheckoutusingDirectBanktranfer() throws InterruptedException{
        driver.get("https://askomdch.com");
        driver.findElement(By.xpath("//li[@id='menu-item-1227']//a[@class='menu-link'][normalize-space()='Store']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']")).sendKeys("blue");
        driver.findElement(By.cssSelector("button[value='Search']")).click();
        Thread.sleep(5000);
        Assert.assertEquals(
                driver.findElement(By.xpath("//h1[contains(text(),'Search results: “blue”')]")).getText(),
                "Search results: “blue”"
        );
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='Proceed to checkout']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("billing_first_name")).sendKeys("ghostdemo");
        driver.findElement(By.id("billing_last_name")).sendKeys("rider");
        driver.findElement(By.id("billing_company")).sendKeys("cmpy dev");
        driver.findElement(By.id("billing_address_1")).sendKeys("14/1 2A cross street");
        driver.findElement(By.id("billing_city")).sendKeys("home town city");
        driver.findElement(By.id("billing_postcode")).sendKeys("00600");
        driver.findElement(By.id("billing_phone")).sendKeys("321456987");
        driver.findElement(By.id("billing_email")).sendKeys("ghost173@mail.com");
        driver.findElement(By.id("place_order")).click();
        Thread.sleep(3000);
        Assert.assertEquals(
                driver.findElement(By.cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received")).getText(),
                "Thank you. Your order has been received."
        );
    }



    @Test
    public void loginCheckoutUsingDirectBankTranfer() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/home/prakash/IdeaProjects/Automation_sample/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com");
        driver.findElement(By.xpath("//li[@id='menu-item-1227']//a[@class='menu-link'][normalize-space()='Store']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']")).sendKeys("blue");
        driver.findElement(By.cssSelector("button[value='Search']")).click();
        Thread.sleep(5000);
        Assert.assertEquals(
                driver.findElement(By.xpath("//h1[contains(text(),'Search results: “blue”')]")).getText(),
                "Search results: “blue”"
        );
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='Proceed to checkout']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Click here to login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("ghost173@mail.com");
        driver.findElement(By.id("password")).sendKeys("ghost173@mail.com");

        driver.findElement(By.cssSelector("button[value='Login']")).click();
        Thread.sleep(3000);
//        driver.findElement(By.id("billing_first_name")).sendKeys("ghostdemo");
//        driver.findElement(By.id("billing_last_name")).sendKeys("rider");
//        driver.findElement(By.id("billing_company")).sendKeys("cmpy dev");
//        driver.findElement(By.id("billing_address_1")).sendKeys("14/1 2A cross street");
//        driver.findElement(By.id("billing_city")).sendKeys("home town city");
//        driver.findElement(By.id("billing_postcode")).sendKeys("00600");
//        driver.findElement(By.id("billing_phone")).sendKeys("321456987");
//        driver.findElement(By.id("billing_email")).sendKeys("ghost173@mail.com");
        driver.findElement(By.id("place_order")).click();
        Thread.sleep(3000);
        Assert.assertEquals(
                driver.findElement(By.cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received")).getText(),
                "Thank you. Your order has been received."
        );
    }

}

