package diagramasflujo;

import java.util.Scanner;

public class MainD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("ingrese dos numeros: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		if (b != 0) {
			int d = a/b;
			System.out.println("El resultado d la division es: "+d);
		}else if (b==0){
			System.out.println("esta divicion es imposible de realizar!");
		}
	}

}
