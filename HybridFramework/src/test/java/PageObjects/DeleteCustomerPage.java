package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {

	static WebDriver driver;
	
	
	
	
	@FindBy(how = How.LINK_TEXT, using ="Delete Customer")
	WebElement lnkDeleteCustomer;
	
	
	@FindBy(how=How.NAME , using="cusid")
	WebElement custid;
	
	@FindBy(how=How.NAME, using ="AccSubmit")
	WebElement btnSubmit;
	
	public DeleteCustomerPage(WebDriver d )
	
	{
		// this.driver= driver
		    
		driver=d;  
		
		PageFactory.initElements(d, this);
	}
	
	public  void clickDeleteCust()
	
	{
	lnkDeleteCustomer.click();  
	}
	
	public void  custid (String cid)
	
	{
		custid.sendKeys(cid);
		
	}
	
	public void clickSubmit()
	
	{
		
		btnSubmit.click();	
	}

}
