package oops.abstraction;

public class User {

	public static void main(String[] args) {

		MsWord ms = new Sprint3();
		
		ms.copy();
		ms.cut();
		ms.paste();
		ms.print();
		ms.edit();
		ms.save();
	}

}

//We cannot make an object of an abstract class
//with the help of interface 
