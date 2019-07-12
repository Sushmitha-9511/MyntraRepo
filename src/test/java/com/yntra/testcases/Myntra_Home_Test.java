package com.yntra.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.base.TestBase;
import com.myntra.pages.Myntra_Home_Page;
import com.myntra.pages.Myntra_Login_Page;
import com.myntra.pages.Myntra_Men_Page;

public class Myntra_Home_Test extends TestBase {
	Myntra_Login_Page login;
	Myntra_Home_Page homepage;
	Myntra_Men_Page menpage;

	public Myntra_Home_Test()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setup()
	{
		initilaization();
		login= new Myntra_Login_Page();
		login.myntraLogin(prop.getProperty("username"), prop.getProperty("password"));
		homepage= new Myntra_Home_Page();
		
	}
	
	
	@Test(priority=1)
	public void clickOnMenTag()
	{
		menpage=homepage.mens_Page();
	}
	
	@Test(priority=0)
	public void searchSomeElement()
	{
		homepage.searchElement("Women");
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}


