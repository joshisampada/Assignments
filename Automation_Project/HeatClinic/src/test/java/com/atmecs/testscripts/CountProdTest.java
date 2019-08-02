package com.atmecs.testscripts;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.app.driverg.constants.PjojectPathConstants;
import com.app.driverg.utils.PropertiesUtil;
import com.atmecs.constants.ProjectPathConstants;
import com.atmecs.testsuite.TestBase;

public class CountProdTest extends TestBase
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
	public void CountProdTest() throws InterruptedException
	{
		//To get current url
		String url=driver.getCurrentUrl();
		System.out.println(url);

		//To check CurrentPageUrl
		String i = driver.getCurrentUrl();
		System.out.println(i);	    

		//To navigate to the Clearance Page
		driver.findElement(By.xpath(objectrepoProps.getProperty("navigateToClearancePage"))).click();
		
		//To get the list of product images present on page
		List<WebElement> listImages=driver.findElements(By.xpath(objectrepoProps.getProperty("imageList")));
		System.out.println("No. of Product Images: "+listImages.size());
	}

	@AfterTest   
	public void tearDown() 
	{
		driver.close();

	}
}
