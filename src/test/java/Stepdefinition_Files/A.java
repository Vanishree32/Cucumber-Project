package Stepdefinition_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.Homepage;
import TestUtils.TestVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A {

	public TestVariables var;
	 public A(TestVariables var) {
		this.var=var; 
	 }

	@Given("^User is at Home page of amazon$")
	public void user_is_at_home_page_of_amazon() {

		var.driver = new ChromeDriver();
		var.driver.get("https://www.amazon.in/");
		var.driver.manage().window().maximize();
	}

	@When("^user is searching (.+)$")
	public void user_is_searching(String product) {
		//var.driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys(product);
		//var.driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
		Homepage hp= new Homepage(var.driver);
		hp.serachProduct(product);
		hp.ClickIcon();
		
		
	}

	

}
