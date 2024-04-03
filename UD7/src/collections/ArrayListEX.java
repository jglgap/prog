package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListEX {
	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");
		listStrings.add("five");
		listStrings.add(0,"zero");
		
		System.out.println("listStrigs: "+listStrings);
		List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);
	
		System.out.println("listNumbes: "+listNumbers);
		listStrings.set(1,"one");//modificar el valor de la poscion 1
		listStrings.remove(5); //eliminar el elemento en la psocion 5
		System.out.println("listStrigs: "+listStrings);
		
		Libro libro1 = new Libro("0345404475", "Do Androids Dream of Electric Sheep?", "Philip K.Dick");
		Libro libro2 = new Libro("0451457998", "2001: A Space Odissey", "Arthur C. Clarke");
		Libro libro3 = new Libro("0451457998", "2001: A Space Odissey", "Arthur C. Clarke");
		List<Libro> biblio = new ArrayList<>();
		biblio.add(libro1);
		biblio.add(libro2);
		biblio.add(libro3);
		Iterator<Libro> it = biblio.iterator(); // Iterator que apuntará al inicio de la colección
		while(it.hasNext()) { // mientras haya "siguiente" elemento...
		    Libro libro = it.next(); // leemos el "siguiente" elemento
		    System.out.println("Título: " + libro);
		}
		
	}
}
