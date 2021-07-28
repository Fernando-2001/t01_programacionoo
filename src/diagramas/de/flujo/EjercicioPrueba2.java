package diagramas.de.flujo;

import java.util.Scanner;

public class EjercicioPrueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int sp = 0;
		int si = 0;
		int ci = 0;
		int pi = 0;
		
		for (int i = 1; i != -1; i++ ) {
			System.out.println("Ingrese un numero positivo:  ");
			int n = in.nextInt();
			if (n == -1) {
				i = -2;
			}else if (n%2==0){
				sp = sp+n; 
			}else {
				si = si+n;
				ci = ci +1;
				pi = si/ci;
			}
			
		}
		System.out.println("Suma de numeros pares: "+sp);
		System.out.println("Suma de numeros impares: "+si);
		System.out.println("contador impares: "+ci);
		System.out.println("producto de numesros impares: "+pi);

	}

}
