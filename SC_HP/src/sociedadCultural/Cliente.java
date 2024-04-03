package sociedadCultural;

import java.util.Scanner;

public class Cliente {
	protected String dni;
	protected String nombre;
	protected Prestamo prestamo;
	protected Prestamo [] prestamoLibros= new Prestamo[3];
	protected Prestamo [] prestamoDiscos= new Prestamo[3];
	Scanner scr = new Scanner(System.in);

	public void altaCliente() {
		System.out.println("Introduzca nombre: ");
		this.setNombre(scr.nextLine());
		System.out.println("Introduzca DNI: ");
		this.setDni(scr.nextLine());
	}

	
	public void	consultarPrestamos(String Dni) {
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Cliente dni: " + dni + " nombre:" + nombre ;
	}


}
