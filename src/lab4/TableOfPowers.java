package lab4;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int num;
		int square;
		int cube;
		String response;
		boolean calculations = true;

		System.out.println("Learn your squares and cubes!");
		System.out.println();

		while (calculations) {

			System.out.print("Enter an integer: ");
			num = scnr.nextInt();

			System.out.printf("%-9s %-10s %-8s", "Number", "Squared", "Cubed");
			System.out.println();
			System.out.println("======    =======    ======");

			for (int i = 1; i <= num; i++) {

				square = i * i;
				cube = i * square;
				System.out.printf("%-9d %-10d %-8d\n", i, square, cube);
			}

			System.out.println();

			for (int i = 1; i <= num; i++) {
				System.out.printf("%5d ", i);
			}

			System.out.println();

			for (int i = 1; i <= num; i++) {
				System.out.printf("%5c ", '=');
			}

			System.out.println();

			for (int i = 1; i <= num; i++) {
				System.out.printf("%-1d | %1d ", i, i);
				for (int j = 2; j <= num; j++) {
					System.out.printf("%5d ", i * j);
				}

				System.out.println();
			}

			System.out.println();

			System.out.print("Continue? (y/n)");
			response = scnr.next();

			if (response.equalsIgnoreCase("n")) {
				calculations = false;
				System.out.println("Thanks for learning your sqaures and cubes.");

			}
		}

	}

}
