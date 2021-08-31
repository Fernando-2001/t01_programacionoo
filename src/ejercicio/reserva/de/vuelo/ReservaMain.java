package ejercicio.reserva.de.vuelo;

import java.util.Scanner;

public class ReservaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PasajeroVip A1 = new PasajeroVip();
		A1.setNomre("A");
		A1.setApellido("1");
		A1.setEdad(19);
		
		PasajeroVip B2 = new PasajeroVip();
		B2.setNomre("B");
		B2.setApellido("2");
		B2.setEdad(20);
		
		PasajeroVip C3 = new PasajeroVip();
		C3.setNomre("C");
		C3.setApellido("3");
		C3.setEdad(19);
		
		PasajeroVip D4 = new PasajeroVip();
		D4.setNomre("D");
		D4.setApellido("4");
		D4.setEdad(28);
		
		PasajeroVip E5 = new PasajeroVip();
		E5.setNomre("E");
		E5.setApellido("5");
		E5.setEdad(30);
		
		PasajeroVip F6 = new PasajeroVip();
		F6.setNomre("F");
		F6.setApellido("6");
		F6.setEdad(37);
		
		PasajeroVip G7 = new PasajeroVip();
		G7.setNomre("G");
		G7.setApellido("7");
		G7.setEdad(18);
		
		PasajeroVip H8 = new PasajeroVip();
		H8.setNomre("H");
		H8.setApellido("8");
		H8.setEdad(27);
		
		PasajeroVip I9 = new PasajeroVip();
		I9.setNomre("I");
		I9.setApellido("9");
		I9.setEdad(48);
		
		PasajeroVip J10 = new PasajeroVip();
		J10.setNomre("J");
		J10.setApellido("10");
		J10.setEdad(59);
		
		///////////////////////////////////////////////
		
		PasajeroEconomico K11 = new PasajeroEconomico();
		K11.setNomre("K");
		K11.setApellido("11");
		K11.setEdad(33);
		
		PasajeroEconomico L12 = new PasajeroEconomico();
		L12.setNomre("L");
		L12.setApellido("12");
		L12.setEdad(35);
		
		PasajeroEconomico N13 = new PasajeroEconomico();
		N13.setNomre("N");
		N13.setApellido("13");
		N13.setEdad(63);
		
		PasajeroEconomico O14 = new PasajeroEconomico();
		O14.setNomre("O");
		O14.setApellido("14");
		O14.setEdad(55);
		
		PasajeroEconomico P15 = new PasajeroEconomico();
		P15.setNomre("P");
		P15.setApellido("15");
		P15.setEdad(38);
		
		PasajeroEconomico Q16 = new PasajeroEconomico();
		Q16.setNomre("O");
		Q16.setApellido("16");
		Q16.setEdad(48);
		
		PasajeroEconomico R17 = new PasajeroEconomico();
		R17.setNomre("R");
		R17.setApellido("17");
		R17.setEdad(28);
		
		PasajeroEconomico S18 = new PasajeroEconomico();
		S18.setNomre("S");
		S18.setApellido("18");
		S18.setEdad(20);
		
		PasajeroEconomico T19 = new PasajeroEconomico();
		T19.setNomre("T");
		T19.setApellido("19");
		T19.setEdad(53);
		
		PasajeroEconomico U20 = new PasajeroEconomico();
		U20.setNomre("U");
		U20.setApellido("20");
		U20.setEdad(31);
		
		Pasajero pasajero[][] = new Pasajero[4][5];
		pasajero [0][0] = A1;
		pasajero [0][1] = B2;
		pasajero [0][2] = C3;
		pasajero [0][3] = D4;
		pasajero [0][4] = E5;
		
		pasajero [3][0] = F6;
		pasajero [3][1] = G7;
		pasajero [3][2] = H8;
		pasajero [3][3] = I9;
		pasajero [3][4] = J10;
		
		
		pasajero [1][0] = K11;
		pasajero [1][1] = L12;
		pasajero [1][2] = N13;
		pasajero [1][3] = O14;
		pasajero [1][4] = P15;
		
		pasajero [2][0] = Q16;
		pasajero [2][1] = R17;
		pasajero [2][2] = S18;
		pasajero [2][3] = T19;
		pasajero [2][4] = U20;
		
		System.out.println("----------reserva de vuelo----------");
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(pasajero[f][c] + " ");
			}
			System.out.println();
		}
	
		System.out.println("Ingrese el asiento: ");
		Scanner in = new Scanner(System.in);
		System.out.println("N fila");
		int fila = in.nextInt();
		System.out.println("N columna");
		int columna = in.nextInt();
		
		System.out.println("El asiento de "+ pasajero);
		
		
	}

}
