package juego.ajedrez;

import java.util.Arrays;

public class TableroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rey reyN = new Rey ();
		reyN.setColor("N");
		reyN.setNombre("Rey");
		
		Rey reyB = new Rey ();
		reyB.setColor("B");
		reyB.setNombre("Rey");
		
		Reina reinaN = new Reina();
		reinaN.setColor("N");
		reinaN.setNombre("Reina");
		
		Reina reinaB = new Reina();
		reinaB.setColor("B");
		reinaB.setNombre("Reina");
		
		Torre torreN1 = new Torre();
		torreN1.setColor("N");
		torreN1.setNombre("Torre");
		
		Torre torreN2 = new Torre();
		torreN2.setColor("N");
		torreN2.setNombre("Torre2");
		
		Torre torreB1 = new Torre();
		torreB1.setColor("B");
		torreB1.setNombre("Torre");
		
		Torre torreB2 = new Torre();
		torreB2.setColor("B");
		torreB2.setNombre("Torre2");
		
		Alfil alfilN1 = new Alfil();
		alfilN1.setColor("N");
		alfilN1.setNombre("Alfil");
		
		Alfil alfilN2 = new Alfil();
		alfilN2.setColor("N");
		alfilN2.setNombre("Alfil2");
		
		Alfil alfilB1 = new Alfil();
		alfilB1.setColor("B");
		alfilB1.setNombre("Alfil");
		
		Alfil alfilB2 = new Alfil();
		alfilB2.setColor("B");
		alfilB2.setNombre("Alfil2");
		
		Caballo caballoN1 = new Caballo ();
		caballoN1.setColor("N");
		caballoN1.setNombre("Caballo");
		
		Caballo caballoN2 = new Caballo ();
		caballoN2.setColor("N");
		caballoN2.setNombre("Caballo2");
		
		Caballo caballoB1 = new Caballo ();
		caballoB1.setColor("B");
		caballoB1.setNombre("Caballo");
		
		Caballo caballoB2 = new Caballo ();
		caballoB2.setColor("B");
		caballoB2.setNombre("Caballo2");
		
		Peon peonN1 = new Peon ();
		peonN1.setColor("N");
		peonN1.setNombre("Peon");
		
		Peon peonN2 = new Peon ();
		peonN2.setColor("N");
		peonN2.setNombre("Peon2");
		
		Peon peonN3 = new Peon ();
		peonN3.setColor("N");
		peonN3.setNombre("Peon3");
		
		Peon peonN4 = new Peon ();
		peonN4.setColor("N");
		peonN4.setNombre("Peon4");
		
		Peon peonN5 = new Peon ();
		peonN5.setColor("N");
		peonN5.setNombre("Peon5");
		
		Peon peonN6 = new Peon ();
		peonN6.setColor("N");
		peonN6.setNombre("Peon6");
		
		Peon peonN7 = new Peon ();
		peonN7.setColor("N");
		peonN7.setNombre("Peon7");
		
		Peon peonN8 = new Peon ();
		peonN8.setColor("N");
		peonN8.setNombre("Peon8");
		
		Peon peonB1 = new Peon ();
		peonB1.setColor("B");
		peonB1.setNombre("Peon");
		
		Peon peonB2 = new Peon ();
		peonB2.setColor("B");
		peonB2.setNombre("Peon2");
		
		Peon peonB3 = new Peon ();
		peonB3.setColor("B");
		peonB3.setNombre("Peon3");
		
		Peon peonB4 = new Peon ();
		peonB4.setColor("B");
		peonB4.setNombre("Peon4");
		
		Peon peonB5 = new Peon ();
		peonB5.setColor("B");
		peonB5.setNombre("Peon5");
		
		Peon peonB6 = new Peon ();
		peonB6.setColor("B");
		peonB6.setNombre("Peon6");
		
		Peon peonB7 = new Peon ();
		peonB7.setColor("B");
		peonB7.setNombre("Peon7");
		
		Peon peonB8 = new Peon ();
		peonB8.setColor("B");
		peonB8.setNombre("Peon8");
		
		Piezas pieza[][] = new Piezas[8][8];
		pieza[0][0]= torreN1;
		pieza[0][1]= caballoN1;
		pieza[0][2]= alfilN1;  
		pieza[0][3]= reinaN; 
		pieza[0][4]= reyN;
		pieza[0][5]= alfilN2;							
		pieza[0][6]= caballoN2;
		pieza[0][7]= torreN2; 
		pieza[1][0]= peonN1;
		pieza[1][1]= peonN2;
		pieza[1][2]= peonN3;
		pieza[1][3]= peonN4;
		pieza[1][4]= peonN5;
		pieza[1][5]= peonN6;
		pieza[1][6]= peonN7;
		pieza[1][7]= peonN8;
		
		pieza[7][0]= torreB1; 
		pieza[7][1]= caballoB1;
		pieza[7][2]= alfilB1;  
		pieza[7][3]= reinaB; 
		pieza[7][4]= reyB;
		pieza[7][5]= alfilB2;							
		pieza[7][6]= caballoB2;
		pieza[7][7]= torreB2; 
		pieza[6][0]= peonB1;
		pieza[6][1]= peonB2;
		pieza[6][2]= peonB3;
		pieza[6][3]= peonB4;
		pieza[6][4]= peonB5;
		pieza[6][5]= peonB6;
		pieza[6][6]= peonB7;
		pieza[6][7]= peonB8;	
		
		System.out.println("----------TABLERO DE AJEDREZ----------");
		for (int f = 0; f < 8; f++) {
			for (int c = 0; c < 8; c++) {
				System.out.print(pieza[f][c] + " ");
			}
			System.out.println();
		}
	}

}
