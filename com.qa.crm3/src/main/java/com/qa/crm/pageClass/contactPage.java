package com.qa.crm.pageClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.testBase;

public class contactPage extends testBase {
	
	public contactPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//span[text()='Contacts'])[2]") WebElement contactPageName;
	
	@FindBy(xpath = "//button[text()='Create']") WebElement createButton;
	
	@FindBy(xpath = "//input[@name='first_name']") WebElement firstName;
	
	@FindBy (xpath = "//input[@name='last_name']") WebElement lastName;
	@FindBy (xpath = "//button[text()='Save']") WebElement save;
	
	@FindBy (xpath = "//span[@class='selectable ']") WebElement name;
	
	public String pageName()
	{
		return contactPageName.getText();
	}
	
	public String contactNameCheck()
	{
		String contactName=	name.getText();
		return contactName;
	}
	
	public void createContact(String first, String last)
	{
		createButton.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		save.click();
		
	}
	
	
	
	

}
