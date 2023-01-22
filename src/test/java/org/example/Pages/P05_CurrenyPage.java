package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_CurrenyPage {
    WebDriver chDriver;
    public P05_CurrenyPage(WebDriver chDriver)
    {
        this.chDriver = Hooks.chDriver;
    }
    public WebElement CurrenyList()
    {
        return Hooks.chDriver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> prices()
    {
        return Hooks.chDriver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}
