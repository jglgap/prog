package coche;

public class Coche {
	
		 int pasajeros; //número de pasajeros
		 int deposito; //capacidad del depositos en litros
		 int kpl; //kilometros que se pueden recorrer con un litro,

		 int calcularAutonomia() {
			 return deposito*kpl;
		 }
		
		
		 int Autonomia(int kilometros, int modelo) {
			 
			 System.out.println("Autonomia:"+ deposito*kpl);
			 
			return deposito*kpl;
		
		 }
	 double gasofaNecesarea(int kilometros) {
		return(double) deposito/kpl;
		 
	 }
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	public int getKpl() {
		return kpl;
	}
	public void setKpl(int kpl) {
		this.kpl = kpl;
	}
	 Coche mayorAutonomia(Coche c) {
	return  (this.calcularAutonomia()>c.calcularAutonomia())?this:c;
		
	}
}

