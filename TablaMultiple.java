package FOR_Bucle;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		int a = in.nextInt();

		for (int b = 1; b <= 10; b++) {
			System.out.println(a + " X " + b + " = " + (a * b));
			
			
		}

	}

}
