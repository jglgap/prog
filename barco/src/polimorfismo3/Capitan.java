package polimorfismo3;

public class Capitan extends Tripulante {
	protected int horasExperiencia;
	final static float sueldoBase = 4500000;
	protected float sueldoTotal;
	protected float bono;

	public Capitan(int horasExperiencia) {
		super();
		this.horasExperiencia = horasExperiencia;

	}

	public float calcularBono() {
		if (horasExperiencia >= 5000 || horasExperiencia < 15000) {
			bono = (float) (sueldoBase * 0.20);
		} else if (horasExperiencia >= 15000 || horasExperiencia < 30000) {
			bono = (float) (sueldoBase * 0.40);
		} else if (horasExperiencia >= 30000) {
			bono = (float) (sueldoBase * 0.75);
		}
		return bono;
	}

	@Override
	public void sueldo() {

		System.out.println("Horas totales del capitan: " + (sueldoTotal = sueldoBase + bono));
	}

	@Override
	public void mostrarDatos() {
		System.out.println("horas de experiencia del capitan: " + this.horasExperiencia);
		System.out.println("Sueldo base del capitan: " + this.sueldoBase);
		System.out.println("bono del capitan: " + this.bono);
		this.sueldo();
	}

}
