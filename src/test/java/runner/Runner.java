package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {
        "html:target/cucumber/cucumber-html-report.html",
        "json:target/cucumber/cucumber.json"
    }
    ,features= {"src/test/resources/features"}
    ,glue = {"com.lexisnexis.stepdefinition"}
    ,monochrome = true

)
public class Runner {

}