package functions.assignment;

public class MaritialStatusCriteria {

	public static void main(String[] args) {

		int age = 24;

		boolean isEligible = isEligibleForMarriage(age);

		if (isEligible) {
			System.out.println("A " + age + " years old person is eligible for marriage");
		} else {
			System.out.println("A " + age + " years old person is not eligible for marriage");
		}

	}

	public static boolean isEligibleForMarriage(int age) {

		if (age >= 21) {
			return true;
		} else {
			return false;
		}
	}

}
