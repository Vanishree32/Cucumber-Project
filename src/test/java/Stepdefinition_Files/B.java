package Stepdefinition_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.SearchResult;
import TestUtils.TestVariables;
import io.cucumber.java.en.Then;

public class B {

	public TestVariables var;

	public B(TestVariables var) {
		this.var = var;
	}

	@Then("^validate the  (.+) in search results$")
	public void validate_the_in_search_results(String product) {

		SearchResult sr = new SearchResult(var.driver);

		String value = sr.gettingText();

		// var.driver.findElement(By.xpath("//a[@data-elementid='sbx-headline']")).getText();
		Assert.assertEquals("iPhone 15 Pro Max. Titanium",value);
		System.out.println("The serach value " + " " + value);

		String str[] = value.split("Titanium");
		System.out.println(str[0]);

		Assert.assertEquals(product, value);

	}

}
