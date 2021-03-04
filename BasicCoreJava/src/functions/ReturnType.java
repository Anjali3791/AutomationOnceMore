package functions;

public class ReturnType {

	public static void main(String[] args) {
		
		//10, 20
		
		int sum1 = sum(10,20);
		System.out.println(sum1);
		
		int sum2 = sum(30,40);
		
		
		sum(10,20);
//		System.out.println(sum2);
		
		}
	
	public static int sum (int a, int b)
	
	{
		return a+b;
		
		
	}
	
	public void message (String message)
	{
		System.out.println(message);
		
	}
	
	
	//Assignment 1: create a function for eligibility (CET 80>=, IIT 50>=)
	//Assignment 2: boolean value in parameter, on true print "You're Eligible"; On false print "You're not eligible"
	
//	Assignment 3: Create an eligibilty function which will accept (age, maritial status)
//	age>=21, maritial status = true
//	

}

//Return type can any type premative and non premative


