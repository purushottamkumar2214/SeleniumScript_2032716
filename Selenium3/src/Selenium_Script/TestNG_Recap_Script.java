package Selenium_Script;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Recap_Script {
	
	
	@BeforeSuite
	
	public void BeforeSuite_Method()
	{
		
		System.out.println("this is before suite method executed");
		
	}
	
	@BeforeTest
	
	public void BeforeTest_Method()
	{
		System.out.println("This is Before test method executed");
	}
	
	@org.testng.annotations.BeforeClass
	
	public void BeforeClass()
	{
		System.out.println("Open Browser");
	}
	
	@BeforeMethod
	public void Login()
	{
		
		System.out.println("Login user");
		
	}
	
	
	@Test (priority = 1, enabled = false)
	public void SentMail()
	{
		
		System.out.println("SentMail executed");
		
	}
	
	@Test (priority=2)
	public void NewMail()
	{
		
		System.out.println("NewMail executed");	
	}
	
	
	@AfterMethod
	public void Logout()
	{
		
		System.out.println("Logout user");
	}
	
	@AfterClass
	
	public void CloseBrowser()
	{
		System.out.println("Browser closed");
	}
	
	@AfterTest
	
	public void AfterTest_Method()
	{
		
		System.out.println("this is after test method");
	}
	
	@AfterSuite
	public void AfterSuite_Method()
	{
		System.out.println("this is after suite method executed");
	}

}
