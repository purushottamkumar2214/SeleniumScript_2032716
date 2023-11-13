package Selenium_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fileupload_Script {

	
	//public static void main(String[] args) throws InterruptedException, IOException
	
	@Test
	
	public void file1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\purus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		WebElement fileupload1= driver.findElement(By.xpath("//input[@id='imagesrc']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",fileupload1);
		
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec("D:\\selenium\\autoit2\\fileupload.exe");
		
		Thread.sleep(2000);
	}
}
