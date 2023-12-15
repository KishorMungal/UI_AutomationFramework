package com.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageObject.HomePage;

public class ObjectUtilities extends CommonFunctions {
	public CommonFunctions cm;
	public HomePage homepage;

	public void Objectfunction() throws IOException {
		cm = new CommonFunctions();
		homepage = new HomePage();
	}

//	//@BeforeMethod
//	public void Setup() {
//		try {
//			SetupFunction();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	//@AfterMethod
//	public void Shutdown() {
//		TeardownFunction();
//	}
}
