package conditionalStatements;

public class NestedIf {

	public static void main(String[] args) {
		 int a=30;
		 int b=20;
		 int c=10;
	
		 if (a>b)
		 {
		if (a>c)
		{
			System.out.println("a is greatest");
			
		}
		else if (b>c)
		{
			System.out.println("b is the greatest");
		}	
		else
		{
			System.out.println("c is the greatest");
		}
	}
		 else if (b>c)
		 {
			 System.out.println("b is greatest");
		 }
		 else 
		 {
			 System.out.println("c is greatest");
		 }
		 

	}

}
