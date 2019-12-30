package FOR_Bucle;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int suma = 0, numero;
		for (int i = 1; i <= 10; i++) {
			System.out.print("ingresa un numero: ");
			numero = in.nextInt();
			if (i > 5) {
				suma += numero;
			}

		}
		System.out.println("La suma de los útlimos 5 valores ingresados es: " + suma);

	}

}
