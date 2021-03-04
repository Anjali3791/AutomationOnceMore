package testing;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass3 {

	@Test(priority = 0)
	public void test2() {

		System.out.println("Test Case 2");
	}

	@Test(priority = 1, enabled=false)
	public void test3() {

		System.out.println("Test Case 3");
	}

	@Test(priority = 2)
	public void test1() {
		
		int a=30;
		int b=20;
		
		if(a<b)
		{
			throw new SkipException("a is less than b so skipping the test case");  //this is unchecked type of exception
			
		}
		
		System.out.println("Test Case 1");

	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("Before Method");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("Before Test");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{

		System.out.println("After Suite");
	}

}
