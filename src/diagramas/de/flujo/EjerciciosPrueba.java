package diagramas.de.flujo;

import java.util.Scanner;

public class EjerciciosPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int s = 0;
		float p = 0;
		int c = 0;
		
		for (int i = 1; i != 0; i++ ) {
			System.out.println("Ingrese un numero positivo:  ");
			int n = in.nextInt();
			if (n == 0) {
				i = -1;
			}else {
				s = s+n;
				p = s/i;
				c = c+1;
			}
		}
		System.out.println("La suma es: "+s);
		System.out.println("El producto es: "+p);
		System.out.println("El total de los numeros ingresados es: "+c);
		}
}
