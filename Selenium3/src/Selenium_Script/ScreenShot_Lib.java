package Selenium_Script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot_Lib {
	
	public static String takeScreenshots(WebDriver driver, String ScreenshotName) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest=	new File("D:\\selenium\\image\\"+ScreenshotName+".png");
		FileUtils.copyFile(source,dest );
		
		return dest.getAbsolutePath();
	
		
		
	}

}
