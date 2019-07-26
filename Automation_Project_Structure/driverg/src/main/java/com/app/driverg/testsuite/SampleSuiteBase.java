package com.app.driverg.testsuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.app.driverg.constants.PjojectPathConstants;
import com.app.driverg.utils.PropertiesUtil;
import com.beust.jcommander.Parameter;

public class SampleSuiteBase
{
	WebDriver driver;

	
	static Properties configProps = PropertiesUtil.loadProperty(PjojectPathConstants.config);
	
	

	public enum BrowserType {
		FIREFOX, CHROME, IE,EDGE,SAFARI, HEADLESS
	}
	
	public WebDriver getwebDriver() {
		return this.driver;
	}


	public WebDriver invokeBrowser() 
	{
		System.out.println("invoke");
		String browser = configProps.getProperty("browserName");
		switch (BrowserType.valueOf(browser)) {
		case CHROME:{
			this.driver = setChromeDriver();
			System.out.println("Chrome driver set "+driver);
			break;
		}
		case FIREFOX:
			System.out.println("firefox case");
			this.driver = setFirefoxDriver();
			System.out.println("Firefox driver set "+driver);
			break;

		case IE:
			this.driver = setInterExplorerDriver();
			System.out.println("Internet driver set "+driver);
		default:
			break;
		}
			return driver;
			/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampada.Joshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();*/
		}

		private WebDriver setChromeDriver() {
			//String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
				//System.setProperty("webdriver.chrome.driver", currentdir + "chromedriver.exe");
				System.out.println("pathhhhhh");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampada.Joshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
			return new ChromeDriver();
		}

		private WebDriver setFirefoxDriver() {
			String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
				System.setProperty("webdriver.gecko.driver", currentdir + "geckodriver.exe");
			return new FirefoxDriver();
		}

		public WebDriver setInterExplorerDriver() {
			String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
			System.setProperty("webdriver.ie.driver", currentdir + "IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
	}

