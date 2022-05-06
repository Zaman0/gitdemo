package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	By signin = By.xpath("//span[contains(text(),'Login')]");
	
	
	public landingPage (WebDriver driver) {
		this.driver = driver;
	}
    public WebElement getLogin () {
		
    
		return driver.findElement(signin);
		
		
	}
}
