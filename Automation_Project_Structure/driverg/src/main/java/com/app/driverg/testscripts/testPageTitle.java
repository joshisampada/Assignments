package com.app.driverg.testscripts;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.driverg.constants.PjojectPathConstants;
import com.app.driverg.testsuite.SampleSuiteBase;
import com.app.driverg.utils.PropertiesUtil;



public class testPageTitle extends SampleSuiteBase {
	
	WebDriver driver;
	static Properties configProps = PropertiesUtil.loadProperty(PjojectPathConstants.config);
	
	@BeforeTest
	public void befor() {
		System.out.println("in brfore");
	}
	
	@Test
	public void testPageTitle1() {
		driver = invokeBrowser();
		
		String baseUrl = configProps.getProperty("applicationurl");
	    String expectedTitle = "Hire Driver | Hire Taxi |  Hire Loading Vehicle";
	    String actualTitle = "";
	    
	    driver.get(baseUrl); 
	    actualTitle = driver.getTitle();
	    
	    Assert.assertEquals(actualTitle, expectedTitle);
	    
	    /*if (actualTitle.contentEquals(expectedTitle)){
	        System.out.println("Test Passed!");
	    } else {
	        System.out.println("Test Failed");
	    }*/
		
		
		
		/*System.out.println("test started");
		driver = invokeBrowser();
		driver.get("http://www.google.com");*/
	}
	
	

}
