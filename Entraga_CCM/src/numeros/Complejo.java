package numeros;

public class Complejo {
	private double real;
	 private double imag;
	
	//methods & constructors
	 public Complejo() {
		 this.real=0;
		 this.imag=0;
	 }
	 
	 public Complejo(double real, double imag) {
		 this.real=real;
		 this.imag=imag;
	 }
	 //getters & setters
	 
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	//toString
	 @Override
	public String toString() {
	
		return real+ " + "+ imag+"i";
	}
	 
	 //metodo
	
	 public void sumar(Complejo b ) {
		
		real+=b.real;
		imag+=b.imag;
		 
	 }
	 
	 
}
