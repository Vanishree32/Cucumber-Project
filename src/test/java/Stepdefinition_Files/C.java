package Stepdefinition_Files;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import PageObjects.Homepage;
import PageObjects.SearchResult;
import TestUtils.TestVariables;
import io.cucumber.java.en.*;

public class C {

	public TestVariables var;

	public C(TestVariables var) {
		this.var = var;
	}

	@When("searching the product {string}")
	public void searching_the_product(String name) {

		Homepage hp = new Homepage(var.driver);
		hp.serachProduct(name);
		hp.ClickIcon();
	}

	@When("user selects particulartly {string}")
	public void user_selects_particulartly(String shoename) throws InterruptedException {
		SearchResult sr = new SearchResult(var.driver);
		// Thread.sleep(3000);
		// sr.selectShoe(shoename);
//		String parentWindow  = var.driver.getWindowHandle();
//		System.out.println("How many windows are there :"+var.driver.getWindowHandles().size());
//		Set<String> list = var.driver.getWindowHandles();
		// String childWindow=var.driver.getWindowHandles();
//		for(int i=0; i<list.size();i++) {
//			if(!parentWindow.equals(list)) {
//				var.driver.switchTo().window(parentWindow);
//			}
//		}
//		
		// var.driver.switchTo().newWindow(WindowType.WINDOW); // selenium 4 version
		// code for changing window

		WebElement le = var.driver
				.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[9]"));
		((JavascriptExecutor) var.driver).executeScript("arguments[0].scrollIntoView(true);", le);
		Thread.sleep(3000);
		sr.selectShoe(shoename);
		// var.driver.switchTo().newWindow(WindowType.TAB); // selenium 4 version code
		// for changing TAB
		Set<String> handles = var.driver.getWindowHandles();
		String currentHandle = var.driver.getWindowHandle();
		for (String handle : handles) {

			if (!handle.equals(currentHandle)) {
				var.driver.switchTo().window(handle);
			}
		}
	}

	@Then("user is clicking on proceed to buy button")
	public void user_is_clicking_on_proceed_to_buy_button() throws InterruptedException {
		SearchResult sr = new SearchResult(var.driver);
		sr.addingToCart();

	}

}
