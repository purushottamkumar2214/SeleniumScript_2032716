package Selenium_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Group2 {

	@Test (priority = 1, groups = {"smoke","sanity"})
	
	public void SignUp()
	{
		
		System.out.println("Sign up test case executed");
	}
	
	@Test (priority =2, groups = {"smoke","sanity"})
	
	public void LoginGmail()
	{
		
	System.out.println("LoginGmail test case executed");
	//Assert.assertEquals(1, 2);
	}
	
	@Test (priority = 3, dependsOnMethods ="LoginGmail", groups = {"smoke","sanity"})
	
	public void ComposeMail()
	{
		
		System.out.println("Compose mail test case executed");
	}
	 
	@Test (priority = 4, dependsOnMethods ="LoginGmail", groups = {"sanity"})
	public void VerifyTitle()
	{
		
		System.out.println("verify title test case executed");
	}
}
