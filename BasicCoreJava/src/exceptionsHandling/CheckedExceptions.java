package exceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws Exception {
		
		Testing.temp(1000);
		
		System.out.println("Anand");
		
//		Thread.sleep(5000);    //Interrupted Exception
		
		System.out.println("Santosh");
		
		wait2(1000);
		
		wait1(1000); 
		
		FileInputStream file = new FileInputStream("");
		
		
		
}
	
	public static void wait1(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}	
	
	public static void wait2(int time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			System.out.println("Whatever logic we want to give/print");
		
		}
	}
}

//Predefined Exceptions-Checked Exception: the one which compiler checks and throws at compile time before execution
//UnChecked Exception: the one which compiler doesn't checks and throws after execution time

//throws: it passes information to next user that is not going to handle
//Exception is the super class