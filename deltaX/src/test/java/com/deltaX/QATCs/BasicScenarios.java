package com.deltaX.QATCs;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.deltaX.formApplication.registrationForm;

import commonLibs.implementation.Driver;
import commonLibs.utils.DateUtils;
import commonLibs.utils.ReadConfigFileUtils;

import commonLibs.implementation.TakeScreenshot;

public class BasicScenarios {

	public Driver browserDriver;
	public registrationForm registerUser;
	public WebDriver driver;
	public String configFileName;
	public Properties ReadProperty;
	public String currentProjectDirectory;

	public ExtentHtmlReporter reportHTMLFile;
	public ExtentReports report;
	public ExtentTest logger;

	public TakeScreenshot camera;

	public String testExectuionStartTime;
	
	// below method reads the values from property file

	@BeforeSuite
	public void GetConfigProperties() {

		try {

			testExectuionStartTime = DateUtils.getDate();

			currentProjectDirectory = System.getProperty("user.dir");
			configFileName = currentProjectDirectory + "/config/config.properties";
			ReadProperty = ReadConfigFileUtils.readProperties(configFileName);

			String reportFileNameeName = currentProjectDirectory + "/reports/"
					+ ReadProperty.getProperty("reportFileName");
			reportHTMLFile = new ExtentHtmlReporter(reportFileNameeName + testExectuionStartTime + ".html");
			report = new ExtentReports();
			report.attachReporter(reportHTMLFile);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// below method is to invoke the browser and runs before every test case
	
	@BeforeMethod
	public void InvokeBrowser() {

		try {

			logger = report.createTest("TC456 : Invoking Browser");

			String browser = ReadProperty.getProperty("browserType");
			browserDriver = new Driver(browser);

			int ElementDetectionTimeoutConfig = Integer.parseInt(ReadProperty.getProperty("ElementDetectionTimeout"));
			browserDriver.setElementDetectionTimeout(ElementDetectionTimeoutConfig);
			logger.info("Element detection timeout:" + ElementDetectionTimeoutConfig);

			int PageLoadTimeoutConfig = Integer.parseInt(ReadProperty.getProperty("PageLoadTimeout"));
			browserDriver.setPageLoadTimeout(PageLoadTimeoutConfig);
			logger.info("page load timeout:" + PageLoadTimeoutConfig);

			String URLConfig = ReadProperty.getProperty("URL");
			browserDriver.navigateToFirstUrl(URLConfig);
			logger.info("URL to invoke:" + URLConfig);

			driver = browserDriver.getDriver();

			camera = new TakeScreenshot(driver);

			registerUser = new registrationForm(driver);

		} catch (Exception e) {

			logger.error("Error" + e.getMessage());
			e.printStackTrace();
			Assert.fail("An exception occured...");
		}

	}
	
	// below method is to capture the screenshot whenever TC is failed

	@AfterMethod
	public void screenCapture(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.FAILURE) {

			logger.fail("Test case Failed :: " + result.getName());

			String fileName = currentProjectDirectory + "\\screenshots\\" + result.getName() + testExectuionStartTime

					+ ".png";

			String resultPath = camera.captureAndSaveScreenshot(fileName);

			System.out.println(resultPath);

			logger.addScreenCaptureFromPath(resultPath);

		}

		else if (result.getStatus() == ITestResult.SKIP) {

			logger.skip("Test case Skipped :: " + result.getName());

		} else {

			logger.pass("Test case passed :: " + result.getName());

		}

	}
	
	// below method is to clsoe the browser everytime one TC is done

	@AfterMethod(alwaysRun = true, dependsOnMethods = "screenCapture")

	public void CloseBrowser() {

		try {

			browserDriver.closeAllBrowsers();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	// below method to clean up the reports cache

	@AfterSuite
	public void cleanUp() {

		report.flush();
	}

}
