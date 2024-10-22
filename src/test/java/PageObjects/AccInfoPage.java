package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccInfoPage extends BasePage {
	public AccInfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"bodyContent\"]/h1")
	WebElement title4;
	
	@FindBy(xpath="//*[@id=\"bodyContent\"]/div/div[1]/ul/li[1]/a")
	WebElement accdetail;
	
	@FindBy(xpath="//*[@id=\"tdb5\"]/span[2]")
	WebElement done;
	
	public String verifyAccdetails() {
		
	try
	{
		return (title4.getText());
	}
	catch(Exception e)
	{
		return("Title not seen");
	}
	}
	
	public void getMyaccDetail() {
		accdetail.click();
	}
	
	public void setDone() {
		done.click();
	}

}
