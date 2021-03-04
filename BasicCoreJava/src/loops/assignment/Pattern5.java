package loops.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
 Print following pattern:

1
12
123
1234
12345
123456

 */

public class Pattern5 {
	public static void main(String args[]) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a number : ");
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}