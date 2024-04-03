package borrador;

public class Pilotos {

	
	//attributes
	
	private String nombre;
	private int dorsal;
	private double salario;
	private int indiceRRSS;
	private int tiempoClasificacion;
	//constructors
	
	public Pilotos() {
		this.salario=100000;
	}
	public Pilotos(String pNombre, int pDorsal, double pSalario, int pIndice, int pTiempo) {
		this.nombre=pNombre;
		this.dorsal=pDorsal;
		this.salario=pSalario;
		this.indiceRRSS=pIndice;
		pIndice=reguladorRRSS();
		this.tiempoClasificacion=pTiempo;
	}
	//Methods
	public int reguladorRRSS() {
		
		if(this.indiceRRSS>1 || this.indiceRRSS<10) {
			return indiceRRSS;
		}else {
			System.out.println("Alguno de los indices no esta en el parametro de valores(1-10)");
		}
		return indiceRRSS;
		
	}
	//Getters&Setters
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIndiceRRSS() {
		return indiceRRSS;
	}
	public void setIndiceRRSS(int indiceRRSS) {
		this.indiceRRSS = indiceRRSS;
	}
	public int getTiempoClasificacion() {
		return tiempoClasificacion;
	}
	public void setTiempoClasificacion(int tiempoClasificacion) {
		this.tiempoClasificacion = tiempoClasificacion;
	}
	
	//toString@Override
	public String toString() {
		return "nombre" + nombre + " dorsal " + dorsal + " salario " + salario + " indiceRRSS "
				+ indiceRRSS + "  tiempoClasificacion " + tiempoClasificacion  ;
	}


	
}
