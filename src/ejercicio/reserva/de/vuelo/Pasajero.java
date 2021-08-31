package ejercicio.reserva.de.vuelo;

public class Pasajero {
	
	public String nomre;
	public String apellido;
	public int edad;
	
	public String getNomre() {
		return nomre;
	}
	public void setNomre(String nomre) {
		this.nomre = nomre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String toString() {
		return nomre + apellido;
	}
	
}
