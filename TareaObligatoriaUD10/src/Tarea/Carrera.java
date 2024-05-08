package Tarea;

import java.util.HashSet;

public class Carrera {
	private String nombre;
	private String date;
	private int km;
	HashSet <Equipo> equiposParticipantes;
	
	public Carrera(String nombre, String date, int km) {
		super();
		this.nombre = nombre;
		this.date = date;
		this.km = km;
		this.equiposParticipantes= new HashSet<>();
	}

	public Carrera() {}
	
	public void darDeALta() {
		Equipo temp= new Equipo();
		if(equiposParticipantes.contains(temp)) {
			System.out.println("Ya esta el equipo en la carrera");
		}else {
			equiposParticipantes.add(temp);
		}
	}
	
	
}
