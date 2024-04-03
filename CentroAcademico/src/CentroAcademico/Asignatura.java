package CentroAcademico;

import java.util.HashSet;

public class Asignatura {

	private String codigo;
	private String nombre;
	private String creditos;

	HashSet<Alumno> alumno = new HashSet<Alumno>();

	// getters & setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre;
	}

	public boolean checkCodigo(String codigo) {
		if (codigo.length() != 5 || !codigo.matches("^[A-Z]-\\d{3}$")) {
			System.out.println("El codigo es incorrecto");
			return false;
		} else {
			System.out.println("El codigo es correcto");
			return true;

		}

	}

	public void mostrar() {
		System.out.println("Nombre: " + this.nombre + " codigo: " + this.codigo + " creditos: " + this.creditos);
		alumno.forEach(i -> System.out.print(i + " "));
		System.out.println();
	}

}
