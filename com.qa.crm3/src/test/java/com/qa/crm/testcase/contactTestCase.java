package com.qa.crm.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.testBase;
import com.qa.crm.pageClass.contactPage;
import com.qa.crm.pageClass.dashboardPage;
import com.qa.crm.pageClass.loginPage;

public class contactTestCase extends testBase {
	
	loginPage login;
	dashboardPage dashboard;
	contactPage contact;
	
	contactTestCase() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		
		login= new loginPage();
		
		dashboard=login.login(prop.getProperty("un"), prop.getProperty("pswd"));
		
		contact=dashboard.menuHoverGeneric("Contacts");
		
	}
	@Test (priority=1)
	public void verifyContactPageName()
	{
		String actualPageName= contact.pageName();
		Assert.assertEquals(actualPageName, "Contacts");
	}
	
	@Test (priority=2)
	public void verifyCreateContact() throws InterruptedException
	{
		contact.createContact("firstname", "lastname");
		
		Thread.sleep(2000);
		
		String actualName= contact.contactNameCheck();
		
		Assert.assertEquals(actualName, "firstname lastname");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
