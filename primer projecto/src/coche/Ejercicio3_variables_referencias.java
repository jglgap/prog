package coche;

public class Ejercicio3_variables_referencias {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		 coche1.pasajeros=5;
		 coche1.deposito=60;
		 coche1.kpl=20;

		 Coche coche2 = new Coche();
		 coche2.pasajeros=5;
		 coche2.deposito=60;
		 coche2.kpl=20;

		 Coche coche3=coche1;
		 boolean b= (coche1== coche2);
		 boolean b2=(coche1==coche3);
		 System.out.println("coche1==coche2?"+b);
		 System.out.print("coche1==coche3?"+b2);
	}

}
