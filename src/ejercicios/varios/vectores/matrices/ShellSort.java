package ejercicios.varios.vectores.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el n?mero de elementos: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Ingrese los valores del arreglo: ");
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();

		}
		/*
		 * shell(A); System.out.println("----------Salida del vector----------"); for
		 * (int i=0; i<n; i++) { System.out.println("El valor de la posicion: " + i);
		 * System.out.println(A[i]);}
		 */

		System.out.println("Ordenamiento de JAVA");
		System.out.println("El vector antes de oredenar: " + Arrays.toString(A));

		Arrays.sort(A);

		System.out.println("El vector despues de oredenar: " + Arrays.toString(A));

	}
	/*
	 * private static void shell(int[] a) { int salto = 0,temp = 0, i=0; boolean
	 * cambio; for (salto = a.length/2; salto!= 0; salto /=2) { cambio= true; while
	 * (cambio) { cambio=false; for(i=salto; i<a.length;i++) { if (a[i-salto]>a[i])
	 * { temp = a[i]; a [i]=a[i-salto]; a [i-salto]=temp; cambio=true; } } } } }
	 */

}
