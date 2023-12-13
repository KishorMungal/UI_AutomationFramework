package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

	@FindBy(css = pageConstant.Automobiles)
	public WebElement AutomobileLink;
	
	@FindBy(css=pageConstant.Motorcycle)
	public WebElement MotorcycleLink;
	
	@FindBy(xpath=pageConstant.truck)
	public WebElement TruckLink;
	
	@FindBy(xpath=pageConstant.camper)
	public WebElement camperLink;
	
}
