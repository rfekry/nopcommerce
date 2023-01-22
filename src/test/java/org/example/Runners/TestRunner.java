package org.example.Runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src\\main\\resources\\Features",
        glue = "org.example.StepDefinition",
        tags = "@smoke",
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
