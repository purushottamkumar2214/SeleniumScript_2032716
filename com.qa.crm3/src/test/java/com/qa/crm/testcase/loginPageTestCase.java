package com.qa.crm.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.testBase;
import com.qa.crm.pageClass.dashboardPage;
import com.qa.crm.pageClass.loginPage;

public class loginPageTestCase extends testBase {
	loginPage login;
	dashboardPage dashboardPage;
	public loginPageTestCase() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		login= new loginPage();
	}
	
	@Test (priority=1)
	public void verifyPageTitle()
	{
		
		String actualTitle=	login.getPageTitle();
		
		Assert.assertEquals(actualTitle, "Cogmento CRM");
	}
	
	@Test (priority=2)
	public void verifyLogin() throws IOException
	{
		dashboardPage= login.login(prop.getProperty("un"), prop.getProperty("pswd"));
		
		System.out.println(dashboardPage);
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
