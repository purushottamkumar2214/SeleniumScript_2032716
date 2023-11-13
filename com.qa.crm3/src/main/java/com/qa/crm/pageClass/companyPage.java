package com.qa.crm.pageClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.testBase;

public class companyPage extends testBase {

	public companyPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[text()='Create']") 
	@CacheLookup
	WebElement createButton;
	
	
	@FindBy(xpath = "(//input[@name='name'])[1]") WebElement companyName;
	
	@FindBy (xpath = "(//input[@name='url'])[1]") WebElement website;
	
	@FindBy (xpath = "//button[text()='Save']") WebElement create;
	
	@FindBy (xpath="(//tr/td[2])[1]") WebElement createdCompany;
	
	@FindBy(xpath = "(//span[text()='Companies'])[2]") WebElement companyPageTitle;
	
	@FindBy(xpath = "//div[text()='Name']//following::div/p") WebElement companyLable;
	
	public String checkPageName()
	{
		String actualPageName= companyPageTitle.getText();
		return actualPageName;
		
	}
	
	public void clickCreateButton()
	{
		createButton.click();
		
	}
	
	public void createNewCompany(String name, String url) throws InterruptedException, IOException
	{
		companyName.sendKeys(name);
		website.sendKeys(url);
		create.click();
		Thread.sleep(2000);
		//dashboardPage dashboardpag= new dashboardPage();
		//dashboardpag.menuHover();
		
		//String actualCreatedCompany=	createdCompany.getText();
		
		//createButton.click();
		
	//	return actualCreatedCompany;

	}
	public String verifyCreatedCompanyLable() throws InterruptedException
	{
		Thread.sleep(2000);
		String actualCompanyLable= companyLable.getText();
		return actualCompanyLable;
	}
	


}
