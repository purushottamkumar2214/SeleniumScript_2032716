package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkText_Script {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
				
			WebDriver driver= new FirefoxDriver();
			
			driver.get("https://twitter.com/?lang=en-in");
			
		//	driver.findElement(By.xpath("//span[text()='Sign up']")).click();
			
		//	Thread.sleep(4000);
			
		//	driver.findElement(By.xpath("//span[text()='Create account']")).click();
			
			Thread.sleep(4000);
			
			driver.findElement(By.partialLinkText("Policy")).click();

	}

}
