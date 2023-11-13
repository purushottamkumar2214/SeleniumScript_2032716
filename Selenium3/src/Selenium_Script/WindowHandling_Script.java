package Selenium_Script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling_Script {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/account/create?lang=en-IN&src=ym&done=https%3A%2F%2Fmail.yahoo.com%2F%3F.lang%3Den-IN%26guce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAACOgaTK_z4k-s3mjpBcq2AWPSrv5ROsMhVNzNNKBBDjLl0X9Rbp5rzPRaif4Sg0ZO1V9NH7ljAV9uOEy5uCyoltWcc-R2aQTTpYjE_uLPhMHamxFJ3DJjzPyMjQocW0AaqPb879dAveWFJm4R6DuyT8ylyyTvM38PRvrYxk53Mep&specId=yidregsimplified");
		
		driver.findElement(By.xpath("//a[@href='https://legal.yahoo.com/in/en/yahoo/privacy/index.html']")).click();
		
		//driver.findElement(By.xpath("//h1[text()='Welcome to the Yahoo Privacy Policy']")).getText();
		
		String ParentWindowId= driver.getWindowHandle();
		
		Set<String> AllWindowId=	driver.getWindowHandles();
		
		int TotalNoOfWindow= AllWindowId.size();
		
		System.out.println("Total No. of Window is "+ " " + TotalNoOfWindow);
		
		for(String x:AllWindowId)
		{
			if(!x.equalsIgnoreCase(ParentWindowId))
			{
			System.out.println("Enter inside the loop");
			driver.switchTo().window(x);
			Thread.sleep(2000);
			
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome to the Yahoo Privacy Policy']")).getText());
				
			driver.findElement(By.xpath("(//a[text()='Topics'])[2]")).click();
			}
		}
		

	}
	

}
