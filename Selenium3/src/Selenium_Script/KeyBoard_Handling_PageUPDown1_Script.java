package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoard_Handling_PageUPDown1_Script {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing");
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_UP, Keys.ARROW_UP);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.END);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.HOME);
		
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
		
		

	}

}
