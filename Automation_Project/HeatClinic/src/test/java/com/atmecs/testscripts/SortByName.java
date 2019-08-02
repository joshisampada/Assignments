package com.atmecs.testscripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.app.driverg.utils.PropertiesUtil;
import com.atmecs.constants.ProjectPathConstants;
import com.atmecs.testsuite.TestBase;

public class SortByName extends TestBase
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
	public void sort() 
	{
		driver.get("http://10.10.10.232:8080/");

		//To navigate to the Clearance Page
		driver.findElement(By.xpath(objectrepoProps.getProperty("navigateToClearancePage"))).click();

		//Taking the price on the page in List & considering as original list
		List<WebElement> names = driver.findElements(By.xpath(objectrepoProps.getProperty("originalNameList")));
		List<String> originalList = new ArrayList<>();

		//To get the data present on page
		for(WebElement prodname:names) 
		{
			String actual = prodname.getText();
			originalList.add(actual);
			System.out.println(actual);
		}

		System.out.println("original :"+originalList);


		//To sort the collected data in ascending order
		List<String> expectedAscendingList = originalList;
		Collections.sort(expectedAscendingList);
		System.out.println("asc :"+expectedAscendingList);

		//To check whether data is getting sorted ascending by click
		driver.findElement(By.xpath(objectrepoProps.getProperty("ascendingNamelink"))).click();

		//Taking the data list after sorting
		List<WebElement> sorted1 = driver.findElements(By.xpath(objectrepoProps.getProperty("postClickNameList")));
		List<String> actualListAfterSort = new ArrayList<>();

		//To get the data present on page after sorting
		for(WebElement name:sorted1) 
		{

			String actual = name.getText();
			actualListAfterSort.add(actual);
			System.out.println(actual);
		}

		System.out.println("after sort click :"+actualListAfterSort);

		System.out.println(actualListAfterSort);
		System.out.println(expectedAscendingList);
		Assert.assertEquals(actualListAfterSort, expectedAscendingList);	

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Name']")));                             
		// WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\\\"http://10.10.10.232:8080/clearance?sort=name+desc\\\"]")));


		//To check whether data is getting sorted descending
		List<String> expectedDesceningList = expectedAscendingList;
		Collections.reverse(expectedAscendingList);
		System.out.println("desc :"+expectedDesceningList);

		//To check whether data is getting sorted descending
		driver.findElement(By.xpath(objectrepoProps.getProperty("descendingNameLink"))).click();

		//Taking the data list after sorting
		List<WebElement> sorted2 = driver.findElements(By.xpath(objectrepoProps.getProperty("postClickNameDisplay")));
		List<String> actualListAfterSort1 = new ArrayList<>();

		//To get the data present on page after sorting
		for(WebElement name:sorted2) 
		{
			String actual1 = name.getText();
			actualListAfterSort1.add(actual1);
			System.out.println(actual1);
		}


		System.out.println("after sort click :"+actualListAfterSort1);
		System.out.println(actualListAfterSort1);
		System.out.println(expectedDesceningList);
		Assert.assertEquals(actualListAfterSort1, expectedDesceningList);
	}


	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
