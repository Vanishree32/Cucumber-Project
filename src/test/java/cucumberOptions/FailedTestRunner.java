package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.core.cli.Main;

@CucumberOptions(features = "@target/filed_Scenarios.txt", glue = "Stepdefinition_Files", monochrome = true, 
plugin= {"html:target/cucumber.html","json:target/cucumber1.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		})
public class FailedTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
		
	}
	
	
	
	
}
