package ClaseFile;

import java.io.File;
import java.util.Iterator;

public class Ej3 {
public static void main(String[] args) {
	File dir = new File(args[0]);
	if( !dir.isDirectory()) {
		System.out.println("Non e un diractorio");
	}else {
		for(String s: dir.list()) {
			listaDirectorio(new File(dir.getAbsolutePath()+"/"+s));
		}
			
	}
		
}

private static void listaDirectorio(File f) {
	System.out.println(f.getAbsolutePath());
	if(f.isDirectory()) {
		for(String s: f.list())
			listaDirectorio(new File(f.getAbsolutePath()+"/"+s));
	}
	
}
}
