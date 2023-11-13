package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_Script {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
		
		Thread.sleep(2000);
		
		System.out.println("before drag the text was "+ driver.findElement(By.xpath("//p[text()='Drop here']")).getText());
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(driver.findElement(By.xpath("//p[text()='Drag me to my target']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		
		System.out.println("after drop the value is " + driver.findElement(By.xpath("//p[text()='Dropped!']")).getText());
	}

}
