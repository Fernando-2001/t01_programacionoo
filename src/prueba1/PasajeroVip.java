package prueba1;

public class PasajeroVip extends Pasajero {
	
	private String codigoMembresia;

	public PasajeroVip(String nombre, String apellido, String codigoMembresia2, int edad) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.codigoMembresia= codigoMembresia;
	}

	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}
	public String tostring () {
		return "PasajeroVip" + this.nombre+"[codigoMembresia" + codigoMembresia+"]";
	}
	
}
