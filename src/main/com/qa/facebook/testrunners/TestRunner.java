package com.qa.facebook.testrunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\NADIYA\\IdeaProjects\\BDDProject\\src\\test\\resources\\Login.feature",
        glue = {"com.qa.facebook.stepdefinitions"},
        tags = "@smoketest or @regression",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","json:target/json-report/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner {
}
