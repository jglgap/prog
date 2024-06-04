package TarefaObrigatoria;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;

public class AppAplication {

	public static void main(String[] args) {
		App a = new App();
		Podcast p = new Podcast(4, "", 0, "", 4, "", "", new Autor(99, "", "", ""));//Estan vacios los valores del constructror para añadir los que quieras
		Genero g = new Genero(7, "");//Estan vacios los valores del constructror para añadir los que quieras
		Scanner sc = new Scanner(System.in);
		boolean stop=true;
		try (JdbcRowSet rowSet = a.openConnection()) {
		while(stop) {
			System.out.println("Elige lo que deseas hacer");
			System.out.println("1-Insertar Podcast\n"
					+ "2-Insertar nuevo genero\n"
					+ "3-Delete Podcast\n"
					+ "4-Mirar todos los podcast\n"
					+ "5-Buscar por id del podcast\n"
					+ "6-Actualizar podcast\n"
					+ "7-Salir");
			int caso= sc.nextInt();
			switch(caso) {
			case 1:
				a.insertPodcast(p, rowSet);
				break;
			case 2:
				a.newGenPodcast(g, rowSet);
				break;
			case 3:
				a.deletePodcast(p);
				break;
			case 4:
				a.viewAllPodcast(rowSet);
				System.out.println(a.viewAllPodcast);
			case 5: 
				a.findByPodcastId(1);
				break;
			case 6:
				a.updatePodcast(4, rowSet);
				break;
			case 7: 
				stop=false;
				break;
			}
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	
		
	
	

	}

}
