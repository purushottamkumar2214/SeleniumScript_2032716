package Selenium_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot_Script {
	
	WebDriver driver;
	@BeforeTest

	public void OpenBrowser()
	{
	//System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
	// driver= new FirefoxDriver();
		
	// System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver 114.0\\chromedriver.exe");
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\purus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	 
	 driver= new ChromeDriver();
	 
	 driver.get("https://login.yahoo.com/account/create");
	}

	
	@Test
	
	public void Verifyvalidationmessage() throws InterruptedException 
	{
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("purushottam");
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("kummar");
		
		driver.findElement(By.id("reg-submit-button")).click();
		
		Thread.sleep(4000);
		
	    String ActualResult= driver.findElement(By.id("reg-error-userId")).getText();
		
		Assert.assertEquals(ActualResult, "This is required");
	}
	
	
	@AfterMethod
	public void OnTestFailTakeScreenshot(ITestResult res) throws IOException
	{
		if (ITestResult.FAILURE==res.getStatus())
		{
			
			ScreenShot_Lib.takeScreenshots(driver, res.getName());
		}
	}
	
	
	
	

}
