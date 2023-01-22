package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_ResetPasswordPage {
    WebDriver chDriver;
    public P03_ResetPasswordPage(WebDriver chDriver)
    {
        this.chDriver = Hooks.chDriver;
    }

    //navigate to login page
    //    chDriver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    public WebElement ForgotPass(){
        return Hooks.chDriver.findElement(By.linkText("Forgot password?"));
    }
     public WebElement EmailAddress()
     {
         return Hooks.chDriver.findElement(By.id("Email"));
     }
     public WebElement RecoverBtn()
     {
         return Hooks.chDriver.findElement(By.name("send-email"));
     }
        public WebElement BarNotification()
        {
            return Hooks.chDriver.findElement(By.className("bar-notification"));
        }

    // System.out.println(emailSentMsg);

    // "Email with instructions has been sent to you."

}
