package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SimpleExceptionHandling {
	  public static void main(String[] args) {
	        FileInputStream fileInputStream = null;
	        try {
	            fileInputStream = new FileInputStream("L:\\LinguaxesDeMarcas\\unFicheroTemporal.txt");
	        } catch (FileNotFoundException e) {
	            System.out.println("Aconteceu a excepción  :: " + e.getMessage());
	            System.out.println("Necesitamos pechar FileStream!");
	        } finally {
	            System.out.println("Afortunadamente pecharase neste bloque");
	            try {
	                if (fileInputStream != null) {
	                    fileInputStream.close();
	                }
	            } catch (IOException e) {
	            }
	        }
	    }
}
