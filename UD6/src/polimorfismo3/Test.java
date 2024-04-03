package polimorfismo3;

public class Test {

	public static void main(String[] args) {
		Figura[] lista = new Figura[9];
		lista[0] = new Triangulo("negro", 2.5, 3);
		lista[1] = new Triangulo("blanco", 2.5, 3);
		lista[2] = new Triangulo("marron", 2.5, 3);
		lista[3] = new Rectangulo("blanco", 3, 1.3);
		lista[4] = new Rectangulo("marron", 4, 2);
		lista[5] = new Rectangulo("negro", 3, 5.5);
		lista[6] = new Circulo("verde", 2);
		lista[7] = new Circulo("azul", 3);
		lista[8] = new Circulo("blanco", 4);
		
		for(int i=0; i<lista.length;i++) {
		
			if(lista[i].area()>4.0) {
				lista[i].color="negro";
			}
			System.out.println(lista[i]+" area="+lista[i].area());
		}
		
		
	}

}
