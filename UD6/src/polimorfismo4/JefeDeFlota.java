package polimorfismo4;

public class JefeDeFlota extends Tripulante {
	protected int pesoPescado;
	protected int pesoMarisco;
	final static float sueldoBase = 3500000;
	protected float bonoPescado;
	protected float bonoMarisco;
	protected float sueldoTotal;

	public JefeDeFlota(int pesoPescado, int pesoMarisco) {
		super();
		this.pesoPescado = pesoPescado;
		this.pesoMarisco = pesoMarisco;

	}

	public float calcularBonoPescado() {
		this.bonoPescado = pesoPescado * 1;
		return this.bonoPescado;
	}

	public float calcularBonoMarisco() {
		this.bonoMarisco = pesoMarisco * 2;
		return this.bonoMarisco;
	}

	@Override
	public void sueldo() {
		sueldoTotal = (float) sueldoBase + bonoPescado + bonoMarisco;
		System.out.println("Sueldo total del jefe de flota: " + sueldoTotal);

	}

	@Override
	public void mostrarDatos() {
		System.out.println("Peso del pescado: " + this.pesoPescado);
		System.out.println("Peso del marisco: " + this.pesoMarisco);
		System.out.println("Sueldo base del jefe de flota: " + this.sueldoBase);
		System.out.println("Bono por pescado: " + this.bonoPescado);
		System.out.println("Bono por marisco: " + this.bonoMarisco);
		this.sueldo();

	}

}
