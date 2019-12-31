package For_Bucle;

import java.util.Scanner;

public class CantidadPrimos {

	public static boolean esPar(int numero) {
		boolean esPar = numero % 2 == 0;

		if (esPar) {

		} else {

		}
		return esPar;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, par = 0, num = 0;

		System.out.print("Ingrese la cantidad de un numero: ");
		n = in.nextInt();
		System.out.println("Ahora ingrese de 1 a " + n);
		for (int i = 1; i <= n; i++) {
			num = in.nextInt();
			if (CantidadPrimos.esPar(num)) {
				par++;
			}
		}

		if (CantidadPrimos.esPar(num)) {
			if (par > 1) {
				System.out.println("Hay " + par + " numeros primos");
			} else {
				System.out.println("Hay un numero primo");
			}

		} else {
			System.out.println("No hay ningun numero primo");
		}

	}

}
