import java.util.Scanner;

public class christmasTreeInTheArray {
	public static void main(String args[]) {
		// Creating a scanner.
		Scanner s = new Scanner(System.in);

		// Enter the value n (number of lines).
		System.out.print("Input the number: ");
		int n = s.nextInt();

		// Close the scanner
		s.close();

		// We get the value m (number of columns).
		// It is important that for a correct Christmas tree,
		// our number m must be the sum of two n and -1 (an odd number).
		int m = (n + n) - 1;

		// Creating a new array n * m
		String mas[][] = new String[n][m];

		// Loop through the lines of the array.
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				// Filling the array with x values
				if (j >= m - n - i && j <= m - n + i)
					mas[i][j] = "x";
				else
					// Filling the loop with random numbers from 1 to 10.
					mas[i][j] = String.valueOf((int) (1 + Math.random() * 9));

				//Outputting of the array in console
				System.out.print(mas[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
