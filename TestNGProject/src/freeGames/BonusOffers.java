package freeGames;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BonusOffers extends TC_FreeGames_PreCondition{
	
	@BeforeClass
	public void bonusOffersPreCondition() {

		System.out.println("Pre Condition BonusOffers tests");

	}

	@AfterClass
	public void bonusOffersPostCondition() {

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

		System.out.println("BonusOffers Test1");

	}

	@Test
	public void test2() {

		System.out.println("BonusOffers Test2");

	}

	@Test
	public void test3() {

		System.out.println("BonusOffers Test3");

	}
	

}
