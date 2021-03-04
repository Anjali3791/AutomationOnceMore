package oops.inheritance;

public class Mobile extends Telephone {


		public void texting()
		{
			System.out.println("Texting from Mobile");
			
		}
		
		
//		Method Overriding
		public void calling()
		{
			
			System.out.println("Calling from Mobile");
		}
	}


// Method Overriding:
//whenever we have 1 function with same name and parameters in both parent and child class then it is called Method Overriding