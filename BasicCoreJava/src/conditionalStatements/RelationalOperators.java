package conditionalStatements;

public class RelationalOperators {

	public static void main(String[] args) {
		//>,<,==, >=, <= !=
		//= is assignment operator
		
		int a= 10;
		int b=20;
		int c=30;
		
		if (a>b)
		{
			System.out.println("a is greater than b");
		
			}
		if (b<c)
		{
			System.out.println("b is less than c");
					
		}
		if (a>=b)
		{
			System.out.println("a is greater than or equal to b");
		}
		if (b<=c)
		{
			System.out.println("b is less than or equal to c");
		}
		if (a != c)
		{
			System.out.println("a is not equal to c");
			
		}
		if (a==b)
		{
			System.out.println("a is equal to b");
		}		
	}

}
