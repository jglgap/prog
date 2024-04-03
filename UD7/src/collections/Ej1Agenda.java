package collections;

import java.util.ArrayList;
import java.util.List;

public class Ej1Agenda {
public static void main(String[] args) {
	Ej1Personas p1=new Ej1Personas("Melendi", "969854732");
	Ej1Personas p2=new Ej1Personas("Leonel Andres Messi Cuccittinni", "666666666");
	Ej1Personas p3=new Ej1Personas("Benito Antonio Martinez Ocasio", "484758964");
	List<Ej1Personas> contacts = new ArrayList<>();
	System.out.println("Agenda de contactos"+contacts);
	System.out.println("Añadiendo contactos...");
	contacts.add(0,p1);
	contacts.add(1,p2);
	contacts.add(2,p3);
	contacts.add(3,p2);
	
	System.out.println("Agenda de contactos"+contacts);
	contacts.remove(3);
	System.out.println("Eliminando contacto...");
	System.out.println("Agenda de contactos"+contacts);
	contacts.clear();
	System.out.println("Limpiando agenda...");
	System.out.println("Agenda de contactos"+contacts);
	
	
	
	
}

}
