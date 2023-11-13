package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Soft_Script {
	
	@Test
	
	public void verifyTitle()
	{
		SoftAssert soft= new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver 114.0\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");
		
		String Title= driver.findElement(By.xpath("//h2[contains(text(),'Create')]")).getText();
		
		System.out.println(Title);
		
		soft.assertEquals(Title, "create a Yahoo account");
		
		boolean buttonstatus=driver.findElement(By.xpath("//button[@name='signup']")).isDisplayed();
		
		System.out.println(buttonstatus);
		
		soft.assertEquals(buttonstatus, true);
		
		System.out.println("text case executed completely");
		
		soft.assertAll();
	}

}
