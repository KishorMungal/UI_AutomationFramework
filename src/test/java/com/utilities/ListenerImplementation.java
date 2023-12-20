package com.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends ObjectUtilities implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started  : " + result.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished  : " + context.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed  : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		CommonFunctions.TakeSnapshot(driver,result.getName());
		//System.out.println("Test Fail  : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped  : " + result.getName());
	}

	public void onStart(ITestContext context) {
//		try {
//			//ExtentReportSetUp.setExtentreport();
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
