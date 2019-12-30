package FOR_Bucle;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un numero para el cuadrado:");
		int n = in.nextInt();

		if (n >= 0 && n <= 10) {

			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 0; i < n - 2; i++) {
				System.out.print("*");
				for (int j = 0; j < n - 2; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}

			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}

		}
	}

}
