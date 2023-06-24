package nucot.com.april.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTitleTest(){
		String actualTitleOfPage=ologinPage.getLoginPageTitle();
		Assert.assertEquals(actualTitleOfPage,"OrangeHRM");
		
	}
	
	@Test(priority=2)
	public void getUrl()
	{
		String actualUrl= ologinPage.getCurrentUrlLoginPage();
		Assert.assertEquals(actualUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	
	
	@Test(priority=3)
	public void loginTest()
	{
		
		ologinPage.doLoginPage("Admin","admin123");
			
	}

	
	
	
	

}
