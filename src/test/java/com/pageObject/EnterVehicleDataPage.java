package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utilities.CommonFunctions;
import com.utilities.ObjectUtilities;

public class EnterVehicleDataPage extends ObjectUtilities {
	public CommonFunctions cm;
	@FindBy(css = pageConstant.EnterVehicleData)
	public WebElement Enter_VehicleData;

	@FindBy(xpath = pageConstant.SelectedInsurence)
	public WebElement InsurenceSelected;

	@FindBy(xpath = pageConstant.MakeDropdown)
	public WebElement Make_Dropdown;

	@FindBy(xpath = pageConstant.EnginePerformance)
	public WebElement Engine_Performance;

	@FindBy(xpath = pageConstant.EnterCalenderDate)
	public WebElement CalenderDate;

	@FindBy(xpath = pageConstant.NumberOfSeatDropdown)
	public WebElement SelectedSeatNo_dropdown;

	@FindBy(xpath = pageConstant.FuelTypeDropdown)
	public WebElement FuelType_dropdown;

	@FindBy(xpath = pageConstant.ListPrice)
	public WebElement List_Price;

	@FindBy(xpath = pageConstant.LicenanceplateNo)
	public WebElement Licenceplate_number;

	@FindBy(xpath = pageConstant.AnnualMileage)
	public WebElement Enter_AnnualMileage;

	@FindBy(xpath = pageConstant.CalenderDataPicker)
	public WebElement Datepicker_element;

	@FindBy(xpath = pageConstant.NextButton)
	public WebElement NextButton_element;

	public EnterVehicleDataPage() {
		PageFactory.initElements(driver, this);
		cm = new CommonFunctions();
	}

	public void ValidateSelectedInsurence() {
		cm.CheckSelectedInsurence(InsurenceSelected, "Automobile Insurance");
	}

	public void SelectMakeType() {
		cm.selectDropDown("Mercedes Benz", Make_Dropdown);
	}

	public void Enter_enginePerformance() {
		cm.EnterSendKeys(Engine_Performance, "500");
	}

	public void Enter_DateOfmanufacture() {
		cm.EnterSendKeys(CalenderDate, "10/06/2022");
	}

	public void SelectNumberOfSeats() {
		cm.selectDropDown("4", SelectedSeatNo_dropdown);
	}

	public void SelectFuelType() {
		cm.selectDropDown("Diesel", FuelType_dropdown);
	}

	public void Enter_ListPrice() {
		cm.EnterSendKeys(List_Price, "70000");
	}

	public void Enter_LicenceNumberPlate() {
		cm.EnterSendKeys(Licenceplate_number, "MH-26 K-50");
	}

	public void Enter_AnnualMileage() {
		cm.EnterSendKeys(Enter_AnnualMileage, "25000");
	}

}
