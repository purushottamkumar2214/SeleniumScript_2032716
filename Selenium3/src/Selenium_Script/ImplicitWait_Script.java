package Selenium_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait_Script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=13796675785170082364&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301334&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("wait");		
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		System.out.println("click");
		
		driver.findElement(By.partialLinkText("Best Sellers")).click();
	
	}

}
