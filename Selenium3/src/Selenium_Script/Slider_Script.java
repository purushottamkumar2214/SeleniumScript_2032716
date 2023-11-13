package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Script {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/slider/default.html']")));
		
		Thread.sleep(2000);
		
		Actions act= new Actions(driver);
		
		act.dragAndDropBy(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")), 70, 0).build().perform();
		
	}

}
