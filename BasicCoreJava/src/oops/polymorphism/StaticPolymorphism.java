package oops.polymorphism;

public class StaticPolymorphism {

	public static void main(String[] args) {

		
		sum(10,20);
		sum(10, 20, 30);
	}
	public static void sum(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
}


// to perform one action with multiple functions
//	Method overloading is also know as Static Polymorphism

//Poly = many
//morphism = forms