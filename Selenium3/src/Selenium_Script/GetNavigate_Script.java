package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetNavigate_Script {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("https://login.yahoo.com/?.intl=in");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create an')]")).click();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
	}

}
