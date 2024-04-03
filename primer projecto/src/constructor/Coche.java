package constructor;

public class Coche {
 int pasajeros;
 int deposito;
 int kpl;
 
   Coche(int p, int d, int k) {
	  pasajeros= p;
	  deposito= d;
	  kpl= k;
	  
  }
   Coche (){
	   pasajeros=0;
	   deposito=0;
	   	kpl=0;
	   	
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
	void copiarCoche(int p, int dep , int kp) {
		pasajeros=p;
		deposito=dep;
		kpl= kp;
	}
	void copiarCoche(Coche c) {
		pasajeros= c.getPasajeros();
		deposito= c.getDeposito();
		kpl= c.getKpl();
	}
}

