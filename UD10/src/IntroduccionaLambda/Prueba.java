package IntroduccionaLambda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;       

public class Prueba {
	public static void main(String[] args) {
/*		List<Integer> numbers = Arrays.asList(1,3,4,6);
		numbers.forEach(number -> System.out.println(number)); 
		
		Supplier<Integer> randomNumbersSupp=() -> new Random().nextInt(10);
		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		LocalDateTime time = s.get();
		System.out.println(time);
		
		Predicate<String> checker = a -> a.startsWith("M"); 
		System.out.println(checker.test("Miguel"));*/ 
		
		
		
		Persona p1 = new Persona("pedro", 20, "perez");
		Persona p2 = new Persona("juan", 25, "perez");
		Persona p3 = new Persona("ana", 30, "perez");
		List < Persona > lista = new ArrayList < Persona > ();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);

		lista
		    .stream()
		    .map(a -> a.edad )
		    .forEach(a -> System.out.println(a));;
		    
		    Libro l = new Libro("El señor de los anillos", "fantasia", 1100);
		    Libro l2 = new Libro("El Juego de Ender", "ciencia ficcion", 500);
		    Libro l3 = new Libro("La fundacion", "ciencia ficcion", 500);
		    Libro l4 = new Libro("Los pilares de la tierra", "historica", 1200);
		    List <Libro> lista1 = Arrays.asList(l, l2, l3, l4);
		    lista1.stream()
		        .filter(libro -> libro.getPaginas() > 1000)
		        .map(libro -> libro.getTitulo())
		        .forEach(System.out::println);

	
		    lista.stream()
		    .sorted(Comparator.comparing( p -> p.getApellidos()))
		    .forEach(System.out::println);
		    
		
	}
	}
	

