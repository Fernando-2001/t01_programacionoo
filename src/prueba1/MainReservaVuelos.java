package prueba1;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecladoInt=new Scanner(System.in);
		Scanner tecladoString=new Scanner(System.in);
		System.out.println("Ingrese informacion del pasajero");
		System.out.println("Ingrese nombre");
		String nombre=tecladoString.nextLine();
		System.out.println("Ingrese apellido");
		String apellido=tecladoString.nextLine();
		System.out.println("Ingrese edad");
		int edad=tecladoInt.nextInt();
		System.out.println("que tipo de pasajero es: 1:pasajeroVip: 2:pasajero eco");
		int opcion=tecladoInt.nextInt();
		
		String membresia="";
		String descuento="";
		if(opcion==1) {
			System.out.println("ingresse codigo memebresia");
			membresia=tecladoString.nextLine();
		}else {
			System.out.println("ingrese codigo descuento:");
			descuento=tecladoString.nextLine();
		}
		
		PasajeroVip pasajero1=new PasajeroVip(membresia, apellido, nombre, edad);
		pasajero1.setNombre(nombre);
		pasajero1.setApellido(apellido);
		pasajero1.setCodigoMembresia(membresia);
		pasajero1.setEdad(edad);
		
		PasajeroVip pasajero2=new PasajeroVip("Javier","cruz","hhgsj",30);
		
		PasajeroEconomico pasajeroEconomico1=new PasajeroEconomico ();
		 pasajeroEconomico1.setNombre(nombre);
		 pasajeroEconomico1.setApellido(apellido);
		 pasajeroEconomico1.setCodigoDescuento(descuento);
		 pasajeroEconomico1.setEdad(edad);
		
		 PasajeroEconomico pasajeroEconomico2=new PasajeroEconomico ();
		 pasajeroEconomico2.setNombre("Edison");
		 pasajeroEconomico2.setApellido("Cayambe");
		 pasajeroEconomico2.setCodigoDescuento("hsdjcss");
		 pasajeroEconomico2.setEdad(20);
		 
		Pasajero[][] asientos=new Pasajero[4][5];
		asientos [0][0]= pasajero1;
		asientos [0][1]= pasajero2;
		asientos [0][2]=  pasajeroEconomico1;
		asientos [3][2]=  pasajeroEconomico2;
		
		
		int  opcionSalir=0;
		do {
		System.out.println("ingrese datos del asiento, 0 continuar , -1 salir");
		 opcionSalir=tecladoInt.nextInt();
		if( opcionSalir==0) {
		System.out.println("ingrese fila del asiento");
		int fila=tecladoInt.nextInt();
		System.out.println("ingrese columna del siento");
		int columna=tecladoInt.nextInt();
		System.out.println("los datos del pasajero son");
		System.out.println(asientos[fila][columna]);
		}else if(  opcionSalir==-1) {
			System.out.println("salir de sistema");
		}
	}while(opcionSalir !=-1);
			
		}
	}
