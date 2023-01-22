package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_ResetPasswordPage;
import org.testng.Assert;

public class D03_ResetPasswordStepDef {
    P03_ResetPasswordPage reset = new P03_ResetPasswordPage(Hooks.chDriver);
    @When("user clicks on Forgot password?")
    public void clickForgotPassword()
    {
        reset.ForgotPass().click();
    }

    @And("enter his email address")
    public void EnterEMail() throws InterruptedException {
        reset.EmailAddress().sendKeys("randa3@hotmail.com");
        Thread.sleep(2000);
        reset.RecoverBtn().click();
    }

    @Then("user should be able to recieve a success message")
    public void userShouldBeAbleToRecieveASuccessMessage() throws InterruptedException {
        Thread.sleep(2000);
        String actualMsg = reset.BarNotification().getText();
        System.out.println(actualMsg);
        Assert.assertTrue(actualMsg.contains("Email with instructions has been sent to you."));
    }
}
