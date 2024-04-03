package pokemon;

import java.util.Random;
import java.util.Scanner;

public class Pokemon {

	// attributes
	private String nombre;
	String tipo;
	int vidaMaxima = 100;
	final int vida=100;
	int nivel = 1;

	// methods
	public void sanarTotalmente() {
		this.vidaMaxima=this.vida;
	}

	public int tomarPocion(int vida) {
		if (vidaMaxima < 100) {
			vida = 20;
			vidaMaxima = vidaMaxima + vida;
		} else {
			System.out.println("La vida esta al maximo");
		}
		return vidaMaxima;
	}

	public int reducirVida(int cantidad) {
		if (vidaMaxima <= 100) {
			vidaMaxima = vidaMaxima - cantidad;
		}
		return vidaMaxima;
	}

	public void mostrarDatos() {
		System.out.println("nombre: " + nombre + " tipo: " + tipo + ": vidaMaxima: " + vidaMaxima + " nivel: " + nivel);
	}

	public float tomarPocion(float porcentaje) {
		if (vidaMaxima < 100) {
			porcentaje = vidaMaxima + (vidaMaxima * 20 / vidaMaxima);
		} else {
			System.out.println("La vida esta al maximo");
		}
		return porcentaje;

	}

	public void asignarPokemonfusion() {
		System.out.println("La fusion no esta disponible en esta vesion del juego!");
	}
	public void generar() {
		
		Scanner scan = new Scanner(System.in);
		this.nombre = scan.nextLine();
		this.vidaMaxima = this.vidaMaxima;
		Random random = new Random();
		switch (random.nextInt(0, 10)) {
			case 0, 1, 2:
				this.tipo = "Squirtle";
				break;
			case 3, 4, 5:
				this.tipo = "Charmander";
				break;
			case 6, 7, 8:
				this.tipo = "Bulbasur";
				break;
			case 9:
				this.tipo = "Pikachu";
				break;
		}
		this.nivel = this.nivel;

	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + " tipo: " + tipo + ": vidaMaxima: " + vidaMaxima + " nivel: " + nivel ;
	}

}
