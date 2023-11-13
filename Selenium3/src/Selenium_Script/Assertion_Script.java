package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Script {
	
	@Test
	
	public void verifyTitle()
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/account/create");
		
		String Title= driver.findElement(By.xpath("//h2[contains(text(),'Create')]")).getText();
		
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Create a Yahoo account");
		
		boolean buttonstatus=driver.findElement(By.xpath("//button[@name='signup']")).isDisplayed();
		
		System.out.println(buttonstatus);
		
		Assert.assertEquals(buttonstatus, true);
		
		System.out.println("text case executed completely");
	}

}
