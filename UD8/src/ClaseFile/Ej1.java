package ClaseFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ej1 {
	
	public static void main(String[] args) {
		
	//io
File file= new File( "L:\\Programacion\\unFicheroTemporal.txt");
boolean fileIsFile = file.isFile();
boolean fileWritable= file.canWrite();

// nio
Path path = Paths.get( "L:\\Programacion\\unFicheroTemporal.txt");
boolean pathIsFile = Files.isRegularFile(path);
boolean pathWritable= Files.isWritable(path);


System.out.println("io: "+fileIsFile+ " "+fileWritable);
System.out.println("nio: "+ pathIsFile+ " "+ pathWritable);
	}
}
