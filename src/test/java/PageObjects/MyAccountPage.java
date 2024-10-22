package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")
	WebElement register;
	
	@FindBy(xpath="//*[@id=\"bodyContent\"]/div[2]/div/form/table/tbody/tr[1]/td[2]/input")
	WebElement user;
	
	@FindBy(xpath="//*[@id=\"bodyContent\"]/div[2]/div/form/table/tbody/tr[2]/td[2]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"tdb5\"]/span[2]")
	WebElement newlogin;
	
	public void setRegister()
	{
		register.click();
	}
	
	public void setUser(String fname)
	{
		user.sendKeys(fname);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void setLogIn() {
		newlogin.click();
	}
}
