package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='✕']"))));
		
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		

	}

}
