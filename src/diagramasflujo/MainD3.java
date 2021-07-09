package diagramasflujo;

import java.util.Scanner;

public class MainD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner (System.in);
		
		System.out.println("Ingrese su sueldo: ");
		int s = in.nextInt();
		
		if (s<300) {
			int b = 100;
			int t = s+b;
			System.out.println("su sueldo es de: "+s+" su bonificacion recibida es de: "+b);
			System.out.println("su sueldo total es de: "+t);
		}else if(s<300 || s<400) {
			int b = 75;
			int t = s+b;
			System.out.println("su sueldo es de: "+s+" su bonificacion recibida es de: "+b);
			System.out.println("su sueldo total es de: "+t);
		}else {
			int b = 50;
			int t = s+b;
			System.out.println("su sueldo es de: "+s+" su bonificacion recibida es de: "+b);
			System.out.println("su sueldo total es de: "+t);
		}

	}

}
