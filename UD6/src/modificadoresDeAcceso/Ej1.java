package modificadoresDeAcceso;

public class Ej1 {
	int numerador;
	 int denominador;
	 Ej1(int numerador, int denominador){
	    this.numerador=numerador;
	    this.denominador=denominador;
	 }
	 static Ej1 multiplicar(Ej1 r1, Ej1 r2){
	    Ej1 resultado= new Ej1(1,1);
	    resultado.numerador=r1.numerador*r2.numerador;
	    resultado.denominador=r1.denominador*r2.denominador;
	    return resultado;
	 }
	 public static void main(String[] args) {
		  Ej1 r1=new Ej1(3,4);
		    Ej1 r2=new Ej1(1,2);
		  Ej1  r3=new Ej1(1,1);
		    r3=Ej1.multiplicar(r1, r2);
		    System.out.println("MUTIPLICACIÓN DE NÚMEROS RACIONALES");
		    System.out.println("r1 vale: "+r1.numerador+"/"+r1.denominador);
		    System.out.println("r2 vale: "+r2.numerador+"/"+r2.denominador);
		    System.out.println("r3 vale: "+r3.numerador+"/"+r3.denominador);
	}
}
