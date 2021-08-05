package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declare una matriz A[3,4], y desarrole un programa que vaya
		// solicitando cada una de las posicones

		Scanner in = new Scanner(System.in);

		char A[][] = new char[3][4];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				System.out.println("Ingrese una letra para el casillero: " + "[" + f + "]" + "[" + c + "]");
				char l = (char) in.next().charAt(0);
				A[f][c] = l;

			}
		}

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {

				System.out.print(A[f][c] + " ");
			}
			System.out.println();
		}

	}

}
