package TestCases;

import org.testng.annotations.Test;

import PageObjects.AccInfoPage;
import PageObjects.AccountPage;
import PageObjects.HomePage;
import PageObjects.LogOutPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC002MyAccout extends BaseClass {
	
	@Test(groups="Master")
	public void MyAccountInfo() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.setCurrency();
		hp.setMyaccount();
		
		Thread.sleep(2000);
		MyAccountPage ap = new MyAccountPage(driver);
		ap.setUser(p.getProperty("email"));      
		ap.setPassword(p.getProperty("password"));               
		ap.setLogIn();
		
		Thread.sleep(2000);
		AccInfoPage apg = new AccInfoPage(driver);
		apg.verifyAccdetails();
		apg.getMyaccDetail();
		apg.setDone();
		
		AccountPage accpage = new AccountPage(driver);
		accpage.verifyTitle();
		accpage.setAccInfo();
		accpage.setLogout();
		
		Thread.sleep(3000);
		LogOutPage lo = new LogOutPage(driver);
		lo.verifyLogoutPage();
		lo.setOutPage();
		
		
	}

}
