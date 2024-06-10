package Stepdefinition_Files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import TestUtils.TestVariables;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	TestVariables var;

	public Hooks(TestVariables var) {
		this.var = var;
	}

	@After
	public void AfterScenario() {
		var.driver.quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			// File Source=( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
			// byte[] fileContent=FileUtils.readFileToByteArray(Source);
			// scenario.attach(fileContent, "image/png", "image");

			File Source = ((TakesScreenshot) var.driver).getScreenshotAs(OutputType.FILE);

			byte[] fileContent = FileUtils.readFileToByteArray(Source);
			scenario.attach(fileContent, "image/png", "image");

		}
	}

}
