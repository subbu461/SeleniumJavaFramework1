package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

	
	WebDriver driver;
	
	
	@FindBy(how=How.LINK_TEXT, using ="Edit Customer")
	WebElement lnkEditCustomer;
	
	
	@FindBy(how=How.NAME, using = "cusid")
	WebElement custid;
	
	
	@FindBy(how=How.NAME  , using ="AccSubmit")
	WebElement btnaccsubmit;
	
	
	@FindBy(how=How.NAME, using ="res")
	WebElement btnreset;
	 
	
	@FindBy(how=How.NAME , using ="addr")
	WebElement custaddress;
	
	@FindBy(how=How.NAME, using="city")
	WebElement custcity;
	 
	@FindBy(how=How.NAME, using ="state")
	WebElement custstate;
	
	@FindBy(how=How.NAME, using ="pinno")
	WebElement custpin;  
	
	
	@FindBy(how=How.NAME, using ="telephoneno")
	WebElement custtel; 
	
	
	@FindBy(how=How.NAME, using ="emailid")
	WebElement  custemail;
	
	
	@FindBy(how=How.NAME, using ="sub")
	WebElement btnsubmit;
	
	
	public EditCustomerPage (WebDriver d )
	{
		//this.driver= driver;
		driver =d ;
		PageFactory.initElements(d,this);           // another Method 
	}
	
	public void clickEditCustomer ()
	
	{
		lnkEditCustomer.click();
		
	}
	
	public void setCustID(String cid)
	
	{
		
		custid.sendKeys(cid);
		
	}
	
	public void clickaccSubmit()
	
	{
		
		btnaccsubmit.click();
	}
	
	public void clickaccReset()
	{
		btnreset.click();	
		
	}
	
	public void custaddress(String    caddress)
	
	{
		custaddress.clear();
		custaddress(caddress);
	}
	
	public void custcity(String ccity)
	{
		custcity.clear();
		custcity.sendKeys(ccity);
		
	}
	
	public void custstate(String cstate)
	{
		custstate.clear();
		custstate.sendKeys(cstate);
	}
	
	public void custpinno(String cpincode)
	
	{
		custpin.clear();
		custpin.sendKeys(cpincode);
		
	} 
	
	public void custtelephoneno(String cteleno)
	
	{ 
		custtel.clear();
		custtel.sendKeys(cteleno);
		
	}
	
	public void custemail(String cemail)
	{
		custemail.clear();
		custemail.sendKeys(cemail);
		
	}
	
	public void  clkSubmitBtn()
	
{
		btnsubmit.click();
		
	
}
	

}
