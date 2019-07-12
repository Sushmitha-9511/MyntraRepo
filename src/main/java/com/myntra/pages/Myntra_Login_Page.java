package com.myntra.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.base.TestBase;

public class Myntra_Login_Page extends TestBase {

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement username;
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	@FindBy(xpath = "//button[text()=\"Log in\"]")
	WebElement login_button;

	public Myntra_Login_Page() {

		PageFactory.initElements(driver, this);
	}
	
	public String LoginGetTitle()
	{
		return driver.getTitle();
	}

	public Myntra_Home_Page myntraLogin(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();
		return new Myntra_Home_Page();
	}
}
