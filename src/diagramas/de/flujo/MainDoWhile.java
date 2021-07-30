package diagramas.de.flujo;

import java.util.Scanner;

public class MainDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  = new Scanner(System.in);
		int n = 0;
		int sp = 0;
		int si = 0;
		int ci = 0;
		int pi = 0;
		int si2 = 0;
		int ci2 = 0;
		do {
			System.out.println("Ingrese un numero positivo: ");
			n = in.nextInt();
			if (n%2==0){
				sp = sp+n; 
			}else {
				si = si+n;
				ci = ci+1;
			}
		}while(n != -1);
		si2 = si+1;
		ci2 = ci-1;
		pi = si2/ci2;
		System.out.println("Suma de numeros pares: "+sp);
		System.out.println("Suma de numeros impares: "+si2);
		System.out.println("Contador de numeros impares: "+ci2);
		System.out.println("Promedio de numeros impares: "+pi);

	}

}
