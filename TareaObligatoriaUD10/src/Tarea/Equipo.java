package Tarea;

import java.util.Random;

public class Equipo {
	private String nombre;
	private int puntos;
	private Participante capitan;
	Participante[] participantes;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.participantes = new Participante[5];
		seleccionarCapitan();
	}

	public Equipo() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void seleccionarCapitan() {
		Random rd= new Random();
		this.capitan=participantes[rd.nextInt(0-5)];
	}
	

}
