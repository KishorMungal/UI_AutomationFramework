package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.ObjectUtilities;


public class HomePage extends ObjectUtilities{

	@FindBy(css = pageConstant.Automobiles)
	public WebElement AutomobileLink;
	
	@FindBy(css=pageConstant.Motorcycle)
	public WebElement MotorcycleLink;
	
	@FindBy(xpath=pageConstant.truck)
	public WebElement TruckLink;
	
	@FindBy(xpath=pageConstant.camper)
	public WebElement camperLink;
	
	@FindBy(xpath=pageConstant.homepageHeading)
	WebElement Homepage_Heading;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyHomepageHeader() {
		cm.isElementDisplay(Homepage_Heading);
	}
	
	
	
	
	
}
