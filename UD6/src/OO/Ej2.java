package OO;

public class Ej2 {

	static double consumoTotal=0;
	static double consumo() {
		return consumoTotal;
	}
	private double potencia;
	private boolean encendido;
	
	public Ej2(double potencia) {
		this.potencia=potencia;
		encendido=false;
	}
	void enciende() {
		if(!encendido) {
			encendido=true;
			consumoTotal+=potencia;
		}
	}
	
	void apagar() {
		if(encendido) {
			encendido=false;
			consumoTotal-=potencia;
		}
	}
	
}
