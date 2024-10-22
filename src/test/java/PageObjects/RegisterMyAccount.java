package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterMyAccount extends BasePage {

	public RegisterMyAccount(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//input[@value='m'])[1]")
	WebElement gender;
	@FindBy(xpath="//input[@name='firstname']")
	WebElement fname;
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lname;
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	@FindBy(xpath="//input[@name='email_address']")
	WebElement email;
	@FindBy(xpath="//input[@name='company']")
	WebElement company;
	@FindBy(xpath="//input[@name='street_address']")
	WebElement adres;
	@FindBy(xpath="//input[@name='suburb']")
	WebElement town;
	@FindBy(xpath="//input[@name='postcode']")
	WebElement postcode;
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
	@FindBy(xpath="//input[@name='telephone']")
	WebElement phone;
	@FindBy(xpath="//input[@name='fax']")
	WebElement fax;
	@FindBy(xpath="//input[@name='newsletter']")
	WebElement news;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@name='confirmation']")
	WebElement repassword;
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement regacc;
	
	public void setGender() {
		gender.click();
	}
public void setFName(String namef) {
		fname.sendKeys(namef);
	}
public void setLName(String namel) {
	lname.sendKeys(namel);
}
public void setDOB(String mydob) {
	dob.sendKeys(mydob);
}
public void setEmail(String myemail) {
	email.sendKeys(myemail);
}
public void setCompany(String mycompany) {
	company.sendKeys(mycompany);
}
public void setAddress(String myadres) {
	adres.sendKeys(myadres);
}
public void setTown(String mytown) {
	town.sendKeys(mytown);
}
public void setPcode(String mypcode) {
	postcode.sendKeys(mypcode);
}
public void setCity(String mycity) {
	city.sendKeys(mycity);
}
public void setState(String mystate) {
	state.sendKeys(mystate);
}
public void setCountry() {
	Select mycountry = new Select(country);
	mycountry.selectByIndex(1);;
}
public void setPhone(String myphone) {
	phone.sendKeys(myphone);
}
public void setFax(String myfax) {
	fax.sendKeys(myfax);
}
public void setNews() {
	news.click();
}
public void setPassword(String mypass) {
	password.sendKeys(mypass);
}
public void setConfPass(String myconfpass) {
	repassword.sendKeys(myconfpass);
}
public void setRegister() {
	regacc.click();
}

}
