package com.pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utilities.CommonFunctions;
import com.utilities.ObjectUtilities;

public class EnterInsuranceDatapage extends ObjectUtilities {
  
 public CommonFunctions cm;
 @FindBy(css=pageConstant.firstname)
  WebElement FirstName;
 
 @FindBy(css=pageConstant.lastname)
 WebElement LastName;
 
 @FindBy(xpath=pageConstant.calenderdateonInsurencepage)
 WebElement EnterCalenderdate;
 
 @FindBy(xpath=pageConstant.GenderLabel)
 WebElement genderLabel;
 
 @FindBy(xpath=pageConstant.GenderRadioButtons)
 List<WebElement> Select_Gender;
	
 @FindBy(xpath=pageConstant.CountryDropdown)
 WebElement SelectCountryDropdown;
 
 @FindBy(xpath=pageConstant.ZipCode)
 WebElement EnterZipCode;
 
 @FindBy(xpath=pageConstant.city)
 WebElement Entercity;
 
 @FindBy(xpath=pageConstant.OccupationDropdown)
 WebElement SelectOccupationDropdown;
 
 @FindBy(xpath=pageConstant.HobbiesLabel)
 WebElement hobiesLabel;
 
 @FindBy(xpath=pageConstant.HobbiesCheckboxes)
 List<WebElement> Select_Hobbies;
 
 @FindBy(xpath=pageConstant.NextButtononInsurancepage)
 WebElement ClickonNextButtononInsurancepage;
 
 @FindBy(xpath=pageConstant.CalenderErrorMessage )
 WebElement ErrorMessageOnCalender;
 
 public EnterInsuranceDatapage() {
	 PageFactory.initElements(driver,this);
	 cm = new CommonFunctions();
 }
 
 public void CheckErrorMessageOnCalender(String calenderdate) {
	 cm.waitforElementToBeDisplayed(EnterCalenderdate);
	 cm.EnterSendKeys(EnterCalenderdate,calenderdate ); //"10/10/2010"
	 cm.ThreadSleepTime(2000);
	 Assert.assertEquals(ErrorMessageOnCalender.getText(), "You must be between 18 and 70 years of age");
 }
 
 public void EnterFirstName(String Fn) {
	 cm.waitforElementToBeDisplayed(FirstName);
	 cm.EnterSendKeys(FirstName, Fn); //"Test"
 }
 
 public void EnterLastName(String LN) {
	 cm.waitforElementToBeDisplayed(LastName);
	 cm.EnterSendKeys(LastName,LN ); //"QAAutomation"
 }
 
 public void EnterDateOfBirth(String date) {
	 try {
	 cm.waitforElementToBeDisplayed(EnterCalenderdate);
	 cm.EnterSendKeys(EnterCalenderdate,date ); //"10/10/2000"
	 }catch(Exception e) {
		 e.printStackTrace();
		 Assert.fail("You must be between 18 and 70 years of age");
	 }
 }
 
 public void SelectUserGender(String gender) {
	 cm.waitforElementToBeDisplayed(genderLabel);
	 cm.SelectRadioButton(Select_Gender, gender);//"Male"
 }
 
 public void SelectUserCountry(String country) {
	 cm.waitforElementToBeDisplayed(SelectCountryDropdown);
	 cm.selectDropDown(country, SelectCountryDropdown); //"India"
 }
 
 public void EnterCityName(String city) {
	 cm.waitforElementToBeDisplayed(Entercity);
	 cm.EnterSendKeys(Entercity,city ); //"Mumbai"
 }
 
 public void EnterZipCOde(String zipcode) {
	 cm.waitforElementToBeDisplayed(EnterZipCode);
	 cm.EnterSendKeys(EnterZipCode, zipcode);
 }
 
 public void SelectUserOccupation(String Occupation) {
	 cm.waitforElementToBeDisplayed(SelectOccupationDropdown);
	 cm.selectDropDown(Occupation, SelectOccupationDropdown);   //"Employee"
 }
 
 public void SelectUserHobbies(String str1){
	 cm.waitforElementToBeDisplayed(hobiesLabel);
	 cm.SelectCheckBoxes(Select_Hobbies,str1 );  // Speeding // Skydiving
 }
 
 public void clickOnNextButton() {
	 cm.waitforElementToBeDisplayed(ClickonNextButtononInsurancepage);
	 cm.ClickOnElement(ClickonNextButtononInsurancepage);
	 cm.ThreadSleepTime(2000);
 }
}
