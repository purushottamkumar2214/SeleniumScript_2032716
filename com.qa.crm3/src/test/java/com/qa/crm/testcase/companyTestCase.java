package com.qa.crm.testcase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.crm.base.testBase;
import com.qa.crm.pageClass.companyPage;
import com.qa.crm.pageClass.dashboardPage;
import com.qa.crm.pageClass.loginPage;

public class companyTestCase extends testBase {
	
	public companyPage companyPage;
	public dashboardPage dashboard;
	public loginPage login;
	
	
	public companyTestCase() throws IOException{
		
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		login= new loginPage();
		dashboard= login.login(prop.getProperty("un"), prop.getProperty("pswd"));
		companyPage=dashboard.menuHover();
		//companyPage= new companyPage();
	}
	
	@Test (priority=1)
	public void checkPageName()
	{
	String PageName= companyPage.checkPageName();
	
	Assert.assertEquals(PageName, "Companies");
	
	System.out.println(PageName);
	}
	
	@Test (priority=2)
	public void verifyClickCreateButton()
	{
		companyPage.clickCreateButton();
	}
	
	@Test ( dataProvider = "testdata", priority=3)
	public void verifyCreateNewCompany(String name, String url) throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		companyPage.clickCreateButton();
		
		companyPage.createNewCompany(name, url);
		System.out.println("created");
		String actualName= companyPage.verifyCreatedCompanyLable();
		System.out.println("username verified");
		
		Assert.assertEquals(actualName, name);
		
	}
	
	@DataProvider(name = "testdata")	
	public Object[][] testdata() {
	Object[][] arrayObject = getExcelData("D:\\Return laptop\\Desktop\\1\\eclipse-workspace1\\com.qa.crm3\\testData\\company.xls","Sheet1");
	return arrayObject;
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
}
