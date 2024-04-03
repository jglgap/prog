package f1;

public class Piloto {

	// attributes
	protected String nombre;
	private int dorsal;
	private int salario;
	private int rrss;
	private double tiempoCalificacion;

	// Setters & Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getRrss() {
		return rrss;
	}

	public void setRrss(int rrss) {
		this.rrss = rrss;
	}

	public double getTiempoCalificacion() {
		return tiempoCalificacion;
	}

	public void setTiempoCalificacion(double tiempoCalificacion) {
		this.tiempoCalificacion = tiempoCalificacion;
	}

	// constructors
	public Piloto() {
	}

	public Piloto(String pNombre, int pDorsal, int pSalario, int pRRSS, int pTiempoCuali) {
		this.nombre = pNombre;
		this.dorsal = pDorsal;
		this.salario = pSalario;
		this.rrss = pRRSS;
		this.tiempoCalificacion = pTiempoCuali;
	}

	// toString
	@Override
	public String toString() {
		return "Nombre del piloto: " + this.nombre + " Dorsal del piloto: " + this.dorsal + " Salario del piloto: "
				+ " \n " + " Indice de popularidad del piloto: " + this.rrss + " Tiempo de cualificacion del piloto: "
				+ this.tiempoCalificacion;
	}

}
