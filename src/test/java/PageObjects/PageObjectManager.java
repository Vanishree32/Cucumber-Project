package PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
@Ignore
public class PageObjectManager {

	public Homepage hm;
	public SearchResult sr;
	//public PageObjectManager pom;
	public WebDriver driver;

	public  PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public Homepage getHomepage() {
		hm = new Homepage(driver);
		return hm;
	}

	public SearchResult getSearchResults() {
		sr = new SearchResult(driver);
		return sr;
	}

}
