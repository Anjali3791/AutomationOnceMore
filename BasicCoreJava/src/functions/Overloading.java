package functions;

public class Overloading {

	public static void main(String[] args) {

		sum(10, 20);

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);

	}

	public static void sum(String a, int b) {
		System.out.println(a + b);

	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public static void eligibility(int age, boolean maritalStatus) {

	}

	public static void eligibility(boolean maritalStatus, int age) {

	}

//	Method Overloading: Same method name with different parameters; until no change in parameters is done method overloading cannot be achieved
//	Different parameters: 1. increase the number of parameters
//	2. Decrease the parameters
//	3. change data type
//	4. Swap the parameters
//	cannot be achieved by modifying access modifiers; return type & static / non static
}
