package OO;

public class Ej1 {
 int x;
 int y;
 static int numeroDePunto=0;
 public Ej1(int x, int y) {
	this.x=x;
	this.y=y;
	numeroDePunto++;
}
 public static void main(String[] args) {
	new Ej1(0,0);
	new Ej1(0,0);
	System.out.println("Numero de puntos creados"+Ej1.numeroDePunto);
}
}
