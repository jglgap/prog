package Ej3_herencia;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(String color2, double lado) {
		super(color2);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
