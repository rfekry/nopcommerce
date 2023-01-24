package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P08_WishlistPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class D08_WishlistStepDef {
    P08_WishlistPage wishList = new P08_WishlistPage(Hooks.chDriver);
    SoftAssert soft = new SoftAssert();
    int quantityNum=0;
    @When("user clicks on Add to Whishlist button")
    public void clickWishListBtn()
    {
        wishList.HTCOne().click();
        wishList.AddToWishListBtn().click();

    }


    @Then("success message is displayed to screen")
    public void successMessageIsDisplayedToScreen() {
       String actualResult = wishList.NotificationBar().getText();
       System.out.println(actualResult);
       soft.assertTrue(actualResult.contains("The product has been added to your "),  "Error in Success Message");
       String bgColor = wishList.NotificationBar().getCssValue("background-color");
       System.out.println(bgColor);
       soft.assertEquals(bgColor,"rgba(75, 176, 122, 1)");
       soft.assertAll();


    }

    @Then("Whishlist quantity is increased")
    public void whishlistQuantityIsIncreased() {
        Duration duration = Duration.ofSeconds(2000);
        WebDriverWait wait = new WebDriverWait(Hooks.chDriver,duration);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(wishList.NotificationBarBy()));
        wishList.WishList().click();
        String quantity = wishList.Quantity().getAttribute("value");
        System.out.println(quantity);
        quantityNum = Integer.parseInt(quantity);
        Assert.assertTrue(quantityNum>0, "Quantity in wishlist in zero");

    }

}
