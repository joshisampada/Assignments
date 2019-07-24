package com.atmecs.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertPopUpHandling
{
WebDriver driver;

	
	public void invoke(String browser)
	{

	if (browser.equalsIgnoreCase("chrome")) {

		System.out.println("--Testing is started in Chrome--");

		driver = new ChromeDriver();
		
		} else if (browser.equalsIgnoreCase("firefox")) {
		System.out.println("--Testing is started in FireFox--");
		driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("ie")) {
		System.out.println("--Testing is started in Internet Explore--");

		driver = new InternetExplorerDriver();

		}

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	}
	
	
	@Test
	public void Test2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampada.Joshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();  //clicking on go button
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//click on OK button
		//alert.dismiss();//if you want to click on cancel button
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}
}
