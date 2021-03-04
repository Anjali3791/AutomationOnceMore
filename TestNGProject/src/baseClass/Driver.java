package baseClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {

	@BeforeSuite
	public void oneTimeSetUp()
	{
		System.out.println("Copy Plugins and config files");
		System.out.println("Stop unnecessary services");
		System.out.println("Login to all the dependent servers");
		System.out.println("Install all the required games");
		
		
	}
	
	
	@AfterSuite
	public void oneTimeTearDown()
	{
		
		System.out.println("Kill the services");
		
		
	}
	
	
}
