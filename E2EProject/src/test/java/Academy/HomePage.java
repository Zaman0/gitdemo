package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.landingPage;
import resources.Base;

public class HomePage extends Base {
	
	@Test (dataProvider = "getData")
	public void basePageNavigation (String Username, String Password, String text) throws IOException {
		
		driver = intitializeDriver ();
		driver.get("http://qaclickacademy.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']"));
		ele.click();
		//driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		landingPage l = new landingPage (driver); //1. Inheritance; 2. Create object of the class and invoke method
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getpass().sendKeys(Password);
		System.out.println(text);
		//lp.getlogin().click();
		
		}
		@DataProvider
		public Object [][] getData () {
			//Row stands for how many data type test should run
			//Column stands for how many values per each test
			Object [][] data = new Object [2][3];
			//0th Row
			data[0][0] = "nonrestricteduser@qw.com";
			data[0][1] = "123333";
			data[0][2] = "Non Restricted User";
			//1st Column
			data[1][0] = "restricteduser@qw.com";
			data[1][1] = "123573";
			data[1][2] = "Restricted User"; 
			return data;
		}
}
