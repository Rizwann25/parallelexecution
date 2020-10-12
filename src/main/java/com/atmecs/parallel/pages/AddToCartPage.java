package com.atmecs.parallel.pages;

	import java.util.Properties;

	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.parallel.constant.constant;
import com.atmecs.parallel.helper.HelperClass;
import com.atmecs.parallel.reader.PropertyReader;
import com.atmecs.parallel.setup.SetUp;

	public class AddToCartPage extends SetUp{
		
			Properties loc_path;
			Properties data_path;

			public void addToCart() throws Exception {
				loc_path = PropertyReader.readProperties(constant.locators_file);
				data_path = PropertyReader.readProperties(constant.testdata_file);

				HelperClass.clickElement(driver, loc_path.getProperty("Home"));
				HelperClass.clickElement(driver, loc_path.getProperty("MobileLink"));
				HelperClass.clickElement(driver, loc_path.getProperty("Addtocart"));

				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
				HelperClass.clickElement(driver, loc_path.getProperty("CartLink"));

				Thread.sleep(5000);
				HelperClass.clickElement(driver, loc_path.getProperty("Placeorder"));
				HelperClass.sendKeys(driver, loc_path.getProperty("Name"), data_path.getProperty("Name"));
				HelperClass.sendKeys(driver, loc_path.getProperty("Country"), data_path.getProperty("Country"));
				HelperClass.sendKeys(driver, loc_path.getProperty("City"), data_path.getProperty("City"));
				HelperClass.sendKeys(driver, loc_path.getProperty("Creditcard"), data_path.getProperty("Creditcard"));
				HelperClass.sendKeys(driver, loc_path.getProperty("Month"), data_path.getProperty("Month"));
				HelperClass.sendKeys(driver, loc_path.getProperty("Year"), data_path.getProperty("Year"));

				HelperClass.clickElement(driver, loc_path.getProperty("PurchaseButton"));
				HelperClass.clickElement(driver, loc_path.getProperty("OkButton"));
			
		}
}
