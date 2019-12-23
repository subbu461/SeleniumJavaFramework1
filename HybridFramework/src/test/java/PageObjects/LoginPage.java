package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	// Login Screen Page Objects 
	 
 WebDriver driver;
	
	
	@FindBy (how= How.NAME , using ="uid")
     WebElement txtUserName;
	
	
	@FindBy(how= How.NAME, using ="password")
	WebElement txtPassword;
	
	
	@FindBy (how=How.NAME, using ="btnLogin")
	WebElement btnLogin;
	
	
	// Constructor to instantiate 
	public  LoginPage  (WebDriver driver)
	
	{
		this.driver = driver;
		
		
		PageFactory.initElements(driver, this);                             // addition Method
		
		
	}
	
	
	
	public  void custUserName(String uname)
	
	{
		txtUserName.sendKeys(uname);
		
		
	}
public  void custPassword(String pwd)
	
	{
		
	txtPassword.sendKeys(pwd);
		
	}


public void loginbtn()

 
{
	
	btnLogin.click();
}




	

}
