package Bici;

public class Main {

	public static void main(String[] args) {
		Bicicleta bicicleta1= new Bicicleta();
		Bicicleta bicicleta2= new Bicicleta();
		
		bicicleta1.acelerar(10);
		bicicleta1.cambiarMarcha(2);
		bicicleta1.imprimirEstado();
		bicicleta2.acelerar(10);
		bicicleta2.cambiarMarcha(2);
		 bicicleta2.acelerar(10);
		 bicicleta2.cambiarMarcha(3);
		 bicicleta2.imprimirEstado();
	
		 //bicicleta1.setV(15);
		 //System.out.println("velocidad: "+ bicicleta1.getV());
		// Bicicleta bici3 = new Bicicleta();
		// System.out.println(bici3.marcha);
	}

}
