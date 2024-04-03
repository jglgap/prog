package polimorfismo3;

public class Tester {

	public static void main(String[] args) {
		
		//array de tipo Tripulantre (clase abstracta)
		Tripulante[] lista = new Tripulante[7];
		//polimorfismo
		lista[0] = new Capitan(27000);
		lista[1] = new Capitan(6000);
		lista[2] = new JefeDeFlota(2,7);
		lista[3] = new JefeDeFlota(6,3);
		lista[4] = new Marinero(40);
		lista[5] = new Marinero(60);
		lista[6] = new Marinero(12);
		
		//cast
		Capitan c1 = (Capitan) lista[0];
		Capitan c2 = (Capitan) lista[1];
		JefeDeFlota j1=(JefeDeFlota) lista[2];
		JefeDeFlota j2=(JefeDeFlota) lista[3];
		Marinero m1= (Marinero) lista[4];
		Marinero m2= (Marinero) lista[5];
		Marinero m3= (Marinero) lista[6];
		
		//calcular bonos
		c1.calcularBono();
		c2.calcularBono();
		j1.calcularBonoPescado();
		j1.calcularBonoMarisco();
		j2.calcularBonoPescado();
		j2.calcularBonoMarisco();
		m1.calcularBono();
		m2.calcularBono();
		m3.calcularBono();
		 
		
	
		//mostrar datos
		for(int i=0;i<lista.length;i++) {
			lista[i].mostrarDatos();
			System.out.println("------------------------------------------------");
			
		}
	}

}
