package com.ebrahim.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.ebrahim.qa.drivers.PageDriver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}

	/*
	 * 1. Locators 2. Methods
	 */

	@FindBys({ @FindBy(xpath = "//input[@name='username']") })
	WebElement userName;

	@FindBys({ @FindBy(xpath = "//input[@name='password']") })
	WebElement password;

	@FindBys({ @FindBy(xpath = "//button[@type='submit']") })
	WebElement submit;

	public void login() {
		try {
			if (userName.isDisplayed()) {
				userName.sendKeys("Admin");
				Thread.sleep(2000);
				try {
					if (password.isDisplayed()) {
						password.sendKeys("admin123");
						Thread.sleep(2000);
						try {
							if (submit.isDisplayed()) {
								submit.click();
								Thread.sleep(5000);
							}
						} catch (Exception e) {
							System.out.println(e);
						}
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Password was not locateable.");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("User name was not locateable.");
		}
	}

}
