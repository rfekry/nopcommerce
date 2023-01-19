package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_RegisterationPage {
    WebDriver chDriver;
    public P01_RegisterationPage(WebDriver chDriver)
    {
        this.chDriver = Hooks.chDriver;
    }
    public WebElement FemalePOM()
    {
        return Hooks.chDriver.findElement(By.className("female"));
    }


    public WebElement DOB_DayPOM()
    {
        return Hooks.chDriver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement DOB_MonthPOM()
    {
        return Hooks.chDriver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement DOB_YearPOM()
    {
        return Hooks.chDriver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement FirstNamePOM()
    {
        return Hooks.chDriver.findElement(By.id("FirstName"));
    }
    public WebElement LastNamePOM()
    {
        return Hooks.chDriver.findElement(By.id("LastName"));
    }

    public WebElement EmailPOM()
    {
        return Hooks.chDriver.findElement(By.id("Email"));
    }
    public WebElement PasswordPOM()
    {
        return Hooks.chDriver.findElement(By.id("Password"));
    }

    public WebElement ConfirmPasswordPOM()
    {
        return Hooks.chDriver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement RegisterPOM()
    {
        return Hooks.chDriver.findElement(By.id("register-button"));
    }
    public WebElement RegisterLinkPOM()
    {
        return Hooks.chDriver.findElement(By.className("ico-register"));
    }
    public WebElement ContinuePOM()
    {
        return Hooks.chDriver.findElement(By.className("buttons"));
    }
    public WebElement registerResultPOM() {
        return Hooks.chDriver.findElement(By.className("result"));
    }
}
