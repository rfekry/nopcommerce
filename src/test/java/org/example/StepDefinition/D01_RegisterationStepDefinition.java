package org.example.StepDefinition;

import org.example.Pages.P01_RegisterationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D01_RegisterationStepDefinition {

    P01_RegisterationPage register= new P01_RegisterationPage(Hooks.chDriver);
    SoftAssert soft = new SoftAssert();

    @Given("user navigates to register page")
    public void navigateToRegister() throws InterruptedException {
        register.RegisterLinkPOM().click();
    }
    @When("user enter Fisrtname, lastname, email and password")
    public void EnterLoginFields() throws InterruptedException {

        register.FemalePOM().click();
        register.FirstNamePOM().clear();
        register.FirstNamePOM().sendKeys("Randa");
        register.LastNamePOM().clear();
        register.LastNamePOM().sendKeys("Fekry");
        //Select DOB
        Select select = new Select (register.DOB_DayPOM());
        select.selectByIndex(20);
        select = new Select (register.DOB_MonthPOM());
        select.selectByValue("7");
        select = new Select (register.DOB_YearPOM());
        select.selectByVisibleText("1988");

        register.EmailPOM().sendKeys("randa31@hotmail.com");
        Thread.sleep(2000);
        register.PasswordPOM().sendKeys("Hello123");
        register.ConfirmPasswordPOM().sendKeys("Hello123");
        Thread.sleep(2000);

    }

    @And("user clicks on register button")
    public void ClickRegister() throws InterruptedException
    {
        register.RegisterPOM().click();

        Thread.sleep(2000);
    }

    @Then("user could register successfully")
    public void RegisterSuccessfully()
    {
        String expectedResult = "Your registration completed";

        String actualResult = register.registerResultPOM().getText();

        soft.assertTrue(actualResult.contains(expectedResult),"Registeration Failure");

        soft.assertAll();

    }
  /*  @And("go to registeration result page")
    public void GoRegResultPage() throws InterruptedException
    {
        register.ContinuePOM().click();
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.chDriver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }*/
}
