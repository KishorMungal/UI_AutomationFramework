package com.pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testBase.TestBase;
import com.utilities.CommonFunctions;
import com.utilities.ObjectUtilities;

public class HomePage extends ObjectUtilities {
	public CommonFunctions cm;

	@FindBy(css = pageConstant.Automobiles)
	public WebElement AutomobileLink;

	@FindBy(css = pageConstant.Motorcycle)
	public WebElement MotorcycleLink;

	@FindBy(xpath = pageConstant.truck)
	public WebElement TruckLink;

	@FindBy(xpath = pageConstant.camper)
	public WebElement camperLink;

	@FindBy(xpath = pageConstant.homepageHeading)
	public WebElement Homepage_Heading;

	@FindBy(xpath = pageConstant.productListOnHomepage)
	List<WebElement> productList;

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		cm = new CommonFunctions();
	}

	public void VerifyHomepageHeader() {
		//cm.waitforElementToBeDisplayed(Homepage_Heading);
		cm.ThreadSleepTime(3000);
		System.out.println(Homepage_Heading.getText());
		Assert.assertTrue(cm.isElementDisplay(Homepage_Heading), "homepage heading is not displayed");
	}

	public String CheckHomepageproducts() {
		String products_Name = cm.ListOFAvailableElement(productList);
		//System.out.println(products_Name);
		return products_Name;
	}

}
