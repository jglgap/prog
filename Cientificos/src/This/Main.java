package This;

public class Main {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		c1.setRadio(4);
		c1.setCoordenadaX(2);
		c1.setCoordenadaY(1);
		c2.setRadio(6);
		c2.setCoordenadaX(3);
		c2.setCoordenadaY(-1);
		
	Circulo circuloGrande = c1.elMayor(c2);
	System.out.println("el circulo maor:");
	System.out.println("\t coordenadasX:"+ circuloGrande.getCoordenadaX());
	System.out.println("\t coordenadasY: "+ circuloGrande.getCoordenadaY());
	System.out.println("\t radio:"+ circuloGrande.getRadio());
	}

}
