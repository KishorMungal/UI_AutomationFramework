package com.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObject.HomePage;
import com.utilities.ObjectUtilities;

public class HomepageValidations extends ObjectUtilities {
   
	public HomePage homepage;


	public HomepageValidations()  {
		try {
			homepage = new HomePage();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void ValidateInsurenceProductAvailableOnHomepage() {
		homepage.VerifyHomepageHeader();
		homepage.CheckHomepageproducts();
		Assert.assertTrue(isElementEnabled(homepage.AutomobileLink));

	}

	@Test
	public void test() {
		System.out.println("hellow world");
	}

}
