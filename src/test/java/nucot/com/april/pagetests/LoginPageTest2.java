package nucot.com.april.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest2  extends BaseTest2{
	
	
	
	@Test
	public void getCurrentUrlLoginPageTest(){
		String actualUrl=loginPageObj.getCurrentUrlLoginPage();
		Assert.assertEquals(actualUrl, "");
		
	}
	
	
	@Test
	public void getCurrentTitleLoginPageTest(){
		String actualTitle=loginPageObj.getCurrentTitleLoginPage();
		//Assert.assertEquals(actualTitle, "");
	}
	
	
	@Test
	public void doLoginPageTest() throws InterruptedException{
		loginPageObj.doLoginPage("Admin","admin123");
	}
	
	
	
	
	

}
