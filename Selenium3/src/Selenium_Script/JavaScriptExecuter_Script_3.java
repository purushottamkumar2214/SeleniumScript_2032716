package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter_Script_3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
	/*	driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=ym&activity=mail-direct&pspid=159600001&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%2F&specId=yidregsimplified&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%2F");
		
		Thread.sleep(1000);
		
		js.executeScript("document.querySelector('#usernamereg-firstName').value='purushottam'");
		*/
		
		driver.get("https://www.yahoo.com/");
		
		driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).click();		
		//js.executeScript("window.scrollBy(0,2000)");
		
		js.executeScript("window.history.back()");
		Thread.sleep(7000);
		js.executeScript("window.history.forward()");
	}

}
