package diagramas.de.flujo;

import java.util.Scanner;

public class Mainfigura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese el numero de filas 5: ");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
