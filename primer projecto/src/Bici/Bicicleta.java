package Bici;

public class Bicicleta {
	private int v=0;
	private int marcha=1;
		void cambiarMarcha(int novovalor) {
		marcha= novovalor ;
	}
		void acelerar(int incremento) {
			 v= v+incremento;
			
	}
		void frear(int decremento) {
			v= v-decremento;
		}
		void imprimirEstado(){
			System.out.println("velocidad"+v+"marcha"+marcha);
		}
		public int getV() {
			return v;
		}
		public void setV(int v) {
			this.v = v;
		}
		public int getMarcha() {
			return marcha;
		}
		public void setMarcha(int marcha) {
			this.marcha = marcha;
		}
		
		 public Bicicleta() {
			v=0;
			marcha=1;
			
		}
		public Bicicleta (double v, int m){
			v= v;
			marcha= m;
		}
		public Bicicleta(int m){
		v= 0;
		marcha=m;
		}
		 public Bicicleta (double v){
		v=v;
		marcha=0;
		}		
}

