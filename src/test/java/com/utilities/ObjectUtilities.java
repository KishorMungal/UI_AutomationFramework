package com.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageObject.HomePage;
import com.testBase.TestBase;

public class ObjectUtilities extends TestBase {
	
	public static CommonFunctions cm;
	public static HomePage homepage;


	@BeforeMethod
	public void Setup() {
		try {
			TestBase.SetupFunction();
			cm = new CommonFunctions();
			homepage = new HomePage();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void Shutdown() {
		TestBase.TeardownFunction();
	}
}
