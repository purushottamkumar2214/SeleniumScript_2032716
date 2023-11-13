package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling_Script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.xpath("//body/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("1234");
		
		//driver.findElement(By.xpath("//body/footer[1]/div[1]/div[1]/div[1]/a[2]")).click();

		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
	}

}
