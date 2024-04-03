package Tareas;
 import java.util.Scanner;
public class Empresa {
	String CIF;
	String nombre;
	String direccion;
	int emplNum;
	
	
	 Scanner entrada= new Scanner(System.in);
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
	public void setCIF(String CIF) {
		this.CIF = CIF;
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
	//metodos
	public void nuevaEmpresa(Scanner entrada){
		intNom(entrada);
		intCif(entrada);
		intDireccion(entrada);
		intNumEmpl(entrada);
		entrada.nextLine();
	
	}

	public void intCif(Scanner entrada){		
	System.out.println("Introcir Cif");
	this.CIF=entrada.nextLine();
	}

	public void intNom(Scanner entrada){
		System.out.println("Introducir nombre de la empresa");
		this.nombre=entrada.nextLine();
	}
	
	public void intDireccion(Scanner entrada){
		System.out.println("Introducir direccion de la empresa");
		this.direccion=entrada.nextLine();
	}

	public void intNumEmpl(Scanner entrada){
		System.out.println("Introducir numero de empleados");
		this.emplNum=entrada.nextInt();
		
	}
	public void limitador(String trabajo){
		Scanner delimit= new Scanner(trabajo);
		delimit.useDelimiter("&");
		this.CIF=delimit.next();
		this.nombre=delimit.next();
		this.direccion=delimit.next();
		this.emplNum=delimit.nextInt();
		delimit.close();

	}
	
	//toString
	
	@Override
	public String toString() {
		return "CIF:" + this.CIF + " nombre: " + this.nombre + " direccion: " + this.direccion + " emplNum: " + this.emplNum  ;
	}
	
}
