package Selenium_Script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling_Script2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//h1[text()='Welcome to the Yahoo Privacy Policy']")).getText();
		
		String ParentWindowId= driver.getWindowHandle();
		
		Set<String> AllWindowId=	driver.getWindowHandles();
		
		int TotalNoOfWindow= AllWindowId.size();
		
		System.out.println("Total No. of Window is "+ " " + TotalNoOfWindow);
		
		for(String x:AllWindowId)
		{
			
			driver.switchTo().window(x);
			Thread.sleep(2000);
			
			String CurrentWindowTitle= driver.getTitle();
			
			System.out.println(CurrentWindowTitle);
			
			if(CurrentWindowTitle.equalsIgnoreCase("Google Account Help"))
			{
				driver.findElement(By.xpath("//input[@placeholder='Describe your issue']")).sendKeys("this is selenium course");
			}
			
			if(CurrentWindowTitle.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google"))
			{
				driver.findElement(By.xpath("//span[text()='Sign in']")).click();
			}
				
		}
		

	}
	

}
