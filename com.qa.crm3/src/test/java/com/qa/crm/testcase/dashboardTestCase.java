package com.qa.crm.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.crm.base.testBase;
import com.qa.crm.pageClass.dashboardPage;
import com.qa.crm.pageClass.loginPage;
import com.qa.crm.pageClass.companyPage;

public class dashboardTestCase extends testBase {
	
	dashboardPage dashboard;
	loginPage login;
	companyPage companyPage;
	
	dashboardTestCase() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		login= new loginPage();
		dashboard= login.login(prop.getProperty("un"), prop.getProperty("pswd"));
		
		//dashboard= new dashboardPage();
		
	}
	
	@Test (priority=1)
	
	public void verifyUserName()
	{
	String actualUserName= dashboard.usernameCheck();
		
		Assert.assertEquals(actualUserName, "purushottam kumar");
		
	}
	@Test (priority=2)
	public void verifyHomePage()
	{
	String actualDashboardTitle=dashboard.checkDashBoardVerification();
	
	Assert.assertEquals(actualDashboardTitle, prop1.getProperty("expectedDashboardTitle"));
	}
	
	@Test (priority=3)
	public void verifyCompanyPageMove() throws InterruptedException, IOException
	{
		
		companyPage =dashboard.menuHover();
		
		String actualCompanyName= dashboard.checkCompanyPageName();
		
		Assert.assertEquals(actualCompanyName, prop1.getProperty("expectedCompanyName"));
		
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.quit();
	}
	

}
