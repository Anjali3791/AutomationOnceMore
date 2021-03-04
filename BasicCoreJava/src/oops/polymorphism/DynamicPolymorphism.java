package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Telephone phone;  // dynamic reference
		
		phone = new Telephone();
		phone.calling();
		
		phone = new Mobile();
		phone.calling();
		
		phone = new SmartPhone();
		phone.calling();
		
		

//		Mobile phone = new SmartPhone();
//		phone.calling();
//		phone.texting();
		
		/*
		 * SmartPhone phone1 = new SmartPhone(); phone1.calling(); phone1.texting();
		 * phone1.videoCalling();
		 */

	}

}

//Whenever we have parent class reference for the child class object, 
//we can only call those functions which are present in parent class
//but overriding will be get called from child class