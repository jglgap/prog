package This;

public class Coche {
	 int pasajeros;
	 int deposito;
	 int kpl;
	 int calcularAutonomia() {
		 return deposito*kpl;
	 }
	 
	 	Coche mayorAutonomia (Coche c) {
		  Coche cocheMayorAut = new Coche();
		  if(this.calcularAutonomia()>c.calcularAutonomia()) {
			
		    cocheMayorAut.pasajeros=this.pasajeros;
			cocheMayorAut.deposito=this.deposito;
			cocheMayorAut.kpl=this.kpl;
			 }else {
			cocheMayorAut.pasajeros=c.pasajeros;
			cocheMayorAut.deposito=c.deposito;
			cocheMayorAut.kpl=c.kpl;
			 }
			return cocheMayorAut;
			
		}
		 
	 }


	

