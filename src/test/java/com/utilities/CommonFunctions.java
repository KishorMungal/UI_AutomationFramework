package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testBase.TestBase;

public class CommonFunctions extends TestBase {

	// public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,null);

	public CommonFunctions(WebDriver driver) {
		// this.driver= driver;
		// wait = new WebDriverWait(driver,30);

	}

	public boolean isElementDisplay(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}

	public static boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}

	public void waitforElementToBeDisplayedForTools(WebElement element) {
		try {

			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Timeout - element not detected even after 180 Seconds - " + element, e.getCause());
		}
	}
}
