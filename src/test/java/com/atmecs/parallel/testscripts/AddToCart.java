package com.atmecs.parallel.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.parallel.pages.AddToCartPage;
import com.atmecs.parallel.setup.SetUp;

	public class AddToCart extends SetUp {
		@Test(priority = 4)
		public void addtoCart() throws Exception {
			AddToCartPage adding = new AddToCartPage();
			adding.addToCart();

		}
}
