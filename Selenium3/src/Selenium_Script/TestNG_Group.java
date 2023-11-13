package Selenium_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Group {

	@Test (priority = 1)
	
	public void SignUp()
	{
		
		System.out.println("Sign up test case executed");
	}
	
	@Test (priority =2)
	
	public void LoginGmail()
	{
		
	System.out.println("LoginGmail test case executed");
	Assert.assertEquals(1, 2);
	}
	
	@Test (priority = 3, dependsOnMethods ="LoginGmail")
	
	public void ComposeMail()
	{
		
		System.out.println("Compose mail test case executed");
	}
	 
	@Test (priority = 4, dependsOnMethods ="LoginGmail")
	public void VerifyTitle()
	{
		
		System.out.println("verify title test case executed");
	}
}
