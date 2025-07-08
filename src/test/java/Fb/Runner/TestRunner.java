package Fb.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources",
                   glue={"Fb.stepdefinition","Fb.Hooks"},
                   monochrome = true,
                   dryRun = false,
                   plugin = {"html:target/report.html","json:target/report.json"},
                   tags=("@FacebookList"))

public class TestRunner {
	
	

}
