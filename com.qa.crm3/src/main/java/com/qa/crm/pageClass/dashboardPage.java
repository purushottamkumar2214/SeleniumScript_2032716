package com.qa.crm.pageClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.testBase;

public class dashboardPage extends testBase {

	public dashboardPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='purushottam kumar']") WebElement userName;
	@FindBy (xpath = "//span[text()='Companies']") WebElement companyMenu;
	
	@FindBy(xpath = "//div[text()='Contacts activity stream']") WebElement dashBoardPageVerification;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/span") WebElement companyPageName;
	
	public String checkDashBoardVerification()
	{
		return dashBoardPageVerification.getText();
	}
	
	public String usernameCheck()
	{
		return userName.getText();
	}
	
	public String checkCompanyPageName()
	{
		return companyPageName.getText();
		
	}
	
	public companyPage menuHover() throws InterruptedException, IOException
	{
		
		Actions act= new Actions(driver);
		
		act.moveToElement(companyMenu).build().perform();
		
		Thread.sleep(2000);
		
		companyMenu.click();
		
		Thread.sleep(2000);
		
		return new companyPage();

	}
	
	public contactPage menuHoverGeneric(String pageName) throws InterruptedException, IOException
	{
		
		Actions act= new Actions(driver);
		
		String MenuName="//span[text()='"+pageName+"']";
		
		act.moveToElement(driver.findElement(By.xpath(MenuName))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(MenuName)).click();
		
		Thread.sleep(2000);
		
		return new contactPage();
	
		
	}
}
