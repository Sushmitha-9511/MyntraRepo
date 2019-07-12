package com.myntra.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.myntra.test.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties(); // Properties is a default class
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Sushmitha\\eclipse-workspace\\Myntra\\src\\main\\java\\com\\myntra\\config\\config.properties"); // this
																																	// will
																																	// connect
																																	// to
																																	// config.properties
																																	// file
			prop.load(ip); // this will load the file

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initilaization() {
		String browser_name = prop.getProperty("browser");
		String url_name = prop.getProperty("url");
		if ((browser_name).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sushmitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.get(url_name);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
}
