package mapas;

import java.util.Collections;
import java.util.TreeMap;

public class Ej3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> alumno = new TreeMap<>();
		alumno.put("Torres", 7);
		alumno.put("Rubicco", 10);
		alumno.put("Fernandez", 5);
		alumno.put("Alves", 4);
		alumno.put("Vilas", 8);
		alumno.put("Boquete", 2);

		alumno.forEach((nombre, nota) -> System.out.println(nombre + " => " + nota));
		System.out.println("-".repeat(40));
		System.out.println(alumno.firstKey());
		System.out.println("-".repeat(40));
		System.out.println(alumno.lastKey());
		System.out.println("-".repeat(40));
		System.out.println(alumno.headMap("Vilas"));
		System.out.println("-".repeat(40));
		TreeMap<String, Integer> alumno2 = new TreeMap<>(Collections.reverseOrder());
		alumno2.put("Torres", 7);
		alumno2.put("Rubicco", 10);
		alumno2.put("Fernandez", 5);
		alumno2.put("Alves", 4);
		alumno2.put("Vilas", 8);
		alumno2.put("Boquete", 2);
		alumno2.forEach((nombre, nota) -> System.out.println(nombre + " => " + nota));
		
	}
}
