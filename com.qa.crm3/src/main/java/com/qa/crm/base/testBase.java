package com.qa.crm.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.crm.Util.dataDriven;

public class testBase extends dataDriven{
	
	public static Properties prop;
	public static Properties prop1;
	public static WebDriver driver;
	
	/*Initialize the property class and driver
	 * 
	 *
	 */

	public testBase() throws IOException
	{
		 prop= new Properties();
		
		FileInputStream fs= new FileInputStream("D:\\Return laptop\\Desktop\\1\\eclipse-workspace1\\com.qa.crm\\Properties\\config.properties");
		
		prop.load(fs);
		
		prop1= new Properties();
		
		FileInputStream fs1= new FileInputStream("D:\\Return laptop\\Desktop\\1\\eclipse-workspace1\\com.qa.crm3\\Properties\\expectedResult.properties");
		
		prop1.load(fs1);
		
	}
	
	public static void initialization()
	{
		//System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(prop.getProperty("URL"));
	
		
	}
}
