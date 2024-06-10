package Stepdefinition_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(
				
		System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String QAurl = prop.getProperty("url");

		if (driver == null) {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

				//System.setProperty("webdriver.chrome.driver", "");
				driver = new ChromeDriver();

				driver.get("QAurl");

			}

		}
		
		 else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		

	}
		return driver;

}
}
