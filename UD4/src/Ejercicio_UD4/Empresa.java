package Ejercicio_UD4;

public class Empresa {
	String CIF;
	String nombre;
	String direccion;
	int emplNum;
	
	//Constructor
	
	public Empresa() {
		this.CIF=null;
		this.nombre=null;
		this.direccion=null;
		this.emplNum=0;
	}
	
	public  Empresa(String CIF, String nombre, String direccion, int emplNum) {
		
		this.CIF=CIF;
		this.nombre=nombre;
		this.direccion=direccion;
		this.emplNum=emplNum;
	}
	//Setters&Getters
	
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEmplNum() {
		return emplNum;
	}
	public void setEmplNum(int emplNum) {
		this.emplNum = emplNum;
	}
	
	//toString
	
	public String toString() {
		return "CIF: "+ this.getCIF()+ " Nombre de la empresa: "+ this.getNombre()+" Direccion: "+this.getDireccion()+ " Numero de empleados: "+ this.emplNum ;
		
	}
	
}
