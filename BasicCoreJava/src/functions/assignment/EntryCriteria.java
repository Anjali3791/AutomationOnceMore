package functions.assignment;

public class EntryCriteria {

	public static void main(String[] args) {

		boolean isEligible = checkIfEligible(100, 20);

		printMessage(isEligible);

	}
	
	public static void printMessage(boolean eligibility){
		
		if (eligibility) {
			System.out.println("Student is eligible");
		} else {
			System.out.println("Student is not eligible");
		}
		
	}

	public static boolean checkIfEligible(int cetMarks, int iitMarks) {

		if (cetMarks >= 80 || iitMarks >= 50) {
			return true;
		} else {
			return false;
		}
	}

}