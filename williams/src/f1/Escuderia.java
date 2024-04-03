package f1;

import java.util.Scanner;

public class Escuderia {

	// attributes
	private String nombre;
	private String nacionalidad;
	private int presuesto;
	Piloto[] pilotos = new Piloto[2];

	// Scanner
	Scanner entrada = new Scanner(System.in);

	// Setters & Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getPresuesto() {
		return presuesto;
	}

	public void setPresuesto(int presuesto) {
		this.presuesto = presuesto;
	}

	// constructors
	public Escuderia() {
	}

	public Escuderia(String pNombre, String pNacionalidad, int pPresupuesto) {
		this.nombre = pNombre;
		this.nacionalidad = pNacionalidad;
		this.presuesto = pPresupuesto;
	}

	// Method
	public void alta(Scanner entrada) {

	
		pilotos[0] = new Piloto();
		System.out.println("Introducir nombre de la escuderia");
		this.setNombre(entrada.nextLine());
		System.out.println("Introducir nacionalidad de la escuderia");
		this.setNacionalidad(entrada.nextLine());
		System.out.println("Introduzca nombre del piloto");
		pilotos[0].setNombre(entrada.nextLine());
		System.out.println("Introduzca dorsal del piloto");
		pilotos[0].setDorsal(entrada.nextInt());
		System.out.println("Introducir salario del piloto");
		pilotos[0].setSalario(entrada.nextInt());
		System.out.println("Introducir indice de popularidad");
		pilotos[0].setRrss(entrada.nextInt());
		System.out.println("Introducir tiempo de clasificaion");
		pilotos[0].setTiempoCalificacion(entrada.nextDouble());

	}

	// toString
	@Override
	public String toString() {
		return "Nombre de la escuderia: " + this.nombre + " Nacinalidad de la escuderia: " + this.nacionalidad + "\n"
				+ " Presupuesto de la escuderia: " + this.presuesto + " Primer piloto: " + pilotos[0]
				+ " Segundo piloto: " + pilotos[1];
	}
}
