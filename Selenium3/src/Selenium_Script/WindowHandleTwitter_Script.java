package Selenium_Script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandleTwitter_Script {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.twitter.com");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Sign in with Google Dialogue']")));
			
		Thread.sleep(2000);
			
		System.out.println("entered in the frame");
			
		driver.findElement(By.cssSelector("svg.Bz112c:nth-child(2) > path:nth-child(1)")).click();
			
		driver.switchTo().defaultContent();
			
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();
			
			
			//driver.findElement(By.xpath("//html/body/div[1]/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/div[1]/a/div")).click();
			
			//driver.findElement(By.xpath("//a[@href='/login']]")).click();
			
			Thread.sleep(3000);
		
		
			// driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).sendKeys("zahid");
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("zahid");
			driver.findElement(By.xpath("//span[text()='Use email instead']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("zahid_bajard@hotmail.com");
			Select sel=new Select(driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_1_LABEL']")));
			sel.selectByIndex(10);
			
			
			Select sel1=new Select(driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_2_LABEL']")));
			sel1.selectByIndex(20);
			
			Select sel2=new Select(driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_3_LABEL']")));
			
			
			sel2.selectByIndex(52);
			
			
			driver.findElement( By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//input[@aria-describedBy='CHECKBOX_1_LABEL']")).click();
			driver.findElement(By.xpath("//span[text()='Privacy Policy']")).click();
			String parentWindowId=driver.getWindowHandle();
			Set<String>AllWindowId=driver.getWindowHandles();
			int TotalNoOfWindow=AllWindowId.size();
			System.out.println("Total No Of Window is"+""+ TotalNoOfWindow);
			for(String x:AllWindowId)
			{
				if(! x.equalsIgnoreCase(parentWindowId))
				{
					System.out.println("Enter inside the loop");
					driver.switchTo().window(x);
					
					System.out.println(driver.getTitle());
					Thread.sleep(3000);
				driver	.findElement(By.xpath("//a[text()='Privacy Center']")).click();
					
				Actions act=new Actions(driver);
					act.moveToElement(driver.findElement(By.xpath("//span[text()='For our users']"))).build().perform();
					Thread.sleep(2000);
					driver.findElement(By.xpath(("(//span[@class='u01b-01__child-link-text'])[1]"))).click();
				}
	}

	}
}
