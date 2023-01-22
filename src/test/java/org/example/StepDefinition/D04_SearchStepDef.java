package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_SearchPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_SearchStepDef {
    P04_SearchPage search = new P04_SearchPage(Hooks.chDriver);
    SoftAssert soft = new SoftAssert();
    @When("user clicks on search field")
    public void clickSearch()
    {
        search.SearchBox().click();
    }

    @And("user search with {string}")
    public void userSearchWith(String arg0) {
        System.out.println(arg0);
        search.SearchBox().sendKeys(arg0);
        search.SearchBtn().click();
    }

    @Then("user can find {string} relative results")
    public void userCanFindRelativeResults(String arg0) {
        String actualResult = Hooks.chDriver.getCurrentUrl();
        soft.assertTrue(actualResult.contains("https://demo.nopcommerce.com/search?q="));
        for (int x = 0; x < search.SearchResults().size(); x++) {
            String value = search.SearchResults().get(x).getText();
            System.out.println("Value is:"+value);
            soft.assertTrue(value.toLowerCase().contains(arg0), "Product is not found by name");
            soft.assertAll();
    }

}

    @Then("user find {string} inside product detail page")
    public void userFindInsideProductDetailPage(String arg0) {
        search.SearchResult().click();
        Assert.assertTrue(search.Sku().getText().contains(arg0), "Product is not found by sku");
        }
    }
