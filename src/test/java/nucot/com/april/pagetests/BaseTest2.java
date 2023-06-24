package nucot.com.april.pagetests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import nucot.april.initialsetup.Driversetup;
import nucot.com.april.pages.LoginPage2;

public class BaseTest2 {
	
	Driversetup dsObj;
	public WebDriver odriver;
	protected LoginPage2 loginPageObj;
	
	@BeforeTest
	void setUp(){
		dsObj=new Driversetup();
		dsObj.initDriverSetUp("chrome");
		loginPageObj=new LoginPage2(odriver);	
	}

	
	
	
	@AfterTest
	void closeApp(){
	odriver.close();
	}
}