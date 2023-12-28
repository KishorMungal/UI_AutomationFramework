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
}
