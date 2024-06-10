package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult {
	WebDriver driver;

	By resultText = By.xpath("//a[@data-elementid='sbx-headline']");
	By shoesList = By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']");
	By AddToCartBtn = By.xpath("//input[@id='add-to-cart-button']");
	By ProccedToBuyBtn = By.xpath("//span[@id='sc-buy-box-ptc-button']");

	public SearchResult(WebDriver driver) {
		this.driver = driver;
	}

	public String gettingText() {
		return driver.findElement(resultText).getText();

	}

	public void selectShoe(String Shoename) {
		List<WebElement> list = driver.findElements(shoesList);

		driver.findElement(By.xpath("//span[text()='Mens Sx0678g Sneaker']")).click();

		// driver.findElement(By.xpath("(//div[@class='a-section aok-relative
		// s-image-tall-aspect'])[9]")).click();

	}

	public void addingToCart() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@id='sc-buy-box-ptc-button']")).click();
	}

}
