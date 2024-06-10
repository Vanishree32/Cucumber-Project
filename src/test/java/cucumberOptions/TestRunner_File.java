package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.core.cli.Main;

@CucumberOptions(features = "src/test/java/Feature_File", glue = "Stepdefinition_Files", monochrome = true, 
tags="@TCS1 or @TCS2",plugin= {"html:target/cucumber.html","json:target/cucumber1.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/filed_Scenarios.txt"})
public class TestRunner_File extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
		
	}
	
	
	
	
}
