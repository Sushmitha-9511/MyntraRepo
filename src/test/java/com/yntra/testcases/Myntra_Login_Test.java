package com.yntra.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.base.TestBase;
import com.myntra.pages.Myntra_Home_Page;
import com.myntra.pages.Myntra_Login_Page;

public class Myntra_Login_Test extends TestBase {
	Myntra_Login_Page login;
	Myntra_Home_Page homepage;
	
public Myntra_Login_Test()
{
	super();
	
}


@BeforeMethod
public void setup()

{
	
	initilaization();
	login = new Myntra_Login_Page();
}

@Test(priority=1)
public void verifyingTitle()
{
	String actual_title=login.LoginGetTitle();
	Assert.assertEquals(actual_title, "Login");
}

@Test(priority=2)
public void clickOnMyntraLogin()
{
	homepage=login.myntraLogin(prop.getProperty("username"),prop.getProperty("password"));
}
@AfterMethod
public void close()
{
	driver.quit();
}
}
