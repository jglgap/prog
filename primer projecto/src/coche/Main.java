package coche;

public class Main{
	public static void main (String[] args){
		
	 Coche golf = new Coche();
	
	 golf.pasajeros=5;
	 System.out.println("pasajeros:"+golf.pasajeros);
	 
	 Coche megane = new Coche();
	 megane.deposito =60;
	 megane.kpl=20;
	 int km=100;
	 int calculo= megane.Autonomia(km,8);
	 System.out.println("deposito:"+megane.deposito+" litros");
	 
	 //EJERCICIO 2
	
	 Coche peugeot308 = new Coche();
	 peugeot308.pasajeros = 5;
	 peugeot308.deposito=60;
	 peugeot308.kpl=20; 
	
	 /*peugeot308.setPasajeros(6);
	 System.out.println("Pasajeros: "+ peugeot308.getPasajeros());*/
	 System.out.println("pasajeros:"+peugeot308.pasajeros);
	 System.out.println("deposito:"+peugeot308.deposito+"litros");
	 System.out.println("kpl:"+peugeot308.kpl);
	 int Km= 100;
	 int calulo=peugeot308.Autonomia(Km,3);
	 System.out.println("Para recorrer 100 km necesita:"+peugeot308.gasofaNecesarea(100));
	 
	 System.out.println("Tiene coche1 mas autonomia que coche 2?"+ peugeot308.mayorAutonomia(megane));
	}	
}

