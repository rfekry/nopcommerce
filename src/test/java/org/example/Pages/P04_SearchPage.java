package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_SearchPage {
    WebDriver chDriver;
    public P04_SearchPage(WebDriver chDriver)
    {
        this.chDriver = Hooks.chDriver;
    }

    public WebElement SearchBox()
    {
        return Hooks.chDriver.findElement(By.id("small-searchterms"));
    }

    public WebElement SearchBtn()
    {
        return Hooks.chDriver.findElement(By.className("button-1"));
    }


    public List<WebElement> SearchResults()
    {
        return Hooks.chDriver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }

    public WebElement SearchResult()
    {
        return Hooks.chDriver.findElement(By.className("product-item"));
    }

    public WebElement Sku()
    {
        return Hooks.chDriver.findElement(By.className("sku"));
    }
}
