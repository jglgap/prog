package ejercicio_o.o;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//Proyecto
		Proyecto proyecto1 = new Proyecto();
		
		 try (Scanner sc = new Scanner(System.in)){ 
		System.out.println("Nombre del proyecto:");
		proyecto1.setNombre(sc.nextLine());
		System.out.println("Departameno: ");
		System.out.println("Presupuesto del proyecto:");
		System.out.println("Meses y numero de personal: ");
		proyecto1.calcularPresupuesto(sc.nextInt(), sc.nextInt());
		System.out.println("Duracion del proyecto:");
		sc.nextLine();
		proyecto1.setDuracion(sc.nextLine());
		
		}
		 
		//Cientificos
		Cientifico c1 = new Cientifico();
		c1.setNombre("Eduardo Garcia");
		c1.setEdad(35);
		c1.setDireccion("Calle 86, Nº7, piso 3D");
		
		Cientifico c2 = new Cientifico();
		c2.setNombre("Manuel Mazo");
		c2.setEdad(48);
		c2.setDireccion("Calle 13, Nº22, piso 4A");
		
		Cientifico c3 = new Cientifico();
		c3.setNombre("Daniel Bascuas");
		c3.setEdad(56);
		c3.setDireccion("Calle 44, Nº16, piso 1F");
		
		proyecto1.c1=c1;
		proyecto1.c2=c2;
		proyecto1.c3=c3;
		System.out.println(proyecto1);

	}

}
