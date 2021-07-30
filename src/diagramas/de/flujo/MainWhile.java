package diagramas.de.flujo;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner in = new Scanner(System.in);
		int s = 0;
		float p = 0; 
		int c = 0;
		int s2 = 0;
		int s3 = 0;
		System.out.println("ingrese un numero positivo: ");
		int n = in.nextInt();
		s = s+n;
		while (n != 0 ) {
			System.out.println("ingrese un numero positivo: ");
			n = in.nextInt();
			
			s2 = s2+n; 
			c = c+1;
			s3 = s+s2;
			p = s3/c;
			
		}
		System.out.println("la suma es: "+s3);
		System.out.println("la cantidad de numeros que ingreso es de: "+c);
		System.out.println("el promedio es de: "+p);
	}

}
