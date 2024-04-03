package sobrecarga;

public class Bicicleta {
	 int velocidade = 0;
	 int marcha = 1;
	
	void cambiarMarcha(int novoValor) {
	 marcha = novoValor;
	 }
	 void acelerar(int incremento) {
	 velocidade = velocidade + incremento;
	 }
	 void frear(int decremento) {
	 velocidade = velocidade - decremento;
	 }
	 void imprimirEstado() {
	 System.out.println("Velocidade: "+velocidade+" Marcha: "+marcha);
	 }
}
