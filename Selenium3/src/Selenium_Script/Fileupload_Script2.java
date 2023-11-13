package Selenium_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fileupload_Script2 {

	
	
	
	@Test
	
	public void file1() throws InterruptedException, IOException
	{
	
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new 	FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		WebElement fileupload1= driver.findElement(By.xpath("//input[@id='imagesrc']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",fileupload1);
		
		Thread.sleep(4000);
		
	//  Runtime.getRuntime().exec("D:\\selenium\\autoit2\\fileupload.exe");
		
		Runtime.getRuntime().exec("D:\\selenium\\upload\\autoit2 - Copy.exe");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\selenium\\upload\\autoit2 - Copy.exe");
		
		Thread.sleep(2000);
	}
}
