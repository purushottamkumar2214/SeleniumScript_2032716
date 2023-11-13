package com.qa.crm.pageClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.testBase;

public class loginPage extends testBase{

	public loginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@name='email']") WebElement email;
	
	@FindBy (xpath = "//input[@name='password']") WebElement password;
	
	@FindBy (xpath = "//div[text()='Login']") WebElement login;
	
	public String getPageTitle()
	{
		return driver.getTitle();
	
	}
	
	public dashboardPage login(String un, String pswd) throws IOException
	{
		email.sendKeys(un);
		password.sendKeys(pswd);
		login.click();
		return new dashboardPage();
		
	}

}
