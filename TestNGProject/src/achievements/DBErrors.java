package achievements;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DBErrors extends TC_Achievements_PreCondition{

	@BeforeClass
	public void dbErrorsPreCondition() {

		System.out.println("Update Config files to 20 from 900");
		System.out.println("Run the jobs");
		System.out.println("Update DB Settings");

	}

	@AfterClass
	public void dbErrorsPostCondition() {

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

		System.out.println("Achievements DBErrors Test1");

	}

	@Test
	public void test2() {

		System.out.println("Achievements DBErrors Test2");

	}

	@Test
	public void test3() {

		System.out.println("Achievements DBErrors Test3");

	}

	@Test
	public void achievements_saveAchievemnts_userInitiated() {
		try {

			// Create User

			System.out.println("Create User");

			// Upload test data
			System.out.println("Upload test data");

			// First Spin
			System.out.println("First Spin");

			// second spin
			System.out.println("Second Spin");

			// insert error
			System.out.println("insert error");

			// third spin
			System.out.println("third spin");

			// validate error in response
			System.out.println("You should get error on front end");

			// validate log file
			System.out.println("Error should be present in log file");

			// revert the change
			System.out.println("Remove error from db");
			System.out.println("Refresh the game");
			System.out.println("Validate DB");

		} catch (Exception e)

		{
			System.out.println("Log the error in to report");

		} finally {
			System.out.println("Validate log file");
			System.out.println("Remove the error");

		}
	}

}
