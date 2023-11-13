package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.nykaa.com/?gclid=CjwKCAjw6vyiBhB_EiwAQJRoptv65uUlQmcsYDDC42Vfi1ii74sgx6u5L9EmFcBvVLGxDIO7H8jA6xoCndwQAvD_BwE");
		
		Actions act = new Actions(driver);
	
		act.moveToElement(driver.findElement(By.xpath("//header/div[@id='header_id']/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"))).build().perform();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//header/div[@id='header_id']/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
	}

}
