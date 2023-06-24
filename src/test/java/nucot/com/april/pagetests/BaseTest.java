package nucot.com.april.pagetests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import nucot.april.initialsetup.Driversetup;
import nucot.com.april.pages.LoginPage;

public class BaseTest {
	
	 Driversetup dsObj;
	 WebDriver odriver;
	public LoginPage ologinPage;
	
	@BeforeTest
	void setUp(){
		dsObj=new Driversetup();
		odriver=dsObj.initDriverSetUp("chrome");
		ologinPage=new LoginPage(odriver);	
	}

	
	
	@AfterTest
	void closeApp(){
		odriver.quit();
	}
	
}