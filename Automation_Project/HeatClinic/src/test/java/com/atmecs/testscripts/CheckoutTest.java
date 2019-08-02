package com.atmecs.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.driverg.utils.PropertiesUtil;
import com.atmecs.constants.ProjectPathConstants;
import com.atmecs.testsuite.TestBase;

public class CheckoutTest extends TestBase
{
	WebDriver driver;
	static Properties configProps = PropertiesUtil.loadProperty(ProjectPathConstants.config);
	
	
	@BeforeTest
	public void preSetup()
	{
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperations();
	}
	
	
	@Test
	public void checkout()
	{
	
	//To navigate to the Clearance Page
	driver.findElement(By.xpath(objectrepoProps.getProperty("navigateToClearancePage"))).click();
	
	//To click on Buy Now option
	driver.findElement(By.xpath(objectrepoProps.getProperty("BuyNowbtn"))).click();
	
	//To click on cart
	driver.findElement(By.xpath("//img[@alt='Shopping Cart Icon']")).click();
	
	String getcount=driver.findElement(By.xpath("(//input[@name=\"quantity\"])[6]")).getText();
	System.out.println(getcount);
	
	
	
	
	
	}
}
