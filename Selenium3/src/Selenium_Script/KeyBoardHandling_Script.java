package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoardHandling_Script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/account/create?.intl=in&specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com&intl=in&context=reg");
		
		// enter text and switch to next field and press enter key
		
	//	driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("selenium", Keys.TAB, "selenium1", Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("selenium", Keys.CONTROL+"A", Keys.CONTROL+"C");
		
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys(Keys.TAB, Keys.CONTROL+"V", Keys.ENTER);
	
		
	}

}
