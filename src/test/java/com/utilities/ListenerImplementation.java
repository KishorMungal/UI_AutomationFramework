package com.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.testBase.TestBase;

public class ListenerImplementation extends ExtentReportSetUp implements ITestListener {

	ObjectUtilities obj = new ObjectUtilities();
	 
	public void onTestStart(ITestResult result) {
		System.out.println("Test Name  : " + result.getName());
		ExtentTest = extent.createTest("Test is started : " + result.getName());
		//ExtentTest.    info("Test is started : " + result.getName()); 
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished  : " + context.getName());
		extent.flush();
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed  : " + result.getName());
		ExtentTest.log(Status.PASS, "Test case is passed " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed  : " + result.getName());
		
		ExtentTest.log(Status.FAIL,"Test case failed " + result.getName());
		ExtentTest.log(Status.FAIL, "Test case failed " + ((ITestResult) result).getThrowable());
		ExtentTest.log(Status.FAIL, "failed Test").addScreenCaptureFromPath(CommonFunctions.TakeSnapshot(TestBase.driver,result.getName()+Timestamp)); 
	    //ExtentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(CommonFunctions.TakeSnapshot(TestBase.driver,result.getName())+result.getName()).build());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		ExtentTest.log(Status.SKIP, "Test case is skip " + result.getName());
		System.out.println("Test skipped  : " + result.getName());
	}

	public void onStart(ITestContext Context) {
		ExtentReportSetUp.setExtentReport();
		System.out.println("Test Started  : " + Context.getName());
//		try {
//			//File file =new File("APIResponseBody.txt");
//			if(file.delete()) {
//			log.info("Previous file is deleted successfully");
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
	}
}
