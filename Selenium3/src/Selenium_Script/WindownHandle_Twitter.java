package Selenium_Script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindownHandle_Twitter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.twitter.com");
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//span[text()='Privacy Policy']")).click();
		
		String ParentWindowId= driver.getWindowHandle();
		
		Set<String>	AllWindowId= driver.getWindowHandles();
		
		
		int NoOfWindow= AllWindowId.size();
		
		System.out.println("total no. of window "+ NoOfWindow);
		
		for (String x:AllWindowId)
		{
			if(!x.equalsIgnoreCase(ParentWindowId))
			{
				System.out.println("Enter inside the loop");
				driver.switchTo().window(x);
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='Privacy Center']")).click();
				Thread.sleep(2000);
				Set<String> CurrentTotalWindow= driver.getWindowHandles();
				int TotalNoOfCurrentWindow= CurrentTotalWindow.size();
				
				System.out.println("Total No. of current window "+  TotalNoOfCurrentWindow);
				
				for (String y:CurrentTotalWindow)
				{
					Thread.sleep(1000);
					driver.switchTo().window(y);
					Thread.sleep(1000);
					
					String CurrentWindowTitle= driver.getTitle();
					
					System.out.println(CurrentWindowTitle);
					
					if (CurrentWindowTitle.equalsIgnoreCase("Privacy"))
							{
						
						Actions act=new Actions(driver);
						act.moveToElement(driver.findElement(By.xpath("//span[text()='For our users']"))).build().perform();
						Thread.sleep(2000);
						driver.findElement(By.xpath(("(//span[@class='u01b-01__child-link-text'])[1]"))).click();
							}
					
					
				}
		}
		

	}
	}
}


