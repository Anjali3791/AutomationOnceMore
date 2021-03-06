package loops.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
 Print following pattern:

    *
   **
  ***
 ****
*****

 */

public class Pattern8 {
	public static void main(String args[]) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a number : ");
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= (n - i); k++) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}
}
