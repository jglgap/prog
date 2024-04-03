package bigInteger;
import java.math.BigInteger;
import java.util.Scanner;
public class Bigint {

	public static void main(String[] args) {
		BigInteger numberA;
		BigInteger numberB;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("numero A:");
		numberA= sc.nextBigInteger();
		System.out.println("numero B:");
		numberB= sc.nextBigInteger();
		
		
		 long miLong=9223372036854775807l;
		 BigInteger bigInt=new BigInteger("9999999999999999999999999999999999999999999999999999999999999999999");
		 System.out.println(miLong);
		 System.out.println(bigInt);
		 BigInteger suma=bigInt.add(new BigInteger("1"));
			 System.out.println(suma);
			 
			 numberA = numberA.add(numberB);
			 System.out.println("numberA = " + numberA);
			 numberA = numberA.multiply(numberB);
			 System.out.println("numberA = " + numberA);
			 numberA = numberA.subtract(numberB);
			 System.out.println("numberA = " + numberA);
			 numberA = numberA.divide(numberB);
			 System.out.println("numberA = " + numberA);
			 numberA = numberA.mod(numberB);
			 System.out.println("numberA = " + numberA);
			 numberA = numberA.pow(2);
			 System.out.println("numberA = " + numberA);
			 numberA = numberA.negate();
			 System.out.println("numberA = " + numberA);

	}

}
