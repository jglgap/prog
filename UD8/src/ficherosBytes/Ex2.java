package ficherosBytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class Ex2 {
public double[][] creadorMatriz(int x,int y) {
	double [][] temp = new double[x][y];
	for(int i=0;i<temp.length;i++) {
		for(int j=0;j<temp[i].length;j++) {
			Random r= new Random();
		 temp[i][j]= r.nextDouble();
		}
	}
	return temp;
}
public void imprimirArray(double [][]array) {

	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array[i].length;j++) {
			System.out.println(array[i][j]);
		}
	}
}
public static void main(String[] args) {
	Ex2 test= new Ex2();
	test.imprimirArray(test.creadorMatriz(3, 2));
	FileInputStream fis=null;
	FileOutputStream fos= null;
	 String path;
	try {
		File file=new File(path);
		String newpath= path;
		
	}
	
}
}
