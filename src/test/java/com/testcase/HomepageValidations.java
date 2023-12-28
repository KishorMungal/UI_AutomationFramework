package com.testcase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;
import com.utilities.ObjectUtilities;
//@Listeners(com.utilities.ListenerImplementation.class)
public class HomepageValidations extends ObjectUtilities {



	@Test
	public void ValidateInsurenceProductAvailableOnHomepage() {
		homepage.VerifyHomepageHeader();
		Assert.assertTrue(CommonFunctions.isElementEnabled(homepage.AutomobileLink));
		homepage.EnterIntoAutomobile();
		Vehicledata.ValidateSelectedInsurence();
		

	}

	//@Test
	public void test() {
		System.out.println("hellow world");
	}

}
