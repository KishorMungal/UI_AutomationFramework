package com.pageObject;

public class pageConstant {

/*
 * HomePage Constant
 */

public static final String productsList ="//ul[@class='menu']//child::li//a";
public static final String Automobiles ="a#nav_automobile";
public static final String truck ="//a[@id='nav_truck']";
public static final String Motorcycle ="a[name='Navigation Motorcycle']";
public static final String camper ="//a[contains(text(),'Camper')]";
public static final String homepageHeading ="//div[@class='logo-text']";
public static final String productListOnHomepage = "//a[@href='#']/parent::li[@class='menu-item']";

/*
 * Enter Vehicle data Page Constant
 */
public static final	String EnterVehicleData ="a#entervehicledata";
public static final	String SelectedInsurence ="//*[@id='selectedinsurance']";
public static final	String MakeDropdown ="//select[@id='make']";
public static final String EnginePerformance ="//input[@id='engineperformance']";
public static final String CalenderDataPicker ="//button[@id=\"opendateofmanufacturecalender\"]";
public static final String EnterCalenderDate ="//input[@id='dateofmanufacture']";
public static final String NumberOfSeatDropdown ="//select[@id='numberofseats']";
public static final String FuelTypeDropdown ="//select[@id='fuel']";
public static final String ListPrice="//input[@id='listprice']";
public static final String LicenanceplateNo ="//input[@id='licenseplatenumber']";
public static final String AnnualMileage ="//input[@id='annualmileage']";
public static final String NextButton ="//button[@id='nextenterinsurantdata']";

/*
 * Enter Insurance Data page constant
 */
public static final	String firstname ="input[id='firstname']";
public static final	String lastname ="input#lastname";
public static final	String calenderdateonInsurencepage ="//input[@id='birthdate']";
public static final	String CalenderErrorMessage = "//button[@class='ui-datepicker-trigger']/following-sibling::*[contains(text(),'You must be between 18 and 70 years of age')]";
public static final String GenderLabel ="//label[text()='Gender']";
public static final	String GenderRadioButtons = " //input[@name=\"Gender\"]/parent::label[@class='ideal-radiocheck-label']";
public static final	String CountryDropdown ="//select[@id='country']";
public static final	String ZipCode = "//input[contains(@id,'zipcode')]";
public static final	String city = "//input[@name='City']";
public static final	String OccupationDropdown ="//select[contains(@name,'Occupation')]";
public static final String HobbiesLabel ="//label[text()='Hobbies']";
public static final	String HobbiesCheckboxes ="//input[@name='Hobbies']/parent::label[@class='ideal-radiocheck-label']";
public static final	String NextButtononInsurancepage ="//button[@id='nextenterproductdata']";
public static final	String PrevButtononInsurancepage ="//button[@id='preventervehicledata']";

/*
 * Enter product data page constant
 */
public static final String StartDate ="//input[@id='startdate']";
public static final String Insurancesumdropdown ="select[name = 'Insurance Sum']";
public static final String MeritRatingdropdown = "select#meritrating";
public static final String DamageInsurancedropdown ="select#damageinsurance";
public static final String OptionalProductlabel ="//label[text()='Optional Products']";
public static final String OptionalCheckbox = "//input[@name='Optional Products[]']";
public static final String CourtesyCardropdown ="//select[@id='courtesycar']";
public static final String NextButtonProductpage = "//button[@id='nextselectpriceoption']";
public static final String PrevButtonProductpage ="//button[@id='preventerinsurancedata']";













}
