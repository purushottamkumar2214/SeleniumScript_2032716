package Selenium_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Fileupload_Scriptguru {

	
	
	
	@Test
	
	public void file1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\purus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.get("https://demo.guru99.com/test/autoit.html");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='JotFormIFrame-72320244964454']")));
		
	//	driver.findElement(By.xpath("//input[@id='input_5' and @type='file']")).click();
		
		WebElement upload1= driver.findElement(By.xpath("//ul[@class='form-section page-section']//li[@id='id_8']/div/input"));
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].click();",upload1);
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//ul[@class='form-section page-section']//li[@id='id_8']/div/input"))).click().perform();
		
		//Thread.sleep(4000);
		
		//Runtime.getRuntime().exec("D:\\selenium\\autoit2\\fileupload.exe");
	}
}
