package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_HomeHoverPage {

    WebDriver chDriver;
    public P06_HomeHoverPage(WebDriver chDriver)
    {
        this.chDriver = Hooks.chDriver;
    }

    public List<WebElement> Categories()
    {
        return Hooks.chDriver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));

    }

    public List<WebElement> Subcategories(int categoryNum)
    {
        categoryNum+=1;
        return Hooks.chDriver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]  ul"));

    }

    public WebElement pageTitle()
    {
        return Hooks.chDriver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
    }

}
