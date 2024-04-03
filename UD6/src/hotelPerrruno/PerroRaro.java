package hotelPerrruno;

public class PerroRaro extends Perro {

	public PerroRaro() {
		super();

	}

	public PerroRaro(String nombre, double peso, String color) {
		super(nombre, peso, color);

	}
	@Override
	public double alimentar() {
	 if(this.peso<=3.5 ) {
		peso=peso+0.7;
	 } else{
		 peso=peso+0.3;
	 }
	return this.peso;
	 
 }

	@Override
	public double pasear() {
		
		return super.pasear();
	}
	
}
