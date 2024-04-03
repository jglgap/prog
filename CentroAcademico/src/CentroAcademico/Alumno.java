package CentroAcademico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Alumno {
	protected String numExpediente;
	private String nombre;
	HashSet<Asignatura> asignaturas = new HashSet<>();
	ArrayList<Calificacion> calificaion= new ArrayList<>();
	double media;
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

	
	public void mostrarCalif() {
		System.out.println("Nombre: " + nombre + "numExpediente: " + numExpediente+ this.calificaion+"\nNota media= "+this.media);
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + " numExpediente: " + numExpediente;
	}

	
	public double calcularNotaMedia() {
		double cont=0;
		for(int x=0;x<this.calificaion.size();x++) {
		cont= cont +this.calificaion.get(x).getNota();
		}
		double media=0.0;
		this.media= cont/this.calificaion.size();
		
		return this.media;
	}



}
