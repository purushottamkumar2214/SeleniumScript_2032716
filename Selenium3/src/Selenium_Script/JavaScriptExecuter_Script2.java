package Selenium_Script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter_Script2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.m3mgurgaon.co.in/?source=google&medium=ppc&campaignid=1013010394&adgroup=52627149067&keyword=m3m&matchtype=e&device=c&gad=1&gclid=CjwKCAjwvpCkBhB4EiwAujULMnoKCUfGTqmjV3PfegjJZUEPhany9yEyz9BHEGstd_eNdyhbgjw3SBoCE90QAvD_BwE#contact");
		
		Thread.sleep(9000);
		
		WebElement Close= driver.findElement(By.xpath("(//button[@aria-label='Close'])[38]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//js.executeScript("document.getElementById('usernamereg-firstName').value='kamal'");
		
		js.executeScript("arguments[0].click();",Close);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='btn nav-link brochure']")).click();
		
		Thread.sleep(9000);
		
		Alert alert= driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		
		 
	}

}
