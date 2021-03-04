package exceptionsHandling;

import oops.inheritance.Telephone;

public class TryCatchBlock {

	static Telephone phone;

	public static void main(String[] args) {

		try {
//		1. Arithmetic exception example:
			System.out.println(10 / 0);
		} catch (ArithmeticException e) // we have given e as reference to assign the run time arithmetic object type
//		if any exception is throw on run time it will be stored in "e"
		{
			e.printStackTrace();
			System.out.println(e.getMessage()); // to print the run time exception information
		}

//		2. StringIndexOutOfBoundsException example:
		String name = "anand";
		System.out.println(name.charAt(6));

//		3. ArrayIndexOutOfBoundsException example:
		int[] arr = { 10, 20, 30 };
		System.out.println(arr[4]);

//		4. NullPointerException example:
		phone.calling();

	}

}
