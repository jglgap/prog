package polimorfismo3;

public class Circulo extends Figura {
	double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public String toString() {
		return "radio: " + radio + super.toString();
	}
}
