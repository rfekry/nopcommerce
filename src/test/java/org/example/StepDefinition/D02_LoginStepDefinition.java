package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_LoginPage;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDefinition {
    P02_LoginPage login= new P02_LoginPage(Hooks.chDriver);
    SoftAssert soft = new SoftAssert();
    @Given("user navigates to login page")
    public void NavigatesToLogin()
    {
        login.LoginPOM().click();
    }

    @When("user enter valid email and password")
    public void ValidData()
    {
        login.EmailPOM().sendKeys("randa31@hotmail.com");
        login.PasswordPOM().sendKeys("Hello123");
    }

    @And("user clicks on login button")
    public void ClickLogin () throws InterruptedException {
        login.LoginBtnPOM().click();
        Thread.sleep(2000);
    }

    @Then("user could login successfully")
    public void LoginSuccessfully()
    {
        soft.assertEquals(Hooks.chDriver.getCurrentUrl(), "https://demo.nopcommerce.com/", "URL is different");
        soft.assertTrue(login.MyAccount().isDisplayed(), "My Account Tab is not displayed");
        soft.assertAll();


    }



    @Then("user could not login successfully")
    public void userCouldNotLoginSuccessfully() {
        String actualMsg = login.MsgError().getText();
        String expectedMsg = "Login was unsuccessful. Please correct the errors and try again.";
        soft.assertTrue(actualMsg.contains(expectedMsg),"Login Failure");

        soft.assertAll();
    }

    @When("user enter invalid email and password")
    public void userEnterInvalidEmailAndPassword() {
        login.EmailPOM().sendKeys("randa31@hotmail.com");
        login.PasswordPOM().sendKeys("Hello1");
    }
}
