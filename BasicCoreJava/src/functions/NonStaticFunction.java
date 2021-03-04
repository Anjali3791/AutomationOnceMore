package functions;

public class NonStaticFunction {

	public static void main(String[] args) {
		
		//<----Reference---->   <---Object------------> 		
		
		NonStaticFunction ref = new NonStaticFunction();
		
		int sum = ref.sum(10, 20);
		System.out.println(sum);
	}
	
	public int sum(int a, int b)
	{
		
		return a+b;
		
		
	}
	
	public static int sum1(int a, int b)
	{
		
		return a+b;
		
		
	}

}

//Thumb Rule1: Static functions can only call static members of a class (variables, methods)
//Thumb Rule2: To call non static functions/variables inside a static function we need to create an object

//Object is an instance of a class; with the help of this obj we can call all the non-static functions and variable of that class
