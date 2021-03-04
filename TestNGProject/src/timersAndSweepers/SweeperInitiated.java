package timersAndSweepers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SweeperInitiated extends TC_TimersAndSweepers_PreCondition{
	
	
	@BeforeClass
	public void sweeperInitiatedPreCondition() {

		System.out.println("Pre Condition SweeperInitiated tests");

	}

	@AfterClass
	public void sweeperInitiatedPostCondition() {

		System.out.println("Revert the changes made in before class");

	}

	@BeforeMethod
	public void commonPreConditionForAllTheTestCases() {

		System.out.println("Delete log files");

	}

	@AfterMethod
	public void commonPostConditionForAllTheTestCases() {

		System.out.println("Common post condition for all the test cases");
		System.out.println("Clear global variable data");

	}

	@Test
	public void test1() {

		System.out.println("SweeperInitiated Test1");

	}

	@Test
	public void test2() {

		System.out.println("SweeperInitiated Test2");

	}

	@Test
	public void test3() {

		System.out.println("SweeperInitiated Test3");

	}

}
