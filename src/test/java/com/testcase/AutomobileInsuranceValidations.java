package com.testcase;

import org.testng.annotations.Test;

import com.utilities.ObjectUtilities;

public class AutomobileInsuranceValidations extends ObjectUtilities{
	
	
	
    @Test
	public void ValidateAutomobileInsurence() {
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
		
	}
	
	
	
	
}
