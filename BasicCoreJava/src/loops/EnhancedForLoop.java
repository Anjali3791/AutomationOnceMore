package loops;

public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] arr= new String[3];
		arr [0] = "Anjali";
		arr [1] = "Shubhangi";
		arr [2] = "Santosh";
		
		for(int i=0; i<3; i++) {
			
			System.out.println(arr[i]);
			}
		
	System.out.println("***********************");	
	for(String s: arr) //also called for each loop; applicable for arrays and collections;signification of "s:" is that the array is getting assigned to "String s" variable
		{
			
			System.out.println(s);
			
			
		}
		
	System.out.println("New program");
	
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int s1: arr1) {
			
			System.out.println(s1);
		}
		
			
	
	}

}
