package Aula;

public class Main {

	

	public static void main(String[] args) {
		Aula aula = new Aula();
			aula.num=26;
			aula.planta= 2;

		Alumno a1= new Alumno();
			a1.nombre= "Jose";
			a1.DNI="123456789X";
			a1.edad= 15;
			a1.ciclo=Ciclos.DAM;
			a1.curso=2;
		Alumno a2= new Alumno();
			a2.nombre="Francisco";
			a2.DNI="987654321M";
			a2.edad=13;
			a2.ciclo=Ciclos.ASIR;
			a2.curso=1;
		Alumno a3 = new Alumno();
			a3.nombre="Ramiro";
			a3.DNI="321654987P";
			a3.edad=34;
			a3.ciclo=Ciclos.DAW;
			a3.curso=2;
		
		Ordenador ord1= new Ordenador();
			ord1.num=10;
			ord1.IP="999.999.999";
		Ordenador ord2= new Ordenador();
			ord2.num=18;
			ord2.IP="999.999.998";
		
		aula.a1= a1;
		aula.a2=a2;
		aula.a3= a3;
		
		a1.ord= ord1;
		a2.ord=ord2;
		
		
		System.out.println(aula);
		
	}

}
