package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Script {

	public static void main(String[] args) throws InterruptedException {
		//check the changes
	/*	System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		*/
		
	/*	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver 114.0\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		*/
		
		System.setProperty("webdriver.edge.driver","D:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act= new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	
	}

}
