package com.atmecs.automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
	
	WebDriver d;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampada.Joshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();

		GetCommands();
	}
	
	public void GetCommands()
	{
		d.get("https://accounts.google.com/signin/v2/identifier?flowEntry=ServiceLogin&flowName=GlifWebSignIn");
		
		
		String title = d.getTitle();
		System.out.println("Title of the page is" +title);
		
		
		String currentUrl = d.getCurrentUrl();
		System.out.println("The current URL is" +currentUrl);
	}
	
	public static void main(String[] args)
	{
		TestGetCommands myObj = new TestGetCommands();
		myObj.invokeBrowser();
	}
		
		
	}


