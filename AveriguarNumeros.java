package FOR_Bucle;

import java.util.Scanner;

public class AveriguarNumeros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe el numero 1-10");
		int numero, negativo = 0, positivo = 0, sumPares = 0, multiple = 15, resto, mult = 0;
		for (int i = 1; i <= 10; i++) {
			numero = in.nextInt();
			if (numero < 0) {
				negativo++;
			} else if (numero > 0) {
				positivo++;
			}
			if (numero % 2 == 0) {
				sumPares += numero;
			}
			resto = numero % multiple;
			if (resto == 0) {
				mult++;
			}

		}
		System.out.println("Cantidad de numeros ingresados negativos son: " + negativo + "\n"
				+ "La cantidad de numeros ingresados positivos son: " + positivo + "\n"
				+ "La cantidad de múltiplos de 15: " + mult + "\n" + "La suma de los numeros pares son: " + sumPares);

	}

}
