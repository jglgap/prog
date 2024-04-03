package ejercicio_o.o;

public class Proyecto {
	
	//Atributos
	private String nombre;
	private enum departamento {Marketing , Investigacion, Informatica};
	
	private double presupuesto;
	private String duracion;
	 Cientifico c1;
	 Cientifico c2;
	 Cientifico  c3;
	
	
	//constructor
	
	



//metodo
double calcularPresupuesto (int meses, int num_empleados) {

		presupuesto= meses*num_empleados*5000;
		return presupuesto;
	}
	
	
	//setters&getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
public String toString() {
		
		return "Nombre: "+ this.getNombre()+ " Departamento: "+" Presupuesto: "+ presupuesto + " duracion: "+ this.getDuracion()
				+ "\n Cientificos: \n"+ c1 + "\n"+c2+"\n"+c3;
		
	}
	
}
