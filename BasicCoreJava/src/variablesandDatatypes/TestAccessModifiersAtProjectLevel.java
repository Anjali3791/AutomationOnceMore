package variablesandDatatypes;

import functions.AccessModifiers;

public class TestAccessModifiersAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		
		AccessModifiers obj2 = new AccessModifiers();
		
		obj2.publicFunction();
		
		TestAccessModifiersAtProjectLevel obj1 = new TestAccessModifiersAtProjectLevel();
		
		obj1.protectedFunction();

	}

}

//when one class acquires the property of another class it is called as Inheritance
