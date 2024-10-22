package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
	public AccountPage (WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"tdb4\"]/span")
	WebElement logout;
	@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]")
	WebElement accinfo;
	@FindBy(xpath="//*[@id=\"bodyContent\"]/h1")
	WebElement title1;
	@FindBy(xpath="//*[@id=\"tdb2\"]/span[2]")
	WebElement checkout;
	
	public void setMyCart()
	{
		cart.click();
	}
	public void setLogout()
	{
		logout.click();
	}
	public void setAccInfo() {
		accinfo.click();
	}
	public String verifyTitle() {
		
		try
		{
			return(title1.getText());
		}
		catch(Exception e)
		{
			return("Not signed IN");
		}
	}
	public void setCheckOut() {
		checkout.click();
	}
}
