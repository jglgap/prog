package ejercicio1;

public class Persona {
	 private String nombre;
	 private int edad;
	 private float altura;
	
	 //setters & getters
	 
	 public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	//Constructor
	
	Persona (){
		this.nombre="x";
		this.edad=-1;
		this.altura=-1;
	}
	Persona(String nombre, int edad, float altura){
		this.nombre= nombre;
		this.edad=edad;
		this.altura=altura;
	}
}
