package diagramasflujo;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese su sueldo: ");
		int s = in.nextInt();
		
		if(s<300) {
			int b = 40;
			System.out.println("Su bonificacion de de: "+b);
		}else {
			int b = 0;
			System.out.println("Su bonificacion de de: "+b);
		}
		
      
	}

}
