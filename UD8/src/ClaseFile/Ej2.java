package ClaseFile;

import java.io.File;

public class Ej2 {
public static void main(String[] args) {
	File dir= new File(args[0]);
	if(!dir.isDirectory()) {
		System.out.println("El directorio no existe");
	}else {
		for(String s: dir.list())
			System.out.println(s);
	}
}
}
