package sociedadCultural;

import java.util.Scanner;

public class Prestamo {
	Scanner sc= new Scanner(System.in);
 protected String fech_ini;
 protected String fech_fin;
 protected Cliente cliente;
 protected Materiales mat;
 
 

 	
 public Prestamo crearPrestamo(Cliente cliente, Materiales material) {
	 System.out.println("Introduzca fecha de inicio del prestamo");
	 this.fech_ini=sc.nextLine();
	 System.out.println("Introduzca fecha fin");
	 this.fech_fin=sc.nextLine();
	 this.cliente=cliente;
	 this.mat=material;
	 return this;
 }




@Override
public String toString() {
	return "Prestamo:" + " fech_ini: " + fech_ini + " fech_fin: " + fech_fin + " mat: " + mat ;
}
 	
}
