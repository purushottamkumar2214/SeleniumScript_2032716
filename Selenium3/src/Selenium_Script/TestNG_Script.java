package Selenium_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Script {
	
	public WebDriver driver;
	
	@BeforeClass
	public void Openbrowser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		
		driver.navigate().to("https://login.yahoo.com/?.intl=in");	
	}
	
	@BeforeMethod
	public void Method_BeforeMethod()
	{
		System.out.println("This is before method");
	}
	@Test
	public void GetTitle()
	{
		System.out.println(driver.getTitle());
		
	}
	
	@AfterMethod
	public void Method1_AfterMethod()
	{
		
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		
		driver.close();
	}

}
