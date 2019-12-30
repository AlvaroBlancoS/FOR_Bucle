package FOR_Bucle;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe la cantidad de triangulos");
		int cant = in.nextInt();
		int equilateros = 0, isoscele = 0, escaleno = 0;
		for (int i = 1; i <= cant; i++) {
			System.out.print("Ingresa el lado 1: ");
			int lado1 = in.nextInt();
			System.out.print("Ingresa el lado 2: ");
			int lado2 = in.nextInt();
			System.out.print("Ingresa el lado 3: ");
			int lado3 = in.nextInt();

			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Es un triangulo equilatero");
				equilateros++;
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Es un triangulo isoscele");
				isoscele++;
			} else {
				System.out.println("Es un triangulo escaleno");
				escaleno++;
			}

		}
		// Cantidad de triangulos cada tipo
		System.out.println(
				"Cantidad de triangulos equilateros: " + equilateros + "\n" + "Cantidad de triangulos isosceles: "
						+ isoscele + "\n" + "Cantidad de triangulos escalenos: " + escaleno);

		// Tipo de triangulo que posee menor cantidad
		if (equilateros < isoscele || equilateros < escaleno) {
			System.out.println("Equilatero posee menor cantidad");
		}
		if (isoscele < equilateros || isoscele < escaleno) {
			System.out.println("Isoscele posee menor cantidad");
		}
		if (escaleno < equilateros || escaleno < isoscele) {
			System.out.println("escaleno posee menor cantidad");
		}


	}
}
