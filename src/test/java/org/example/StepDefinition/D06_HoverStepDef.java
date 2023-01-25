package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P06_HomeHoverPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

public class D06_HoverStepDef {
    P06_HomeHoverPage home = new P06_HomeHoverPage(Hooks.chDriver);
    String category;

    @When("user hover on Categories and select subcategory")
    public void HoverCategory() throws InterruptedException {

        int categoryCount = home.Categories().size();
        int randomNum = new Random().nextInt(3);
        Actions mouseHover = new Actions(Hooks.chDriver);
        mouseHover.moveToElement(home.Categories().get(randomNum)).perform();
        Thread.sleep(2000);
        if(!home.Subcategories(categoryCount).isEmpty()) {
            this.category = home.Subcategories(categoryCount).get(randomNum).getText().toLowerCase().trim();
            mouseHover.moveToElement(home.Subcategories(categoryCount).get(randomNum)).perform();
            home.Subcategories(categoryCount).get(randomNum).click();

            Thread.sleep(1000);
        }
    }


    @Then("product of the selected subcategory is only shown to homepage")
    public void productOfTheSelectedSubcategoryIsOnlyShownToHomepage() {
        String pTitle = home.pageTitle().getText().toLowerCase().trim();
        Assert.assertTrue(category.contains(pTitle), "Subcategory is not found");

    }
}
