package diagramas.de.flujo;

import java.util.Scanner;

public class Mainfigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese el numero de filas: ");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int f = 1; f <= n; f++) {
			for (int a = 1; a <= f; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
