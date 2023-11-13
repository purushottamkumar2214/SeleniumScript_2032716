package com.qa.crm.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport {
	
	ExtentReports extent= new ExtentReports();
	
	ExtentSparkReporter spark=new ExtentSparkReporter("D:\\Return laptop\\Desktop\\1\\eclipse-workspace1\\com.qa.crm3\\spark.html");
	
	WebDriver driver;
	ExtentTest test;
	
	
	@BeforeTest
	public void browser()
	{
		spark.config().setTheme(Theme.DARK);
		
		spark.config().setDocumentTitle("My report is the report page title");
		
		extent.attachReporter(spark);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\purus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.google.com");

	}
	
	@Test
	
	public void checktitle()
	{
		test= extent.createTest("check title test cases").assignAuthor("purushottam").assignCategory("sanity").assignDevice("chrome");
	try
	{
		test.info("capturing the page title");
		
		String actualTitle= driver.getTitle();
		
		test.info("captured actual page title : "+actualTitle );
		
		if (actualTitle.equals("google1"))
		{
			test.pass("page title is verified and this is the title : "+ actualTitle);
			
		}
		
		
	}
	catch (Exception e) {
		test.info(e.getMessage());
		test.fail("the page title is not verified ");
		//test.fail("the page title is not verified due to error occured");
	}
		
		
	}
	
	@Test
	public void checkImage() 
	{

		test= extent.createTest("check the google logo").assignAuthor("purushottam").assignCategory("sanity").assignDevice("chrome");

		test.info("checking the google logo status");
		try
		{
		boolean logoStatus=driver.findElement(By.xpath("//img[@alt='Google1']")).isDisplayed();
		
		test.info("logo status is "+ logoStatus);
		if (logoStatus==true)
		{
		
		test.pass("logo is present on the page and the status of logo is : "+ logoStatus);
		}
		}
		catch (Exception e) {
			test.info(e.getMessage());
			test.fail("logo is not present");
			try {
				test.addScreenCaptureFromPath(takeScreenshots(driver));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
	

	@Test
	public void checkUsernameFieldValidation()
	{
		test= extent.createTest("check the username field validation message").assignAuthor("purushottam").assignCategory("sanity").assignDevice("chrome");
		String actualUserNameValidationMessage = null;
		try
		{
		test.info("navigating to gmail login page");
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		test.info("landed on gmail login page");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		test.info("next button clicked");
		
		actualUserNameValidationMessage= driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
	
		test.info("verifying the username field validation message");
	
		if (actualUserNameValidationMessage.equals("Enter an emailor phone number"))
		{
			test.pass("the validation message is correct :"+ actualUserNameValidationMessage);
		}
		else
		{
			test.fail("the validation message is not correct "+ actualUserNameValidationMessage);
			
			try {
				test.addScreenCaptureFromPath(takeScreenshots(driver));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
		
		catch (Exception e) {
			test.info(e.getMessage());
			test.fail("the validation message is not done");
			try {
				test.addScreenCaptureFromPath(takeScreenshots(driver));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		{
			
		}
		
	}


	@AfterTest
	public void tearDown()
	{
		extent.flush();
		//driver.close();
	}
	
	public String takeScreenshots(WebDriver driver) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source,  new File("D:\\Return laptop\\Desktop\\1\\eclipse-workspace1\\com.qa.crm3\\screenshot\\"+System.currentTimeMillis()+".png"));
		
		File destinationFile= new File("D:\\Return laptop\\Desktop\\1\\eclipse-workspace1\\com.qa.crm3\\screenshot\\"+System.currentTimeMillis()+".png");
		
		String absoultePath= destinationFile.getAbsolutePath();
		
		System.out.println(absoultePath);
		FileUtils.copyFile(source, destinationFile);
		return absoultePath;
		
	}
}
