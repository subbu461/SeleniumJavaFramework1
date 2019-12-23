package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	
	static WebDriver driver;
	
	
	@FindBy(how = How.LINK_TEXT ,  using="New Customer")
	WebElement lnkAddNewCustomer;
	
	@FindBy(how= How.NAME, using ="name")
	WebElement txtCustomerName;
	
	
	@FindBy(how=How.NAME, using ="rad1")
	WebElement rdGender;
	 
	
	@FindBy(how=How.ID_OR_NAME  , using ="dob")
	WebElement txtDOB;
	 
	
	@FindBy(how=How.NAME, using = "addr")
	WebElement txtaddress;
	
	
	@FindBy(how=How.NAME, using ="city")
	WebElement txtcity;
	
	@FindBy(how=How.NAME, using="state")
	WebElement txtstate;
	
	@FindBy(how=How.NAME, using ="pinno")
	WebElement txtPin;
	
	@FindBy(how=How.NAME, using ="telephoneno")
	WebElement txtMobilePhone;
	
	
	@FindBy(how=How.NAME, using ="emailid")
	WebElement txtmailID;
	
	
	
	@FindBy(how=How.NAME, using ="password")
	WebElement txtpassword;
	
	
	@FindBy(how=How.NAME , using ="sub")
	WebElement  btnSubmit;
	
	
	public AddCustomerPage (WebDriver  d)
	
	{
		//this.driver= driver;
		driver= d;
		PageFactory.initElements(d,this );
	}
	
	
	public void clickAddNewCustomer()
	
	{
		lnkAddNewCustomer.click();
		
	}
	
public   void  custName(String cname)
	
{
	txtCustomerName.sendKeys(cname);
}
	
	public void  custgender (String cgender)
	
	{
		
		rdGender.sendKeys(cgender);
	}
	
	public void custdob( String cdob)
	
	{
		txtDOB.sendKeys(cdob);
		
	}
	
	
	public void custaddress(String caddress)
	
	{
		
		 txtaddress.sendKeys(caddress);
	}
	
	
	public void custcity (String  ccity)
	
	{
		
		txtcity.sendKeys(ccity);
	}
	
	
	public void custstate(String cstate)
	
	
	{
		
		txtstate.sendKeys(cstate);
	}
	
	public    void custpinno(String cpincode)
	
	{
		txtPin.sendKeys( String.valueOf(cpincode));	
		
	}
	
	
	public void  custmobile(String  cmobile )
	
	{
		
		txtMobilePhone.sendKeys(cmobile);
		
	}
	
	public void  custemail (String cemail)
	
	 
	{
		
		txtmailID.sendKeys(cemail);
	}
	
	
	public void custpassword(String cpassword)
	
	{
	txtpassword.sendKeys(cpassword);
	
	
    }  
	
	public  void custsubmit ()
	{
		 
		btnSubmit.click();
		
		
	}
	
	
}
	

