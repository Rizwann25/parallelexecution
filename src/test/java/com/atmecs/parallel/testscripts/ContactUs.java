package com.atmecs.parallel.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.parallel.pages.ContactUsPage;
import com.atmecs.parallel.setup.SetUp;

	public class ContactUs extends SetUp {
		@Test(priority = 3)
		public void contactus() {
			ContactUsPage contact = new ContactUsPage();
			contact.contactUs();
		}
}
