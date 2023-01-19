package org.example.StepDefinition;

import org.example.Pages.P01_RegisterationPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class D01_RegisterationStepDefinition {
   // WebDriver chDriver = null;
    P01_RegisterationPage register= new P01_RegisterationPage(Hooks.chDriver);

    @Given("user navigates to register page")
    public void navigateToRegister() throws InterruptedException {
        register.RegisterLinkPOM().click();
    }
    @When("user enter Fisrtname, lastname, email and password")
    public void EnterLoginFields() throws InterruptedException {

        register.FemalePOM().click();
       /* register.DOB_DayPOM().click();
        register.DOB_MonthPOM().click();
        register.DOB_YearPOM().click();  */
        register.FirstNamePOM().clear();
        register.FirstNamePOM().sendKeys("Randa");
        register.LastNamePOM().clear();
        register.LastNamePOM().sendKeys("Fekry");
        //Add DOB: Dropdown selection
        register.EmailPOM().sendKeys("randa3111@hotmail.com");
        Thread.sleep(2000);
        register.PasswordPOM().sendKeys("Hello123");
        register.ConfirmPasswordPOM().sendKeys("Hello123");
        Thread.sleep(2000);
        // chDriver.findElement(By.id("ConfirmPassword")).sendKeys(Keys.ENTER);
    }

    @And("user clicks on register button")
    public void ClickRegister() throws InterruptedException
    {
        register = new P01_RegisterationPage(Hooks.chDriver);
        register.RegisterPOM().click();

        Thread.sleep(2000);
    }

    @Then("user could register successfully")
    public void RegisterSuccessfully()
    {
        String expectedResult = "Your registration completed";

        String actualResult = register.registerResultPOM().getText();
        System.out.println(actualResult);
        //using Junit
        Assert.assertTrue(actualResult.contains(expectedResult));
       // Assert.assertEquals(actualResult.contains(expectedResult), true);

    }
    @And("go to registeration result page")
    public void GoRegResultPage() throws InterruptedException
    {
        register.ContinuePOM().click();
        Thread.sleep(2000);
        Assert.assertEquals("https://demo.nopcommerce.com/",Hooks.chDriver.getCurrentUrl());
    }
}
