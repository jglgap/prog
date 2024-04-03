package Ejercicios_ES_3;

public class ejercrcio_5 {

	public static void main(String[] args) {
		
		System.out.println("Salida");

			float x= (float) (1.0/3.0);
			System.out.printf("1/3= %1$.3f %n", (float)x);
			System.out.printf("1/3= %1$.5f %n", (float)x);
			float y= (float)(1.0/2.0);
			System.out.printf("1/2= %1$09.3f %n", (float)y);
			float z= (float)(1000/3.0);
			System.out.printf("1000/3=%.2e %n", (float)z);
			float a= (float)(3.0/4567.0);
			System.out.printf("3.0/4567.0: %.2e %n", (float)a);
			float inf= (float)(-1.0/0.0);
			System.out.printf("-1.0/0.0= %f %n", (float)inf);
			float nan= (float)(0.0/0.0);
			System.out.printf("0.0/0.0= %f %n", (float)nan);
			float pi= (float) Math.PI, e= (float)Math.E;
			System.out.printf("pi= %1$.3f, e= %1$.4f %n", (float) pi,e);
			System.out.printf("C=2*%1$.5f*1,1, A= 1,1*1,1*%1$.5f", (float)pi);
			
	}

}
