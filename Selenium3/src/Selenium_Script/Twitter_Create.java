package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter_Create {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://twitter.com/");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Sign in with Google Dialogue']")));
		
		driver.findElement(By.cssSelector("svg.Bz112c:nth-child(2) > path:nth-child(1)")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@href='/i/flow/signup'])[2]")).click();
		

	}

}
