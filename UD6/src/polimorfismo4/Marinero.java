package polimorfismo4;

public class Marinero extends Tripulante {
	protected int pesoTotalPescado;
	final static float sueldoBase = 90000;
	protected float sueldoTotal;
	protected float bono;

	public Marinero(int pesoTotalPescado) {
		super();
		this.pesoTotalPescado = pesoTotalPescado;

	}

	public float calcularBono() {
		if (pesoTotalPescado >= 1) {
			bono = (float) (pesoTotalPescado * 0.25);
		}
		return bono;
	}

	@Override
	public void sueldo() {
		System.out.println("Sueldo total del marinero: " + (sueldoTotal = sueldoBase + bono));
		;

	}

	@Override
	public void mostrarDatos() {
		System.out.println("Peso total del pescado: " + this.pesoTotalPescado);
		System.out.println("Sueldo base del marinero: " + this.sueldoBase);
		System.out.println("Bono del marinero: " + this.bono);
		this.sueldo();
	}

}
