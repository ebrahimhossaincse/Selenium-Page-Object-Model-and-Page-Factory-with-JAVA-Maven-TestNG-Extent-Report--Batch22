package com.ebrahim.qa.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.ebrahim.qa.drivers.BaseDriver;
import com.github.javafaker.Faker;

public class CommonMethods extends BaseDriver {

	public void timeout() throws InterruptedException {
		Thread.sleep(5000);
	}

	public void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void testDataGenerator() throws FileNotFoundException, IOException {

		Faker faker = new Faker();

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();

		System.out.println(firstName);
		System.out.println(lastName);

		ExcelUtils excelUtils = new ExcelUtils();

		excelUtils.writeExcelData(firstName, lastName, "test", "1236410", "1616");

	}
}
