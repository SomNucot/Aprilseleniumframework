package nucot.com.april.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {
	
	public WebDriver odriver;
	
	//1.By locators:
	
	private	By userName=By.xpath("//input[@name='username']");
	private By passWord=By.xpath("//input[@name='password']");
	private By loginButton=By.xpath("//button[@type='submit']");
	
	
	//2.page constant
	public LoginPage2(WebDriver odriver){
		this.odriver=odriver;
	}
	
	
	//3.implemented Methods//Page actions
	
	
	public String getCurrentUrlLoginPage(){
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	
	public String getCurrentTitleLoginPage(){
		String title=odriver.getTitle();
		System.out.println(title);
		return title;
 	}
	
	
	public void doLoginPage(String username,String password) throws InterruptedException{
		Thread.sleep(3000);
		odriver.findElement(userName).sendKeys(username);
		Thread.sleep(3000);
		odriver.findElement(passWord).sendKeys(password);
		odriver.findElement(loginButton).click();
	}
	
	
	
	

}
