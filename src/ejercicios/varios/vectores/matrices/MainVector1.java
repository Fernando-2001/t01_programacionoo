package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vectro X[3] de tipo char y construya un programa que pida al
		// usuario que ingrese los
		// valores para cada posicion
		// y finalmente imprima los valores
		Scanner in = new Scanner(System.in);

		char X[] = new char[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese valor de la posicion " + i + ":");
			char n = (char) in.next().charAt(0);
			X[i] = n;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("El valor de la posicion: " + i);
			System.out.println(X[i]);
		}
	}

}
