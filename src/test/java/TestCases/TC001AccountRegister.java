package TestCases;


import org.testng.annotations.Test;

import PageObjects.AccountPage;
import PageObjects.HomePage;
import PageObjects.LogOutPage;
import PageObjects.MyAccountPage;
import PageObjects.RegisterMyAccount;
import TestBase.BaseClass;

public class TC001AccountRegister extends BaseClass {

	@Test(groups="Sanity")
	public void AccountRegister() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.setMyaccount();
		Thread.sleep(2000);
		MyAccountPage ap = new MyAccountPage(driver);
		ap.setRegister();
		Thread.sleep(1000);
		
		
		RegisterMyAccount reg = new RegisterMyAccount(driver);
		reg.setGender();
		
		Thread.sleep(1000);
		reg.setFName("Andrew");
		reg.setLName("Davis");
		reg.setDOB("01/02/2003");
		
		String newemail = randomeAlphnum(6,4)+"@gmail.com";
		System.out.println(newemail);
		reg.setEmail(newemail);
		
		Thread.sleep(3000);
		reg.setCompany("Googles");
		reg.setAddress("1 Teapot stase");
		reg.setTown("lesberg");
		reg.setPcode("34345");
		reg.setCity("washermanpet");
		reg.setState("Delhi");
		reg.setCountry();
		reg.setPhone(randomeNumeric(10));
		reg.setFax(randomeNumeric(10));
		
		Thread.sleep(2000);
		String newpass = randomeAlphnum(4,5);
		System.out.println(newpass);
		reg.setPassword(newpass);
		reg.setConfPass(newpass);
		
		Thread.sleep(2000);
		
		reg.setRegister();
		
		AccountPage apg = new AccountPage(driver);
		apg.verifyTitle();
		apg.setAccInfo();
		apg.setLogout();
		
		LogOutPage lo = new LogOutPage(driver);
		lo.verifyLogoutPage();
		lo.setOutPage();
	}
	
}
