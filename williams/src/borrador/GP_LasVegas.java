package borrador;

import java.util.Scanner;

public class GP_LasVegas {
	
	//attributes
	private String nombre="Gran Premio de Las Vegas";
	Escuderia[] parrilla = new Escuderia[3];
	Escuderia esc= new Escuderia();
	private String fecha="31-0-5";
	Scanner entrada= new Scanner (System.in);
	//Constructor
	public GP_LasVegas() {}
	public GP_LasVegas(String pNombre,String pFecha) {
		this.nombre=pNombre;
		this.fecha=pFecha;
	}
	//getter&Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Escuderia[] getParrilla() {
		return parrilla;
	}
	public void setParrilla(Escuderia[] parrilla) {
		this.parrilla = parrilla;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	//Methods
	public Escuderia[] creacionParticipantes(Scanner entrada) {
		
			
			this.parrilla[0]=esc.generarEscuderia(entrada);
			System.out.println("Introduzca el segundo participante");
			this.parrilla[1]=esc.generarEscuderia(entrada);
			 System.out.println("Introduzca el tercer participante");
			this.parrilla[2]=esc.generarEscuderia(entrada);
	
		return parrilla;
	}
	//toString()
	@Override
	public String toString() {
		return "Nombre del Premio: "+ nombre+ "Fecha: "+ fecha + "Escuderias que participan: "+this.parrilla[0]+"\n"+this.parrilla[1]+"\n"+this.parrilla[2];
	}
	
}
