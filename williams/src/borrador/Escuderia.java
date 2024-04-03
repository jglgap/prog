package borrador;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;
public class Escuderia {

	
	//attributes
	private String nombre;
	private String nacionalidad;
	private int presupuesto;
	Pilotos[] pilot= new Pilotos[2];
	Scanner teclado= new Scanner(System.in);
	
	//Constructors
	public Escuderia() {}
	public Escuderia(String pNombre,String pNacionalidad, int pPresupuesto){
		this.nombre=pNombre;
		this.nacionalidad=pNacionalidad;
		this.presupuesto=pPresupuesto;
	}
	//Getters&Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupueto(int presupueto) {
		this.presupuesto = presupueto;
	}

	
	//Methods
	public Escuderia generarEscuderia(Scanner teclado) {
		intNombre(teclado);
		intNacionalidad(teclado);
		intPresupuesto(teclado);
		crearPiloto(teclado);
		intPresupuesto(teclado);
		teclado.nextLine();
		return generarEscuderia(teclado);
	}
	public String intNombre(Scanner teclado) {
		System.out.println("Introduzca el nombre de la escuderia");
		this.nombre=teclado.nextLine();
		return nombre;
	}
	public int intPresupuesto(Scanner teclado) {
		System.out.println("Introduzca el presupuesto");
		return presupuesto ;
	}
	public String intNacionalidad(Scanner teclado) {
		System.out.println("Introduzca la nacionalidad de la escuderia");
		this.nacionalidad=teclado.nextLine();
		return nacionalidad;
	}
	public Pilotos[] crearPiloto(Scanner teclado) {
		System.out.println("Crea el primer piloto"+"\nLos datos deben ser introducidos en el siguiente orden"
				+"\n1-Nombre del piloto\t2-Dorsal del piloto\t3-Salario del piloto\t4-Indice de popularidad en Redes sociales\t5-Tiempo realizado en la clasificacion");
		this.pilot[0]= new Pilotos(teclado.nextLine(),teclado.nextInt(),teclado.nextDouble(),teclado.nextInt(),teclado.nextInt());
		System.out.println("Crea el segundo piloto"+"\nLos datos deben ser introducidos en el siguiente orden"
		+"\n1-Nombre del piloto\t2-Dorsal del piloto\t3-Salario del piloto\t4-Indice de popularidad en Redes sociales\t5-Tiempo realizado en la clasificacion");
		teclado.nextLine();
		this.pilot[1]=new Pilotos(teclado.nextLine(),teclado.nextInt(),teclado.nextDouble(),teclado.nextInt(),teclado.nextInt());
		return pilot;
		
	}
	public int calculoPresupuesto(int calculo) {
		//calculo=pilot.get;
		return calculo;
	}

	//toString
	@Override
	public String toString() {
		return "nombre" + nombre + " nacionalidad" + nacionalidad + " presupueto" + presupuesto +"\nPrimer piloto: "+this.pilot[0]+"\nSegundo Piloto"+this.pilot[1];
	} 
	
	
	
}
