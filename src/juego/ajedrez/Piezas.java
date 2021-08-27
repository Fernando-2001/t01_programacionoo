package juego.ajedrez;

public class Piezas {
	
	public String color;
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String toString() {
		return nombre+color;
	}
}
