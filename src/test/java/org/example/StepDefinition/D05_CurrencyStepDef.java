package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P05_CurrenyPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D05_CurrencyStepDef {
  P05_CurrenyPage currency = new P05_CurrenyPage(Hooks.chDriver);

  @When("user selects Euro option")
  public void selectEuro() {
    Select select = new Select(currency.CurrenyList());
    select.selectByVisibleText("Euro");
  }

  @Then("Euro symbol is displayed on all products")
  public void euroSymbolIsDisplayedOnAllProducts() {
    for (int x = 0; x < currency.prices().size(); x++) {
      String value = currency.prices().get(x).getText();
      Assert.assertTrue(value.contains("€"), "Currency is not euro");
    }
  }
}