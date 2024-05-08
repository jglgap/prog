package Tarea;

import java.util.Arrays;
import java.util.Random;

public class Equipo {
	private String nombre;
	private int puntos;
	private Participante capitan;
	Participante[] participantes;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.participantes = new Participante[5];
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
		for(int i=0;i<participantes.length;i++) {
			if(participantes[i]==null) {
				this.capitan=null;
				
			}else {
			this.capitan=participantes[rd.nextInt(0,5)];
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + " puntos: " + puntos + " capitan: " + capitan + " participantes "
				+ Arrays.toString(participantes);
	}

	public static void main(String[] args) {
		Equipo e = new Equipo("Rojo");
		Participante p= new Participante("Bernardo","Ortoñez","M",15);
		e.participantes[0]=p;
		e.participantes[1]=p;
		e.participantes[2]=p;
		e.participantes[3]=p;
		e.participantes[4]=p;
		e.seleccionarCapitan();
		System.out.println(e);
	}

}
