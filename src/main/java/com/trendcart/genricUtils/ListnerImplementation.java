package com.trendcart.genricUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementation extends 	BaseClass implements ITestListener {

	ExtentReports report;
	ExtentTest test;
	public void onTestStart(ITestResult result) 
	{
		String methodname=result.getMethod().getMethodName();
		test=report.createTest(methodname);

		
		Reporter.log(methodname+"------testscript excecution start from here");
	}

	public void onTestSuccess(ITestResult result) 
	{
		
		String methodname=result.getMethod().getMethodName();
		test.log(Status.PASS,methodname+"----------------");
		Reporter.log(methodname+"--------testscript excecutedsucsesfully");
	
		
	}

	public void onTestFailure(ITestResult result) 
	{
		String FS=result.getMethod().getMethodName();
		String FScript = FS+ new JavaUtils().systemDateInFormat();
		test.addScreenCaptureFromPath(FScript);
		try {
			WebDriverUtils.getScreenShot(BaseClass.sdriver, FScript);
			}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		test.log(Status.FAIL,result.getThrowable());
		test.log(Status.FAIL, FScript+"----->Failed");
		Reporter.log(FScript+"--------->Testscript excecutin fail");
	}

	public void onTestSkipped(ITestResult result) 
	{
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"-----skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodname+"----------------skipped-----");
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./Extent Report/reporter.html");
		htmlreport.config().setDocumentTitle("SDET-52");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("TRENDCART");
		 report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("url","http://rmgtestingserver/domain/Online_Shopping_Application/" );
		report.setSystemInfo("Reporter name", "sachin");
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}
	
	

}
