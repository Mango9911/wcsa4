package testpackage;



import java.sql.Driver;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeTestValidLogin extends BaseTest{

	
	@Test
	public void validTest ()
	{
	   Flib flib = new Flib();
	   LoginPage ip = new LoginPage(driver);
	   
	}
	
	
}
