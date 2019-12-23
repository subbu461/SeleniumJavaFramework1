package Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.annotations.BeforeMethod;
import org.apache.commons.*;

import PageObjects.LoginPage; 
import utilities.CaptureLogs;   

public class CustomerModuleTest {
	
	
	private static final String RandomStringUtils = null;
	public static  WebDriver driver;
	public static String   custID;
	public static  String  baseURL ="http://demo.guru99.com/v4/";
	public static String username= "mngr237492";
	public static String password = "erezavy";
	

	@BeforeMethod
	
	
	public void openBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL); 
		 
		PropertyConfigurator.configure("log4j.properties");
		
		CaptureLogs.autoLogs("openBrowserTest").info("openBrowser Test ended");
			  
	}
	
	
	
	@Test  (enabled= true, priority= 1)
	
	public void loginTest()  throws InterruptedException {
		
		CaptureLogs.autoLogs("loginTest").info("LoginTest Started");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.custUserName(username);
		lp.custPassword(password);
		lp.loginbtn();
		Thread.sleep(3000L);
		
		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle);
		
		if(HomePageTitle.equals("Guru99 Bank Manager HomePage")) 
	
		{
			CaptureLogs.autoLogs("loginTest").info("LoginTest Passed");
			AssertJUnit.assertTrue(true);
		} else {
			
			CaptureLogs.autoLogs("loginTest").info("LoginTest Failed");
			AssertJUnit.fail();
			
		}
	}
		
	
	@Test(enabled= true, priority= 2)
	
	
	
		public  void   linksCountTest() throws InterruptedException {
			 
			
			Thread.sleep(3000L);
			
			LoginPage lp = new LoginPage(driver);
			
			lp.custUserName(username);
			lp.custPassword(password);  
			lp.loginbtn();  
			Thread.sleep(3000L);
			CaptureLogs.autoLogs("linkCountTest").info("linkTest-Counting The Links :");
			
			
			List <WebElement>links = driver.findElements(By.tagName("a"));
			
			System.out.print("No of Links in HomePage::" + links.size());
			 
			if (links.size()==14) {
				
				AssertJUnit.assertTrue(true);
				CaptureLogs.autoLogs("linkCountTest").info("linkCountTestPassed");
				Thread.sleep(1000);
			}
			
			else { 
				  
				AssertJUnit.fail();
				CaptureLogs.autoLogs("linkCountTest").info("linkCountTestFailed");
				
			}
			
		}		
	
	 
	
		
	
public void addNewCustomer()  throws   InterruptedException

{
			
			
			  
			
			
		


}
			 
public void editNewCustomer()  throws   InterruptedException   

{
			
			
			
			


}
			
public void   deleteNewCustomer()  throws InterruptedException

{
	
	
	   
	
	
}

	public  static String randomstring ()	

	{
		
		String generateString = RandomStringUtils.
		
				return   (generateString ) ;
		
		
		 
	}
	
	public void captureScreen(ITestResult result )  throws IOException{
		
		
		
		
		
	}

  void sendMail() 

  {
	  
	  
	  
	  
  }

	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


