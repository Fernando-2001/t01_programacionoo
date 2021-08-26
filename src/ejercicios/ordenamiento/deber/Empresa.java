package ejercicios.ordenamiento.deber;

import java.util.Arrays;

public class Empresa {
	
	public static void main(String[] args) {
		
		Empleado pedro = new Empleado ();
		pedro.setNombre("Pedro");
		pedro.setApellido("Arboleda");
		pedro.setEdad(30);
		pedro.setSalario(700);
		
		Empleado luis = new Empleado ();
		luis.setNombre("Luis");
		luis.setApellido("Caicedo");
		luis.setEdad(33);
		luis.setSalario(450);
		
		Empleado fernando = new Empleado ();
		fernando.setNombre("Fernando");
		fernando.setApellido("Diaz");
		fernando.setEdad(28);
		fernando.setSalario(1200);
		
		Empleado orlando = new Empleado ();
		orlando.setNombre("Orlando");
		orlando.setApellido("Molina");
		orlando.setEdad(45);
		orlando.setSalario(950);
		
		Empleado alvaro = new Empleado ();
		alvaro.setNombre("Alvaro");
		alvaro.setApellido("Medina");
		alvaro.setEdad(25);
		alvaro.setSalario(400);
		
		Empleado hector = new Empleado ();
		hector.setNombre("Hector");
		hector.setApellido("Olivares");
		hector.setEdad(41);
		hector.setSalario(875);
		
		Empleado jose = new Empleado ();
		jose.setNombre("Jose");
		jose.setApellido("Gaviera");
		jose.setEdad(30);
		jose.setSalario(720);
		
		Empleado maria = new Empleado ();
		maria.setNombre("Maria");
		maria.setApellido("Guerrero");
		maria.setEdad(39);
		maria.setSalario(805);
		
		Empleado sofia = new Empleado ();
		sofia.setNombre("Sofia");
		sofia.setApellido("Haro");
		sofia.setEdad(53);
		sofia.setSalario(1150);
		
		Empleado caro = new Empleado ();
		caro.setNombre("Carolina");
		caro.setApellido("Mero");
		caro.setEdad(29);
		caro.setSalario(930);
		
		Empleado listaEmpleados [] = new Empleado [10];
		listaEmpleados[0]= pedro;
		listaEmpleados[1]= luis;
	    listaEmpleados[2]= fernando;
	    listaEmpleados[3]= orlando;
	    listaEmpleados[4]= alvaro;
	    listaEmpleados[5]= hector;
	    listaEmpleados[6]= jose;
	    listaEmpleados[7]= maria;
	    listaEmpleados[8]= sofia;
	   	listaEmpleados[9]= caro;
		
		System.out.println("Empleados antes de ordenar");
		System.out.println(Arrays.toString(listaEmpleados));

		Arrays.sort(listaEmpleados);
		System.out.println("Empleados despues de ordenar");
		System.out.println(Arrays.toString(listaEmpleados));
	}
}
