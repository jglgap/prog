package mapas;

import java.util.*;

public class ej1 {
	public static void main(String[] args) {
		Map<String, CoordenadasEj1> countries = new HashMap<>();
		CoordenadasEj1 c1 = new CoordenadasEj1("43.01 N", "7.33 O");
		CoordenadasEj1 c2 = new CoordenadasEj1("41.23 N", "2.11 E");
		CoordenadasEj1 c3 = new CoordenadasEj1("40.24 N", "3.41 O");
		CoordenadasEj1 c4 = new CoordenadasEj1("12.03 S", "77.03 0");
		countries.put("Lugo", c1);
		countries.put("Barcelona", c2);
		countries.put("Madrid", c3);
		countries.put("Lima", c4);

		countries.forEach((code, coordenada) -> System.out.println(code + " => " + coordenada));
		System.out.println("-".repeat(40));
		
		Set<String> setCode = countries.keySet();
		Iterator<String> it = setCode.iterator();
		while (it.hasNext()) {
			String code = it.next();
			CoordenadasEj1 cc = countries.get(code);
			System.out.println(code + " => " + cc);
		}
		
		System.out.println("-".repeat(40));
		CoordenadasEj1 corde = countries.get("Lima");
		System.out.println(corde);
		System.out.println("-".repeat(40));
		countries.remove("Barcelona");
		countries.forEach((code, coordenada) -> System.out.println(code + " => " + coordenada));

	}

}
