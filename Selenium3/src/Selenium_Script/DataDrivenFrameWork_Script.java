package Selenium_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenFrameWork_Script {
	WebDriver driver;
	@BeforeTest

	public void OpenBrowser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\selenium2\\mozilla gecko driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
	 driver= new FirefoxDriver();
		
	 driver.get("https://login.yahoo.com/account/create");
	}

	
	@Test (dataProvider = "testdata")
	
	public void VerifyCreateAccount(String FirstName,String LastName) 
	{
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(FirstName);
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(LastName);
		
		driver.findElement(By.id("usernamereg-firstName")).clear();
		
		driver.findElement(By.id("usernamereg-lastName")).clear();
	}
	
	@DataProvider(name = "testdata")	
	public Object[][] testdata() {
	Object[][] arrayObject = getExcelData("D:\\selenium\\testdata.xls","Sheet1");
	return arrayObject;
	}
	
	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
		FileInputStream fs = new FileInputStream(fileName);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(sheetName);

		int totalNoOfCols = sh.getColumns();
		int totalNoOfRows = sh.getRows();
		
		System.out.println("total no. of row"+ totalNoOfRows);
		
		System.out.println("total no. of columns"+ totalNoOfCols);
		
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		
		for (int i= 1 ; i < totalNoOfRows; i++) {

		for (int j=0; j < totalNoOfCols; j++) {
		arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
		}

		}
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		e.printStackTrace();
		} catch (BiffException e) {
		e.printStackTrace();
		}
		return arrayExcelData;
		}	

}
