package constructor;

public class Car {
	
	//	object == instance variable
	String model;
	String type;
	int speed;
	
//	Class variable
	static int wheels=4;
	
	
//	Constructor Overloading
	
	//Below is called Default Constructor
	public Car() {			
	}
//	Constructor looks like a method which has same name as of class and doesn't have any return type
//	if we dont create any Parameterized constructor or user define constructor then class object will also refer to default constructor
//	whenever we create a class automatically a default constructor gets created
//	We use this constructor in Library class

	
	//Parameterized Constructor
	public Car(String model, String type, int speed)
	{
		
		this.model = model;
		this.type = type;
		this.speed = speed;
	}	
	
	public Car(String model, String type)
	{
		this.model = model;
		this.type = type;
	}
		
	public void features() {
		
		System.out.println("Model="+model+", Type="+type+", Wheels= "+wheels+", Speed="+speed);
	}

}


//Webdriver path; URL path; Screenshot path are to be stored in static variables as they will be same/constant through out

//local, class & instance variables are there

//if we use static keyword the it becomes class variable
//to initialize the object we use constructor