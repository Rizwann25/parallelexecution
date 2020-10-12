package com.atmecs.parallel.pages;

	import java.util.Properties;

import com.atmecs.parallel.constant.constant;
import com.atmecs.parallel.helper.HelperClass;
import com.atmecs.parallel.reader.PropertyReader;
import com.atmecs.parallel.setup.SetUp;

	public class LoginPage extends SetUp {
		Properties loc_path;
		Properties data_path;

		public void doLogin() {
			loc_path = PropertyReader.readProperties(constant.locators_file);
			data_path = PropertyReader.readProperties(constant.testdata_file);

			HelperClass.clickElement(driver, loc_path.getProperty("Login"));

			HelperClass.sendKeys(driver, loc_path.getProperty("LoginUsername"), data_path.getProperty("LoginUsername"));
			HelperClass.sendKeys(driver, loc_path.getProperty("LoginPassword"), data_path.getProperty("LoginPassword"));

			HelperClass.clickElement(driver, loc_path.getProperty("LoginButton"));

		}
}
