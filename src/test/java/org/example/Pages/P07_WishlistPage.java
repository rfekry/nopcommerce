package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_WishlistPage {

    WebDriver chDriver;
    public P07_WishlistPage(WebDriver chDriver)
    {
        this.chDriver = Hooks.chDriver;
    }

    public WebElement HTCOne()
    {
       return Hooks.chDriver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));

    }

    public WebElement AddToWishListBtn()
    {
        return Hooks.chDriver.findElement(By.id("add-to-wishlist-button-18"));

    }

    public WebElement NotificationBar()
    {
        return Hooks.chDriver.findElement(By.className("bar-notification"));
    }

    public By NotificationBarBy()
    {
        return By.className("bar-notification");
    }
    public WebElement WishList()
    {
        return Hooks.chDriver.findElement(By.className("wishlist-label"));
    }

    public WebElement Quantity()
    {
        return Hooks.chDriver.findElement(By.className("qty-input"));
    }

}
