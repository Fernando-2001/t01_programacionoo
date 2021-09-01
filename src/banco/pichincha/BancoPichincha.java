package banco.pichincha;

import java.util.Scanner;

public class BancoPichincha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op = 0;
		do {
		System.out.println("***Banco Del Pichincha*** ");
		System.out.println("1. Retirar dinero");
		System.out.println("2. Cambiar de clave");
		System.out.println("3. Bloquear cuenta");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opcion:");
		
		Scanner in = new Scanner(System.in);
		op = in.nextInt();
			
		if (op==1) {
			System.out.print("Ingrese valor a retirar: ");
			int v = in.nextInt();
			System.out.println("El valor a retirar es: "+v);
			System.out.println();
			System.out.println();
		}else if(op==2) {
			System.out.print("Ingrese nueva clave: ");
			String c = in.next();
			System.out.println("Su clave ha sido cambiada");
			System.out.println();
			System.out.println();
		}else if(op==3) {
			System.out.println("Su cuenta ha sido bloqueada");
			System.out.println();
		}else if (op>4){
			System.out.println("Opcion incorrecta vuelva a intentarlo");
			System.out.println();
			System.out.println();
		}
	
		}while(op!=4);
		System.out.println("Gracias, vuela pronto");
	}
}
