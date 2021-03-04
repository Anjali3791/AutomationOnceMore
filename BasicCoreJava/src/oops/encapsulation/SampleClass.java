package oops.encapsulation;

public class SampleClass {

	private int age;  
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0)
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.equals("Anjali"))
		this.name = name;
	}
	
	
	
	
	
}


//It is the process of wrapping the data members and methods acting on it into a single unit
//s