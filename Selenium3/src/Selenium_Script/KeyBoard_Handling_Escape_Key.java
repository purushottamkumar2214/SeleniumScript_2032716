package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoard_Handling_Escape_Key {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
		
		

	}

}
