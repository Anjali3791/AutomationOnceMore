package stringClass;

public class SampleStringClass {

	public static void main(String[] args) { // Methods from a string class

		
		  String name = "Anand"; System.out.println(name);
		 
		  // Function 1 
		  System.out.println(name.length());
		  
		  // Function 2 
		  System.out.println(name.charAt(4));
		  
		  // Function 3 
		  System.out.println(name.toUpperCase());
		  
		  // Function 4 
		  System.out.println(name.toLowerCase());
		  
		  // Function 5 
		  System.out.println(name.trim()); // will delete the spaces from front and back of string
		  
		 // Function 6 
		  System.out.println(name.replace("n", "1"));
		 
		 // Split
		 
		 String temp = "Hi my name is Anand"; 
		 String[] str = temp.split(" ");
		 
		 System.out.println(str.length);
		 
		  for (String s : str) {
		  
		  System.out.println(s); }
		 
		 // Equals 
		  System.out.println(name.equals(temp));
		  
		 // Equal Ignore Case 
		  System.out.println(name.equalsIgnoreCase(temp)); // it ignores the case sensitivity
		  
		 // Sub String System.out.println(temp.substring(14));
		 
		 System.out.println(temp.substring(11, 13));
		 
		 // Assignments 
		 
		 // 1. anjali == count of "a" to be printed
		 
		 String str1 = "anjali"; int count = 0; for (int i = 0; i < str1.length();
		 i++) { if (str1.charAt(i) == 'a') { count++; } }
		  System.out.println("count of a = " + count);
		 

//		2. Hi My name is Anand ==> iH yM eman si dnanA
		
		String str2 = "Hi My name is Anand";
		 String[] arr1 = str2.split(" ");
		 String[] arr2 = new String[str.length];
		 
		 for(int k=0; k<arr2.length; k++) {
			 
			 arr2[k]= "";
			 
		 }
		 
	        for (int i = 0; i < arr1.length; i++) {
	        	String[] arr3 = arr1[i].split("");
	        	
	        	for (int j = arr3.length- 1; j >= 0; j--) {
	        		
	        		arr2[i]= arr2[i]+arr3[j];
	        }
	        }
	        for(String s:arr2) {
	        	
	        	System.out.print(s+" ");
	        }
	            System.out.println("");

// 3. a=10, b=20 to be printed ==> b=10, a=20

	                int a = 10; int b = 20;
 
	                a = a + b; // a = 10+20 = 30 
	                b = a - b; // b= 30-20 = 10 
	                a = a - b; // a =30-10 = 20

	                System.out.println("The new value of a = " + a +" and"+ " the new value of b = " + b);


            }

}


