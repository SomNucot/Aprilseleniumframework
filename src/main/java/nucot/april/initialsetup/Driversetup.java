package nucot.april.initialsetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driversetup {
	
	public WebDriver odriver;
	
	/**
	 * 
	 * Launch Browser
	 * @param browserName
	 */
	public WebDriver initDriverSetUp(String browserName)
	{
		
		System.out.println("Browser name is : "+browserName);
		
		if(browserName.equals("chrome")){
			
			WebDriverManager.chromedriver().setup();
			 odriver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			odriver=new FirefoxDriver();
		}
		else if(browserName.equals("edge")){
			odriver=new EdgeDriver();
		}
		else if(browserName.equals("safari")){
			odriver=new SafariDriver();
		}
		else{
			System.out.println("Please pass vaild browser name");
		}
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return odriver;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
