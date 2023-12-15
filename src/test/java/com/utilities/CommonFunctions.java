package com.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testBase.TestBase;

public class CommonFunctions extends TestBase {

	public WebDriver driver;
	public WebDriverWait wait;

	public CommonFunctions() {
	//wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait = new WebDriverWait(driver, 10);
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

	public void waitforElementToBeDisplayed(WebElement element) {
		try {

			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Timeout - element not detected even after 180 Seconds - " + element, e.getCause());
		}
	}
	
	public  void selectDropDown(String value, By element) {

		try {
			Select select = new Select(driver.findElement(element));
			select.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Issue while selecting an option in the dropdown - " +element, e.getCause());
		}
	}
	
	public String ListOFAvailableElement(List<WebElement> elements) {
		String productType=" ";
		for(WebElement element : elements) {
			productType = element.getText();
		}
		return productType;
	}
	
	public void ThreadSleepTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
