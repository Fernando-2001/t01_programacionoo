package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. Desarrollar un programa que imprima la siguiente imagen

		int M[][] = new int[5][5];

		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 5; c++) {
				if (f == c) {
					M[f][c] = 1;
				} else {
					M[f][c] = 0;
				}
				System.out.print(M[f][c] + " ");
			}
			System.out.println();
		}

	}

}
