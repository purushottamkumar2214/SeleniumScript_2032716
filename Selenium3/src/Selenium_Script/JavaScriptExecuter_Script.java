package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter_Script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=ym&activity=mail-direct&pspid=159600001&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2F%3F.lang%3Den-IN&specId=yidregsimplified&done=https%3A%2F%2Fmail.yahoo.com%2Fd%2F%3F.lang%3Den-IN");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//js.executeScript("document.getElementById('usernamereg-firstName').value='kamal'");
		
		js.executeScript("document.getElementById('reg-submit-button').click()");
		
	}

}
