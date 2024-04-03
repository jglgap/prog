package hotelPerrruno;

public class Perro {
	// attributes
	private String nombre;
	protected double peso;
	private String color;

	// Constructors
	public Perro() {

	}

	public Perro(String nombre, double peso, String color) {

		this.nombre = nombre;
		this.peso = peso;
		this.color = color;
	}

	// Getters&Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double alimentar() {
		this.peso = peso + 0.5;
		return this.peso;
	}

	public double pasear() {
		this.peso = peso - 0.5;
		return this.peso;
	}

	public Perro registrar() {
		this.getNombre();
		this.getPeso();
		this.getColor();
		return this;

	}

	@Override
	public String toString() {
		return "Nombre del perro: " + this.nombre + " Peso: " + this.peso + " Color: " + this.color;
	}

}
