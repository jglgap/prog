package genericos;

public class EjemploClase<T> {
	T miVal; //se declara una variable tipo parametrizado

	 //tipo T lo podemos usar en métodos sin problemas
	 public EjemploClase(T val) {
	 this.miVal = val;
	 }
	 public T getMiVal() {
	 return this.miVal;
	 }
	 public String toString() {
	 return "ClaseGen<" + this.miVal.getClass().getName() + ">: miVal = " + this.miVal;
	 }
	 
	 public static void main(String[] args) {
		 EjemploClase<Double> obj1 = new EjemploClase<Double>(23.75);
		    double v1 = obj1.getMiVal();
		    System.out.println("obj1 miVal = " + v1);
		    EjemploClase<String> obj2 = new EjemploClase<String>("Hello!");
		    String v2 = obj2.getMiVal();
		    System.out.println("obj2 miVal = " + v2);
		    System.out.println("obj1 = " + obj1);
		    System.out.println("obj2 = " + obj2);
	}
}
