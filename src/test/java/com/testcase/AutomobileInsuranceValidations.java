package com.testcase;

import org.testng.annotations.Test;

import com.utilities.ObjectUtilities;

public class AutomobileInsuranceValidations extends ObjectUtilities{
	
	
	
    @Test
	public void ValidateAutomobileInsurence() {
    	homepage.ElementsAvailableOnHomepage();
    	homepage.ClickOnAutomobileMenu();
    	Vehicledata.ValidateSelectedInsurence();
    	Vehicledata.SelectMakeType();
    	Vehicledata.Enter_enginePerformance();
    	Vehicledata.Enter_DateOfmanufacture();
    	Vehicledata.SelectNumberOfSeats();
    	Vehicledata.SelectFuelType();
    	Vehicledata.Enter_ListPrice();
    	Vehicledata.Enter_LicenceNumberPlate();
    	Vehicledata.Enter_AnnualMileage();
    	Vehicledata.clickonNextButton();
    	insurancedata.EnterFirstName("Test");
    	insurancedata.EnterLastName("QAAutomation");
    	insurancedata.EnterDateOfBirth("10/10/2000");
    	insurancedata.SelectUserGender("Male");
    	insurancedata.SelectUserCountry("India");
    	insurancedata.EnterZipCOde("43432");
    	insurancedata.EnterCityName("Mumbai");
    	insurancedata.SelectUserOccupation("Employee");
    	insurancedata.SelectUserHobbies(" Speeding");
    	insurancedata.clickOnNextButton();
    	productpage.EnterStartDate("11/02/2024");
    	productpage.SelectInsuranceSum(" 5.000.000,00");
    	productpage.SelectMeritRating("Bonus 3");
    	productpage.SelectdamageInsurance("Full Coverage");
    	productpage.SelectOptionalProducts("Legal Defense Insurance");
    	productpage.SelectCourtesyCar(" Yes");
    	productpage.clickOnProductPageNextButton();
		
	}
	
	
	
	
}
