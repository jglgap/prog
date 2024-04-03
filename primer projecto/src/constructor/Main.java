package constructor;

public class Main {

	public static void main(String[] args) {
		Coche coche1 = new Coche (5,55,18);
		System.out.println("coche1: "+ coche1.pasajeros );
		
		Coche coche2 = new Coche();
		coche2.copiarCoche(coche1.getPasajeros(), coche1.getDeposito(), coche1.getKpl());
		coche2.copiarCoche(coche1);
		System.out.println(coche2.pasajeros);
		

	}

}
