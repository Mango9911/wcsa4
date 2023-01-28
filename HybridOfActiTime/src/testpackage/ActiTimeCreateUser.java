package testpackage;

import java.io.IOException;

import org.openxmlformats.schemas.presentationml.x2006.main.SldDocument;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class ActiTimeCreateUser extends BaseTest{
	
	@Test
	public void createValidUser() throws InterruptedException, IOException
	{
		LoginPage ip = new LoginPage(driver);
		Flib flib = new Flib();
		ip.actiTimeValidLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH, "password"));
		
		Thread.sleep(3000);
		
		HomePage hp = new HomePage(driver);
		
		
		Thread.sleep(2000);
		UserPage userpage = new UserPage(driver);
		userpage.clickOnTab();
		
	}

}
