package com.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;
import com.utilities.ObjectUtilities;

public class HomepageValidations extends ObjectUtilities {



	@Test
	public void ValidateInsurenceProductAvailableOnHomepage() {
		homepage.VerifyHomepageHeader();
		String InsurenceProductList = homepage.CheckHomepageproducts();
		String List = InsurenceProductList;
		System.out.println(List);
		Assert.assertTrue(CommonFunctions.isElementEnabled(homepage.AutomobileLink));

	}

	//@Test
	public void test() {
		System.out.println("hellow world");
	}

}
