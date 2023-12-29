package com.pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utilities.ObjectUtilities;

public class EnterProductDataPage extends ObjectUtilities {
	@FindBy(xpath = pageConstant.StartDate)
	WebElement StartDate_Calender;
	
	@FindBy(css = pageConstant.Insurancesumdropdown)
	WebElement InsuranceSumDropdown;
	
	@FindBy(css = pageConstant.MeritRatingdropdown)
	WebElement MeritratingDropdown;
	
	@FindBy(css = pageConstant.DamageInsurancedropdown)
	WebElement DamageInsuranceDropdown;
	
	@FindBy(xpath = pageConstant.OptionalProductlabel)
	WebElement OptionalProductLabel;
	
	@FindBy(css = pageConstant.OptionalCheckbox)
	 List<WebElement> optionalCheckbox;
	
	@FindBy(xpath = pageConstant.CourtesyCardropdown)
	WebElement CourtesycarDropdown;
	
	@FindBy(xpath = pageConstant.NextButtonProductpage)
	WebElement NextButtonOnProductPage;
	
	@FindBy(xpath = pageConstant.PrevButtonProductpage)
	WebElement PreviousButtonOnProductPage;
	
	public EnterProductDataPage(){
		PageFactory.initElements(driver,this);
	}
	
	public void EnterStartDate(String date) {
		 try {
		 cm.waitforElementToBeDisplayed(StartDate_Calender);
		 cm.EnterSendKeys(StartDate_Calender,date ); //"10/10/2000"
		 }catch(Exception e) {
			 e.printStackTrace();
			 Assert.fail("Must be more than one month in the future");
		 }
	 }
	
	public void SelectInsuranceSum(String Insurance_Amount) {  // 5.000.000,00
		 cm.waitforElementToBeDisplayed(InsuranceSumDropdown);
		 cm.selectDropDown(Insurance_Amount, InsuranceSumDropdown); 
	 }
	
	public void SelectMeritRating(String MeritRating) {   //Bonus 3
		 cm.waitforElementToBeDisplayed(MeritratingDropdown);
		 cm.selectDropDown(MeritRating, MeritratingDropdown); 
	 }
	
	public void SelectdamageInsurance(String DamageInsurance) {   //Full Coverage
		 cm.waitforElementToBeDisplayed(DamageInsuranceDropdown);
		 cm.selectDropDown(DamageInsurance, DamageInsuranceDropdown); 
	 }
	
	public void SelectOptionalProducts(String productOptions){
		 cm.waitforElementToBeDisplayed(OptionalProductLabel);
		 cm.SelectCheckBoxes(optionalCheckbox,productOptions );  //Euro Protection //Legal Defense Insurance
	 }
	
	
	public void SelectCourtesyCar(String option) {   // Yes
		 cm.waitforElementToBeDisplayed(CourtesycarDropdown);
		 cm.selectDropDown(option, CourtesycarDropdown); 
	 }
	
	public void clickOnProductPageNextButton() {
		 cm.waitforElementToBeDisplayed(NextButtonOnProductPage);
		 cm.ClickOnElement(NextButtonOnProductPage);
		 cm.ThreadSleepTime(2000);
	 }
	

}
