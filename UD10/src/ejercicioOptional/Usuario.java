package ejercicioOptional;

import java.util.Scanner;

public class Usuario {

	private String nombre;
	private String ape;
	private String email;
	Scanner sc= new Scanner(System.in);
	public Usuario() {}

	public Usuario(String nombre, String ape, String email) {
		this.nombre = nombre;
		this.ape = ape;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
