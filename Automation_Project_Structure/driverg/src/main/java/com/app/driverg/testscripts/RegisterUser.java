package com.app.driverg.testscripts;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.driverg.constants.PjojectPathConstants;
import com.app.driverg.testsuite.SampleSuiteBase;
import com.app.driverg.utils.PropertiesUtil;

public class RegisterUser extends SampleSuiteBase {

	WebDriver driver;
	static Properties configProps = PropertiesUtil.loadProperty(PjojectPathConstants.config);
	static Properties registeruserProps = PropertiesUtil.loadProperty(PjojectPathConstants.registeruser);
	
	@BeforeTest
	public void preSetup()
	{
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		
	}
	
	
	
	@Test
	public void testRegister() throws InterruptedException 
	{
		
		String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	   //String email=registeruserProps.getProperty("language__hindi_checkbox");
	    //String email_data = "9874563214";
	    
	    //driver.findElement(By.id(email)).sendKeys(email_data);
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
	   Thread.sleep(2000);
	   // radio1.click();			
	    //System.out.println("Radio Button Option 1 Selected");					
	    		
	    //Radio Button1 is de-selected and Radio Button2 is selected		
	    radio2.click();			
	    System.out.println("Radio Button Option 2 Selected");	
	    Thread.sleep(2000);

	   
	    WebElement radiobtn1 = driver.findElement(By.id("marital"));
	    WebElement radiobtn2 = driver.findElement(By.id("marital1"));
	    
	    radiobtn2.click();
	    System.out.println("Radio button option  2 is selected");
	    //Thread.sleep(2000);*/

	    
	   //For selecting checkboxes 
	    //String language__hindi_checkbox= registeruserProps.getProperty("language__hindi_checkbox");
	   driver.findElement(By.xpath("//input[@value='Hindi']")).click(); 	
	   driver.findElement(By.xpath("//input[@value='English']")).click(); 
	   driver.findElement(By.xpath("//input[@value='Marathi']")).click();
	   Thread.sleep(2000);
	   
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



	/*driver.findElement(By.name("submit")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();//click on OK button
	Thread.sleep(2000);*/

	driver.close();
    
		
	}
}
