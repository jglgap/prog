package composicionDeClases;

public class Circulo {

	private int radio;
	Punto centro;

	public Circulo() {
	}

	public Circulo(Punto centro, int radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String toString() {
		return "Centro:" + this.centro + "\n" + "radio: " + this.radio;
	}

}
