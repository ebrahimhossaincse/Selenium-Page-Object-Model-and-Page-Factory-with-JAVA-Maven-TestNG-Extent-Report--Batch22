package com.ebrahim.qa.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ebrahim.qa.drivers.PageDriver;
import com.ebrahim.qa.pages.LoginPage;
import com.ebrahim.qa.utilities.CommonMethods;
import com.ebrahim.qa.utilities.ExtentFactory;

public class LoginTest extends CommonMethods{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().get(url);
		timeout();
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Orange HRM</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	
	@Test
	public void testLoginMethod() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Login</b></p>");
		LoginPage loginPage = new LoginPage(childTest);
		loginPage.login();
	}
	
	@AfterClass
	public void report() {
		report.flush();
	}

}
