package Ej4_herencia;

public class Mujer extends Persona {
	public Mujer(int edad, boolean fueMadre) {
		super(edad);
		this.fueMadre = fueMadre;
	}

	private boolean fueMadre;

	public boolean isFueMadre() {
		return fueMadre;
	}

	public void setFueMadre(boolean fueMadre) {
		this.fueMadre = fueMadre;
	}

}
