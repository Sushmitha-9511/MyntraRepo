package com.myntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.base.TestBase;

public class Myntra_Home_Page extends TestBase {
	
	@FindBy(xpath="//input[@placeholder=\"Search for products, brands and more\"]")
	WebElement Search;
	@FindBy(xpath="//a[@class=\"desktop-submit\"]")
	WebElement search_button;
	@FindBy(xpath="//div[@class=\"desktop-navLink\"]//a[@href=\"/shop/men\"]")
	WebElement Men_tag;
	
	public Myntra_Home_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchElement(String input)
	{
		Search.sendKeys(input);
		search_button.click();
	}
	
	public Myntra_Men_Page mens_Page()
	{
		Men_tag.click();
		return new Myntra_Men_Page();
	}

}
