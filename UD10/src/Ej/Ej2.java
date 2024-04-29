package Ej;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import IntroduccionaLambda.Persona;

public class Ej2 {
	public static void main(String[] args) {
		Persona p1= new Persona("Carlitos",50,"Alcaraz");
		Persona p2= new Persona("Miguel",23,"Caamaño");
		Persona p3= new Persona("Merio",33,"Martin");
		
		List<Persona> people=Arrays.asList(p1,p2,p3);
		Optional <Persona> pers=people.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(pers.get());
	}

	
	
}
