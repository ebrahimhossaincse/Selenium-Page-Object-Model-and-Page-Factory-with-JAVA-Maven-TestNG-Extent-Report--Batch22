package com.ebrahim.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ebrahim.qa.drivers.PageDriver;
import com.ebrahim.qa.pages.LoginPage;
import com.ebrahim.qa.utilities.CommonMethods;

public class EmployeeTest extends CommonMethods{
	
	@Test 
	public void addEmployee() {
		System.out.println(PageDriver.getCurrentDriver().getTitle());
	}
}
