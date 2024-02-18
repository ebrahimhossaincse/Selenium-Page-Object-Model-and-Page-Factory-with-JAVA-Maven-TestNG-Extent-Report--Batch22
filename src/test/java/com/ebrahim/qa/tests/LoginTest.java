package com.ebrahim.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebrahim.qa.drivers.PageDriver;
import com.ebrahim.qa.pages.LoginPage;
import com.ebrahim.qa.utilities.CommonMethods;

public class LoginTest extends CommonMethods{
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().get(url);
		timeout();
	}
	
	@Test
	public void testLoginMethod() {
		LoginPage loginPage = new LoginPage();
		loginPage.login();
	}

}
