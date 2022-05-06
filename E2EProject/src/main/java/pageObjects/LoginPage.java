package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.id("user_email"); //("a[id = 'user_emai']");
	By pass = By.id("user_password");
	By login = By.xpath("//*[@id=\'hero\']/div/form/div[3]/input");
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
    
	public WebElement getemail () {
		
		return driver.findElement(email);
		
	}
	public WebElement getpass () {
		
		return driver.findElement(pass);
		
	}
	public WebElement getlogin () {
		
		return driver.findElement(login);
		
	}
}
