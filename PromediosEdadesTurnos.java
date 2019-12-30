package For;

import java.util.Scanner;

public class PromediosEdadesTurnos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int suma1 = 0, suma2 = 0, suma3 = 0, edad;
		int pro1 = 50, pro2 = 60, pro3 = 3, result1, result2, result3;

		System.out.println("Estudiantes del turno mañana");
		for (int i = 1; i <= pro1; i++) {
			System.out.print("ingrese edad: ");
			edad = in.nextInt();
			suma1 += edad;
		}
		result1 = suma1 / pro1;

		System.out.println("Promedio de edades del turno mañana: " + result1);

		System.out.println("Estudiantes del turno tarde");
		for (int i = 1; i <= pro2; i++) {
			System.out.print("Ingrese edad:");
			edad = in.nextInt();
			suma2 += edad;
		}
		result2 = suma2 / pro2;
		System.out.println("Promedio de edades del turno tarde: " + result2);

		System.out.println("Estudiantes del turno noche");
		for (int i = 1; i <= pro3; i++) {
			System.out.print("Ingrese edad:");
			edad = in.nextInt();
			suma3 += edad;
		}
		result3 = suma3 / pro3;
		System.out.println("Promedio de edades del turno tarde: " + result3);

		if (pro1 < pro2 && pro1 < pro3) {
			System.out.println("El turno mañana tiene un promedio menor de edades");
		} else if (pro2 < pro3) {
			System.out.println("El turno tarde tiene un promedio menor de edades");
		} else {
			System.out.println("El turno noche tiene un promedio menor de edades");
		}

	}

}
