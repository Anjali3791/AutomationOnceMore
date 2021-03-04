package oops.inheritance;

public class User {

	public static void main(String[] args) {

		Telephone phone = new Telephone();
		phone.calling();

		Mobile mob = new Mobile();
		mob.calling();
		mob.texting();

		
		 SmartPhone sphone = new SmartPhone(); 
		 sphone.calling(); 
		 sphone.texting();
		 sphone.videoCalling();
		 
		 
	}

}
