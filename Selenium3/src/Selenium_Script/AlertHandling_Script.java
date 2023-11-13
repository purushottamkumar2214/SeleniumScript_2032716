package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling_Script {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act= new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();

		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}

}
