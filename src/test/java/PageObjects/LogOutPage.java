package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage {
	
	public LogOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath=("//*[@id=\"bodyContent\"]/h1"))
	WebElement title6;
	
	@FindBy(xpath=("//*[@id=\"tdb4\"]/span[2]"))
	WebElement out;
	
	
	public String verifyLogoutPage()
	{
		try
		{
			return (title6.getText());
			
		}
		catch(Exception e)
		{
			return ("Not LogOut page");
		}
	}
	
	public void setOutPage()
	{
		out.click();
	}
}
