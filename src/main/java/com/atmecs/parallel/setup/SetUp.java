package com.atmecs.parallel.setup;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.atmecs.parallel.constant.constant;
import com.atmecs.parallel.reader.PropertyReader;

	public class SetUp {
		public static Properties properties;
		public static WebDriver driver;
		String weburl;
		String browser;
		
		
		@BeforeMethod
	//	@Parameters("browser")
		public void lunchBrowser() {
			properties = PropertyReader.readProperties(constant.testdata_file);
			weburl = properties.getProperty("Url");
			//browser = properties.getProperty("Browser");
			
		//	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", constant.chrome_path);
		driver = new ChromeDriver();
			//	}
	
	//	    else { System.setProperty("webdriver.gecko.driver", constant.firefox_path);
	//	    driver = new FirefoxDriver(); }
		
		
			driver.get("https://demoblaze.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}
}
