package constructor;

public class CarUser {

	public static void main(String[] args) {
		
		Car car1 = new Car();		
		car1.model= "Maruti";
		car1.speed= 120;
		car1.type= "Petrol";
		car1.features();
		
		
		Car car2 = new Car();
		car2.model= "Ford";
		car2.speed= 150;
		car2.type= "Diesel";
		car2.features();
		
		Car car3 = new Car();
		car3.model= "Kia";
		car3.speed=180;
		car3.type= "Petrol";
		car3.features();
		
//		object of any class will create copy of that class meaning copy of that non-static variables
//		Static will have no copy because it is globally assigned
//		when we want to initialize the object we use constructors
		
	}

}