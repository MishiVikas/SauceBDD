package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"src/test/resources/featureFiles"},
		glue = {"stepsClass", "appHooks"},
		monochrome = true,
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"				
		},
		tags = "@Smoke or  @Regression",
		dryRun = false
		
		)



  public class loginRunner
     {
	 
	
     }
