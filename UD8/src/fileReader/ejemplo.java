package fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejemplo {
	 public static void main(String args[])throws IOException {     
	        File doc = new File("L:\\Programacion\\unFicheroTemporal.txt");    
	        FileReader freader = new FileReader(doc);
	        //segunda forma do metodo
	        char [] i = new char[100];
	        freader.read(i);
	        for(char j : i)
	            System.out.print(j);
	        freader.close();
	        System.out.println("\n"+"-".repeat(50));
	        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(doc))){
	            String line = bufferedReader.readLine();
	                while(line != null) {
	                    System.out.println(line);
	                    line = bufferedReader.readLine();
	                }	               
}
	        System.out.println("\n"+"-".repeat(50));
	        File f = new File("L:\\Programacion\\unFicheroTemporal.txt");
	        String cadena;
	        Scanner entrada = null;
	        try {
	            entrada = new Scanner(f);         
	            while (entrada.hasNext()) {                            
	                cadena = entrada.nextLine();  
	                System.out.println(cadena);                                          
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        } finally{
	            entrada.close();                                                                                      
	        }
}
}