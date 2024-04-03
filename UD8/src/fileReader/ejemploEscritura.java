package fileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejemploEscritura {
	public static void main(String[] args) {
		
	
	try(FileWriter fw=new FileWriter("L:\\Programacion\\fichero1.txt"); FileReader fr=new FileReader("L:\\Programacion\\fichero1.txt")){  
        //Escribimos no ficheiro un String, un caracter 97 (a)
        // e array de caracteres
        fw.write("Esto es una prueb");
        fw.write(97);
        char[] buf = {'1','2','1'}; 
        fw.write(buf);
        //Gardamos os cambios do ficheiro, método que forza o guardado
        //para que se poida ler antes de pechar
        fw.flush();
        //Leemos o ficheiro e o amosamos por pantalla
        int valor=fr.read();
        while(valor!=-1){
            System.out.print((char)valor);
            valor=fr.read();
        }
    }catch(IOException e){
        System.out.println("Error E/S: "+e); 
}}}

