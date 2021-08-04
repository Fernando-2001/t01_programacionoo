package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare un vector x cuya longitud se solicite al usuario de tipo int y construya un programa que pida 
		//al usuario que ingrese los valores para cada posicion y finalmente que se imprima todos los valores ingresados
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la longitud de su vector: ");
		int n = in.nextInt();
		int X []=new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese valor de la posicion " + i + ":");
			int num = in.nextInt();
			X[i] = num;
		}
		for (int i = 0; i < n; i++) {
			System.out.println("El valor de la posicion: " + i);
			System.out.println(X[i]);
		}
	}

	}

