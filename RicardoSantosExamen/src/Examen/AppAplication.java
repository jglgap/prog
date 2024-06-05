package Examen;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;

public class AppAplication {
	public static void main(String[] args) {
		AppExamen app = new AppExamen();
		byte bit = 1;
		Festival fest = new Festival(2, "rbf", 30000, (byte) 1, 155);
		Scanner sc = new Scanner(System.in);
		boolean stop = true;
		try (JdbcRowSet rowSet = app.openConnectionInSchool()) {
			app.rellenarSlots(rowSet);
			app.rellenarGrupos(rowSet);
			while (stop) {
				System.out.println("Elige lo que deseas hacer");
				System.out.println("1-Mostrar todos los grupos\t 2-Mostrar slots\n"+
						"3- actualizar el cache de un grupo\n" + "4- Añadir fesival\n"
						+ "5- Eliminar grupo\n" + "6-salir");
				int caso = sc.nextInt();
				switch (caso) {
					case 1:
						System.out.println(app.grupos);
						System.out.println(app.grupos.size());
						
						break;
					case 2:
						System.out.println("Slots del dia sabado = "+app.slotsSabado);
						System.out.println("Slots del dia viernes = "+app.slotsViernes);
						break;
					case 3:
						System.out.println(app.grupos);
						app.actualizarcache("Los suaves", rowSet, 2);
						break;
					case 4:
						app.insertFestival(fest, rowSet);
						break;
					case 5:
						app.eliminarGrupo();
						break;
					case 6:
						stop = false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InputMismatchException i) {
			i.printStackTrace();
		}
	}
}
