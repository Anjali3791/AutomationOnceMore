package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String[][] arr = new String[3][2]; //1st brace for rows & 2nd for columns
		arr[0][0]="u1";
		arr[0][1]="p1";
		arr[1][0]="u2";
		arr[1][1]="p2";
		arr[2][0]="u3";
		arr[2][1]="p3";

		for(int i=0;i<3;i++) {
			for(int j=0; j<2;j++) {

				System.out.print(arr[i][j]);
				if(j==0) 
					System.out.print(",");

			}
			System.out.println();
		}
		//		System.out.println(arr[0][0]);


		//		Assignment1
		//		****
		//		****
		//		****
		//		****

		//		Assignment2
		//		1234
		//		1234
		//		1234
		//		1234

		//		Assignment3
		//		1111
		//		2222
		//		3333
		//		4444

		//		Assignment4
		//		1
		//		22
		//		333
		//		4444

		//		Assignment5
		//		1
		//		12
		//		123
		//		1234
	}

}