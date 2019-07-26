package com.app.driverg.testscripts;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.app.driverg.testsuite.SampleSuiteBase;

public class DriverGTest extends SampleSuiteBase
{
	WebDriver driver = getwebDriver();
	
	@BeforeTest
	public void invoke(String browser)
	{

	/*if (browser.equalsIgnoreCase("chrome")) {

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
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampada.Joshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	}*/
	}
	
	@Test
	public void tesPageTitle() {
		
	}
	
	
	@Test
	public void Test1() throws InterruptedException
	{
	/*System.setProperty("webdriver.firefox.bin","C:\\Users\\Sampada.Joshi\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	//System.setProperty("webdriver.firefox.marrionette","C:\\Users\\Sampada.Joshi\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();*/
	
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampada.Joshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();*/
	
		//driver.get("https://www.driverg.com/Registration.php");
	String baseUrl = "https://www.driverg.com/Registration.php";
	
    String expectedTitle = "Hire Driver | Hire Taxi |  Hire Loading Vehicle";
    String actualTitle = "";
    
    driver.get(baseUrl);
    
    actualTitle = driver.getTitle();
    
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
   
    //Thread.sleep(1000);
    
    String url=driver.getCurrentUrl();
    System.out.println(url);
    
    driver.findElement(By.id("email")).sendKeys("9874563214");
    driver.findElement(By.name("password")).sendKeys("9874563214");
    driver.findElement(By.name("name")).sendKeys("Sampada Joshi");
    driver.findElement(By.id("mobile")).sendKeys("8954123654");
    driver.findElement(By.id("location")).sendKeys("Mumbai");
    driver.findElement(By.name("image1")).isSelected();
    driver.findElement(By.name("image2")).isSelected();
    driver.findElement(By.name("licence_no")).sendKeys("8954");
    driver.findElement(By.id("endtime")).sendKeys("02/06/1998" +Keys.ENTER);
    
   Thread.sleep(2000);
    
   
   
    
    //For selecting radio buttons
    WebElement radio1 = driver.findElement(By.id("gender"));
    WebElement radio2 = driver.findElement(By.id("genders"));
  
   // radio1.click();			
    //System.out.println("Radio Button Option 1 Selected");					
    		
    //Radio Button1 is de-selected and Radio Button2 is selected		
    radio2.click();			
    System.out.println("Radio Button Option 2 Selected");	
    //Thread.sleep(2000);

   
    WebElement radiobtn1 = driver.findElement(By.id("marital"));
    WebElement radiobtn2 = driver.findElement(By.id("marital1"));
    
    radiobtn2.click();
    System.out.println("Radio button option  2 is selected");
    //Thread.sleep(2000);

    
   //For selecting checkboxes 
   driver.findElement(By.xpath("//input[@value='Hindi']")).click(); 	
   driver.findElement(By.xpath("//input[@value='English']")).click(); 
   driver.findElement(By.xpath("//input[@value='Marathi']")).click();
   //Thread.sleep(2000);
   
   List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
   int checkedCount = 0;
   int uncheckedCount = 0;
   
   for(int i=0;i<elements.size();i++)
   {
	   if(elements.get(i).isSelected()==true)
		   checkedCount++;
	   else
		   uncheckedCount++;
   }
   
   System.out.println("Number of checked checkboxes are" +checkedCount);
   System.out.println("Number of unchecked checkboxes are" +uncheckedCount);
   //Thread.sleep(2000);

//For selecting state name
WebElement selectElement = driver.findElement(By.id("state_name"));
Select state_name = new Select(selectElement);
state_name.selectByVisibleText("Himachal Pradesh");
Thread.sleep(2000);

//For selecting district
WebElement selectElement1 = driver.findElement(By.id("dists"));
Select dists = new Select(selectElement1);
dists.selectByVisibleText("Kangra");
Thread.sleep(2000);

//For selecting city
WebElement selectElement2 = driver.findElement(By.name("tehsil"));
Select tehsil = new Select(selectElement2);
tehsil.selectByVisibleText("Kasba Kotla "); 
		
		
Thread.sleep(2000);

//For selecting car type
driver.findElement(By.xpath("//input[@value='Car Jeep SuV']")).click();
//Thread.sleep(2000);


//Selecting dropdown for experience field 
WebElement selectElement3 = driver.findElement(By.name("experience"));
Select experience = new Select(selectElement3);
experience.selectByVisibleText("4-5 Year");
//Thread.sleep(2000);


//Selecting dropdown for experience field 
WebElement selectElement4 = driver.findElement(By.name("qualification"));
Select qualification = new Select(selectElement4);
qualification.selectByVisibleText("Graduate");
//Thread.sleep(2000);

//For checkbox working time
driver.findElement(By.xpath("//input[@value='Full Time']")).click(); 
driver.findElement(By.xpath("//input[@value='Night Hours']")).click();
//Thread.sleep(2000);

//For checkbox for prefer area
driver.findElement(By.xpath("//input[@value='Maharashtra']")).click(); 
driver.findElement(By.xpath("//input[@value='Mumbai']")).click(); 
driver.findElement(By.xpath("//input[@value='Nashik']")).click(); 
driver.findElement(By.xpath("//input[@value='Shimla']")).click(); 
Thread.sleep(2000);


//Detail for full time job
WebElement selectElement5 = driver.findElement(By.id("salary_from"));
Select salary_from = new Select(selectElement5);
salary_from.selectByVisibleText("8000-10000");
//Thread.sleep(2000);

WebElement selectElement6 = driver.findElement(By.id("time_from"));
Select time_from = new Select(selectElement6);
time_from.selectByVisibleText("9 AM");



WebElement selectElement7 = driver.findElement(By.id("time_to"));
Select time_to = new Select(selectElement7);
time_to.selectByVisibleText("6 PM");
Thread.sleep(2000);

WebElement selectElement8 = driver.findElement(By.id("p_call_from"));
Select p_call_from = new Select(selectElement8);
p_call_from.selectByVisibleText("8 AM");
Thread.sleep(2000);

WebElement selectElement9 = driver.findElement(By.id("p_call_to"));
Select p_call_to = new Select(selectElement9);
p_call_to.selectByVisibleText("7 PM");
//Thread.sleep(2000);



//For giving address
driver.findElement(By.name("address")).sendKeys("Flat no-4, Sharda nagar, Kathegalli rd, Kukatpalli, Hyderabad");
Thread.sleep(2000);

WebElement radiobtn3 = driver.findElement(By.id("working"));
WebElement radiobtn4 = driver.findElement(By.id("working1"));
radiobtn4.click();
Thread.sleep(2000);



driver.findElement(By.name("submit")).click();
Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();//click on OK button
Thread.sleep(2000);





   /*WebElement option1 = driver.findElement(By.id("Hindi"));
    option1.click();		
    
    WebElement option2 = driver.findElement(By.id("English"));
    option2.click();		
    
    WebElement option3 = driver.findElement(By.id("Marathi"));
    option3.click();*/
    
  //  Thread.sleep(2000);
    
    
    
    

    //driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
    
   /*if (option1.isSelected()) {					
        System.out.println("Checkbox is Toggled On");					

    } 		
    
   else if (option2.isSelected()) {					
       System.out.println("Checkbox is Toggled On");					

   } 		
   
   else if (option3.isSelected()) {					
       System.out.println("Checkbox is Toggled On");					

   } else {			
       System.out.println("Checkbox is Toggled Off");					
   }	*/	
   
   
   /*if (option1.isSelected()) {					
       System.out.println("Checkbox is Toggled On");					

   } else {			
       System.out.println("Checkbox is Toggled Off");					
   }		
   
  if (option2.isSelected()) {					
      System.out.println("Checkbox is Toggled On");					

  } else {			
      System.out.println("Checkbox is Toggled Off");					
  }		
  
  if (option3.isSelected()) {					
      System.out.println("Checkbox is Toggled On");					

  } else {			
      System.out.println("Checkbox is Toggled Off");					
  }	*/
    
    
    
    /*List <WebElement> li= driver.findElements(By.xpath("//input[@type='checkbox']"));
    System.out.println(li.size());
            for(int i=0;i<=li.size()-1;i++)
            {
                li.get(i).click();
            }*/
    
   
    driver.close();
    
    
	}
}
