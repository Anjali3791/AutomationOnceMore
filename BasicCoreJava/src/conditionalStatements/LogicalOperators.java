package conditionalStatements;

public class LogicalOperators {

	public static void main(String[] args) {
		 int a =10;
		 int b =20;
		 int c = 30;
		 
//		 logical operators &&(and) and || (or)
		 
		 if (a>b && a>c)
		 {
			 System.out.println("a is greatest");
		 }
		 else if (b>a && b>c)
		 {
			 System.out.println("b is greatest");
			 
		 }
		 else
		 {
			 System.out.println("c is greatest");
		 }
	

	int state =80;
	int iit =30;
	
	if (state >= 70 || iit >=50)
	{
		
		System.out.println("Candidate is eligible");
		
	}
	
	
}
}


