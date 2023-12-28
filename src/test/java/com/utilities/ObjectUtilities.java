package com.utilities;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageObject.EnterInsuranceDatapage;
import com.pageObject.EnterVehicleDataPage;
import com.pageObject.HomePage;
import com.testBase.TestBase;

public class ObjectUtilities extends TestBase {
	
	public static CommonFunctions cm;
	public static HomePage homepage;
	public static EnterVehicleDataPage Vehicledata;
	public static EnterInsuranceDatapage insurancedata;
	public static ExtentReportSetUp extentTest;


	@BeforeMethod
	public void Setup() {
		try {
			TestBase.SetupFunction();
			cm = new CommonFunctions();
			homepage = new HomePage();
			extentTest = new ExtentReportSetUp();
			Vehicledata = new EnterVehicleDataPage();
			insurancedata = new EnterInsuranceDatapage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void Shutdown() {
		TestBase.TeardownFunction();
	}
}
