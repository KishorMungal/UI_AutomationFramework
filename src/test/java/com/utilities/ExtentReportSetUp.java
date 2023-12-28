package com.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportSetUp {
 public static ExtentReports extent;
 public static ExtentSparkReporter htmlReporter;
 public static ExtentTest ExtentTest;
 public static String Timestamp;
 
	public static ExtentReports setExtentReport() {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyy");
		Date date = new Date();
		String ExecutionDate = dateformat.format(date);
		Timestamp = new SimpleDateFormat("HH-mm-ss").format(new Date());
		
		
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/Test_Reports" + ExecutionDate + "/Report "+ Timestamp + ".html");
		extent = new ExtentReports();
		extent.setSystemInfo("Tester Name", "Kishor");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Environment", "QA");
		extent.attachReporter(htmlReporter);
		return extent;
		

	}

}


