package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testBase.TestBase;

public class CommonFunctions extends TestBase {

	public WebDriverWait wait;

	public CommonFunctions() {
		// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait = new WebDriverWait(driver, 10);
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

	public void selectDropDown(String value, WebElement element) {

		try {
			Select select = new Select(element);
			select.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Issue while selecting an option in the dropdown - " + element, e.getCause());
		}
	}

	public String ListOFAvailableElement(List<WebElement> elements) {
		String productType = " ";
		for (WebElement element : elements) {
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

	public static String TakeSnapshot(WebDriver driver, String snapName) {
		File Snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String SnapPath = System.getProperty("user.dir") + "/FailedTestScreenshot/" + snapName + ".png";
		File fileinput = new File(SnapPath);
		try {
			FileUtils.copyFile(Snap, fileinput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SnapPath;
	}

	public void ClickOnElement(WebElement element) {
		element.click();
	}

	public void NavigateBack() {
		driver.navigate().back();
	}

	public void CheckSelectedInsurence(WebElement InsrenceSelected, String InsurenceType) {
		Assert.assertEquals(InsrenceSelected.getText(), InsurenceType, "Selected Insurence type is mismatch");
		ThreadSleepTime(2000);
	}
	
	public void EnterSendKeys(WebElement ele, String Keys) {
		ele.sendKeys(Keys);
	}
	
	public void RefreshWebpage() {
		driver.navigate().refresh();
	}
	
	
	
}
