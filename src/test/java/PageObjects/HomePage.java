package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
	
	public HomePage (WebDriver driver)
	
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"storeLogo\"]/a/img")
	WebElement title;
	@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]")
	WebElement myacc;
	@FindBy(xpath="//*[@id=\"tdb2\"]/span[2]")
	WebElement logout;
	
	@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"columnRight\"]/div[5]/div[2]/form/select")
	WebElement  currency;
	
	public void setverifyHome()
	{
		title.getText();
	}
	
	public void setMyaccount()
	{
		myacc.click();
	}
	
	public void setLogout()
	{
		logout.click();
	}
	
	public void setCart()
	{
		cart.click();
	}
	
	public void setCurrency()
	{
		Select a = new Select(currency);
		a.selectByIndex(1);
		
	}

}
