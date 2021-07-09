package diagramasflujo;

import java.util.Scanner;

public class MainD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Ingrese dos numeros: ");
		int a= in.nextInt();
		int b =in.nextInt();
		
		if (a%b==0) {
			System.out.println(a+" es multiplo de "+b);
		}else {
			System.out.println(a+ " no es multiplo de "+b);
		}

	}

}
