package centroAcademico1;

import java.util.HashSet;



public class Alumno {
	protected String numExpediente;
	private String nombre;
	HashSet<Calificacion> asignaturas = new HashSet<>();

	// getters & setters
	public String getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(String numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean checkExpediente(String numExpediente) {
		if (numExpediente.length() != 9 || !numExpediente.matches("[0-9]{8}[A-Z]")) {
			System.out.println("numExpediente incorrecto");
			return false;
		} else {
			System.out.println("numExpediente correcto");
			return true;
		}
	}

	public void mostrar() {
		System.out.println(
				"Nombre: " + nombre + "numExpediente: " + numExpediente + "\nasignaturas: " + this.asignaturas);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " numExpediente: " + numExpediente;
	}
}
