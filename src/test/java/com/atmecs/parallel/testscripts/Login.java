package com.atmecs.parallel.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.parallel.pages.LoginPage;
import com.atmecs.parallel.setup.SetUp;

	public class Login extends SetUp {
		@Test( priority=2)
		public void login() {
			LoginPage log = new LoginPage();
			log.doLogin();
		}
}
