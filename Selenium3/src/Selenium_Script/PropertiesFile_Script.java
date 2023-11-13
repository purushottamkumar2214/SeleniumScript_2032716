package Selenium_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertiesFile_Script {
	
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser()
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.get("https://login.yahoo.com/account/create");
	}
	@Test
	public void Verifyvalidationmessage() throws InterruptedException, IOException 
	{
		Properties prop= new Properties();
		
		FileInputStream fs= new FileInputStream("D:\\Return laptop\\Desktop\\1\\eclipse-workspace1\\Selenium3\\Yohoo.properties");
		
		prop.load(fs);
		
		driver.findElement(By.id(prop.getProperty("firstname"))).sendKeys("purushottam");
		
		driver.findElement(By.id(prop.getProperty("lastname"))).sendKeys("kummar");
		
		driver.findElement(By.id(prop.getProperty("submit"))).click();
		
		Thread.sleep(4000);
		
	    String ActualResult= driver.findElement(By.id(prop.getProperty("validationmessage"))).getText();
		
		Assert.assertEquals(ActualResult, "This is required.");
	}

}
