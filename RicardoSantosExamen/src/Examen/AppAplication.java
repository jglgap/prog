package Examen;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;

public class AppAplication {
public static void main(String[] args) {
	AppExamen app = new AppExamen();
	byte bit=1;
	Festival fest= new Festival(2,"rbf",30000,bit,155);
	Scanner sc = new Scanner(System.in);
	boolean stop=true;
	try (JdbcRowSet rowSet = app.openConnectionInSchool()) {
	while(stop) {
		System.out.println("Elige lo que deseas hacer");
		System.out.println("1- actualizar el cache de un grupo\n"
				+ "2- Añadir fesival\n" 
				+"3- Eliminar grupo");
		int caso= sc.nextInt();
		switch(caso) {
		case 1:
			app.viewAllGroups(rowSet);
			app.actualizarcache("Los suaves", rowSet, 2);
			break;
		case 2:
			app.insertFestival(fest, rowSet);
		case 3:
			app.eliminarGrupo();
		case 4:
			stop=false;
		}
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
