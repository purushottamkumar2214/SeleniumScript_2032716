package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Script_Value {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://twitter.com/?lang=en-in");
	
	driver.findElement(By.xpath("//span[text()='Sign up']")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	
	Thread.sleep(4000);
	
	Select sel=new Select(driver.findElement(By.xpath("//select[@id='SELECTOR_1']")));
 
	sel.selectByValue("4");
	
	//Thread.sleep(2000);
	
	Select sel1= new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div[3]/div/div[2]/select")));
	
	sel1.selectByIndex(9);
	
//	Thread.sleep(2000);
	
	Select sel2= new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div[3]/div/div[3]/select")));

	sel2.selectByIndex(9);
	}

}
