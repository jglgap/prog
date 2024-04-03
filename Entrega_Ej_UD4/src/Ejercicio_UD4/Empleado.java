package Ejercicio_UD4;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Empleado {

	String DNI;
	String nombre;
	String apes;
	String lugNac;
	int edad;
	Empresa empresa;
	Scanner sc= new Scanner(System.in);
			
	//Constructor
	


	public Empleado() {
		this.DNI=null;
		this.nombre=null;
		this.apes=null;
		this.lugNac=null;
		this.edad=0;
		
			
	}
	
	public Empleado(String dni, String nombre, String apes, String lugNac, int edad){
		
		this.DNI= dni;
		this.nombre=nombre;
		this.apes=apes;
		this.lugNac=lugNac;
		this.edad= edad;
	}
	
	//Setter&Getters
	
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getDNI(){
		return DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApes() {
		return apes;
	}
	public void setApes(String apes) {
		this.apes = apes;
	}
	public String getLugNac() {
		return lugNac;
	}
	public void setLugNac(String lugNac) {
		this.lugNac = lugNac;
	
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//metodos
public void validaorDNI(String DNI){
		

	while(DNI.length()!=9 || !DNI.matches(".*[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L]")){
		System.out.println("DNI incorrecto, introducir otra vez");
		System.out.println("introduzaca DNI otra vez:");
		DNI=sc.nextLine();
	}
		System.out.println("DNI correcto");
		
	}

	public void validadorEdad(int Edad){
	
		do{
			
			if(edad>16 && edad<=70){
				System.out.println("Edad correcta");
			}else{
				System.out.println("Edad incorrecta, introduzca otra vez");
				edad=sc.nextInt();
			}
		}while(!(edad>16 && edad<=70));

		
	}

	public void nuevoTrabajador(Scanner sc){

		introducirDNi(sc);
		introducirNombre(sc);
		introducirApellidos(sc);
		introducirLugNac(sc);
		introducirEdad(sc);

	}

	public void introducirDNi(Scanner sc){
		System.out.println("Introduzca DNI");
		this.DNI=sc.nextLine();
		this.validaorDNI(this.DNI);	
	}

	public void introducirNombre(Scanner sc){
		System.out.println("Introducir nombre");
		this.nombre=sc.nextLine();
	}
	public void introducirApellidos(Scanner sc){
		System.out.println("Introducir apellidos");
		this.apes=sc.nextLine();
		
	}
	public void introducirLugNac(Scanner sc){
		System.out.println("Introducir Lugar de nacimiento");
		this.lugNac=sc.nextLine();
	}
	public void introducirEdad(Scanner sc){
		System.out.println("Introducir edad");
		this.edad=sc.nextInt();
		this.validadorEdad(this.edad);

	}
	public void limitador(String trabajador){
		Scanner delimit = new Scanner(trabajador);
		delimit.useDelimiter("&");
		this.DNI=delimit.next();
		this.nombre=delimit.next();
		this.apes=delimit.next();
		this.edad=delimit.nextInt();
		this.lugNac=delimit.next();
		delimit.close();
	}
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	// toString
	public String toString(){
		return "DNI: "+ this.getDNI()+ " Nombre: "+ this.getNombre()+ " Apes: "+ this.getApes()+" Lugar de nacimiento: "+ this.getLugNac()+" Edad: "+ this.getEdad()+" Empreasa: "+this.getEmpresa();
	}

}
	


	

