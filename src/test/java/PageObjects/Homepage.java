package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;

	By search = By.xpath("//input[@placeholder='Search Amazon.in']");

	By ClickBtn = By.xpath("//input[@id='nav-search-submit-button']");

	public  Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void serachProduct(String ProdName) {
		driver.findElement(search).sendKeys(ProdName);

	}

	public void ClickIcon() {

		driver.findElement((ClickBtn)).click();

	}

}
