package org.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver chDriver = null;
    @Before
    public static void OpenBrowser()
    {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        chDriver = new ChromeDriver();
        chDriver.manage().window().maximize();
        chDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chDriver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public static void closesBrowser() throws InterruptedException
    {
        Thread.sleep(3000);
        chDriver.quit();

    }


}
