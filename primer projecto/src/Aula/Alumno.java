package Aula;

public class Alumno {
	String DNI;
	int edad;
	String nombre;
	Ordenador ord;
	int curso;
	Ciclos ciclo;

	public String toString() {
		return "Nombre: "+nombre+" DNI: "+DNI+" Edad: "+edad+ " Ordenador: "+ord+" Ciclo: "+ciclo+" Curso:"+curso;
	}
}
