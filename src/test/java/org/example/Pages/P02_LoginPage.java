package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

public class P02_LoginPage {
    WebDriver chDriver;
    public P02_LoginPage(WebDriver chDriver)
    {
        this.chDriver = Hooks.chDriver;
    }
    public WebElement LoginPOM()
    {
        return Hooks.chDriver.findElement(By.className("ico-login"));
    }
    public WebElement EmailPOM()
    {
        return Hooks.chDriver.findElement(By.className("email"));
    }
    public WebElement PasswordPOM()
    {
        return Hooks.chDriver.findElement(By.id("Password"));
    }

    public WebElement LoginBtnPOM() {
        return Hooks.chDriver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement MyAccount()
    {
        return Hooks.chDriver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
    public WebElement MsgError()
    {
        return Hooks.chDriver.findElement(By.className("message-error"));
    }

}
