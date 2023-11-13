package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Script {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act= new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();

	}

}
