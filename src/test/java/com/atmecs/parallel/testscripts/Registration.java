package com.atmecs.parallel.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.parallel.pages.RegistrationPage;
import com.atmecs.parallel.setup.SetUp;

	public class Registration extends SetUp {
		@Test(priority = 1)
		public void register() {
			RegistrationPage register = new RegistrationPage();
			register.doRegister();
			
		}
}
