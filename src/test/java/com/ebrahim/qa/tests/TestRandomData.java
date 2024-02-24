package com.ebrahim.qa.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.ebrahim.qa.utilities.ExcelUtils;
import com.github.javafaker.Faker;

public class TestRandomData {
	static String firstName;
	static String lastName;
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Faker faker = new Faker();

		firstName = faker.name().firstName();
		lastName = faker.name().lastName();

		System.out.println(firstName);
		System.out.println(lastName);
		
		ExcelUtils excelUtils = new ExcelUtils();
		
		excelUtils.writeExcelData(firstName, lastName, "test", "1236410", "1616");

	}

}
