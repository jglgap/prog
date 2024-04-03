package ejercicio_o.o;

public class Cientifico {
	//Atributos
	private String nombre;
	private int edad;
	private String direccion;
	Cientifico c1;
	Cientifico c2;
	Cientifico c3;
	
	//setters&getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int e) {
		this.edad = e;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String d) {
		this.direccion = d;
	
}
	public String toString() {
		return "Nombre: " + this.getNombre()+ " Edad: "+ this.getEdad()+ " Direccion: "+ this.getDireccion();
		
	}

}