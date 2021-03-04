package loops.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
 Print following pattern:
*****
****
***
**
*
 

 */

public class Pattern7 {
	public static void main(String args[]) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a number : ");
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}