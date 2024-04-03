package collections;

public class Ej1Personas {
	String nombre;
	String numTelef;
	public Ej1Personas(String nombre, String numTelef) {

		this.nombre = nombre;
		this.numTelef = numTelef;
	}
	@Override
	public String toString() {
		return "nombre:" + nombre + " numTelef: " + numTelef +"\n";
	}

	
}
