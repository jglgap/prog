package TarefaObrigatoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class App implements PodcastInterface {

	List<Podcast> viewAllPodcast = new ArrayList<>();

	public JdbcRowSet openConnectionInSchool() throws SQLException {
		// conexion en clase
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
			rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd");
			rowSet.setUsername("alumno");
			rowSet.setPassword("abc123..");
			return rowSet;
		}
	}

	public JdbcRowSet openConnectionAtHome() throws SQLException {
		// conexion en casa
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
			rowSet.setUrl("jdbc:mariadb://localhost:3306/RASRpodcast_bd");
			rowSet.setUsername("root");
			rowSet.setPassword("161204");
			return rowSet;
		}

	}

	private int revisarAutores(Podcast p) throws SQLException {
		List<Integer> idAut = new ArrayList<>();
		// RowSet rs = openConnectionInSchool();
		RowSet rs = openConnectionAtHome();

		rs.setCommand("select idAutor from Autor");
		rs.execute();
		while (rs.next()) {
			int x;
			x = rs.getInt("idAutor");
			idAut.add(x);
		}
		if (idAut.contains(p.getAutor().getIdAutor())) {
			return p.getAutor().getIdAutor();
		} else {
			return idAut.get(0);
		}

	}

	@Override
	public boolean insertPodcast(Podcast p, RowSet rs) throws SQLException {
		// if (revisarPodcastExistenetes(p.getIdPodcast()) {
		if (revisarPodCasa(p.getIdPodcast())) {
			System.out.println("ya hay un podcast con ese ID");
			return false;
		} else {
			rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast");
			rs.execute();
			rs.moveToInsertRow();
			rs.updateInt("idPodcast", p.getIdPodcast());
			rs.updateString("titulo", p.getTitulo());
			rs.updateInt("tipo", p.getTipo());
			rs.updateString("calidad", p.getCalidad());
			rs.updateInt("duracion", p.getDuracion());
			rs.updateString("periocidad", p.getPeriodicidad());
			rs.updateString("formato_video", p.getVideoFormat());
			rs.updateInt("autor", revisarAutores(p));
			rs.insertRow();
			return true;
		}

	}

	@Override
	public boolean newGenPodcast(Genero g, RowSet rs) throws SQLException {
		// if (revisarGenerosExistentes(g.getIdGenero())) {
		if (revisarGenCasa(g.getIdGenero())) {
			System.out.println("Ya hay un genero con ese ID");
			return false;
		} else {
			rs.setCommand("select idGeneros, nombre from Generos");
			rs.execute();
			rs.moveToInsertRow();
			rs.updateString("nombre", g.getNombre());
			rs.updateInt("idGeneros", g.getIdGenero());
			rs.insertRow();
			return true;
		}
	}

	@Override
	public boolean updatePodcast(int id, RowSet rs) throws SQLException {
		Podcast p = new Podcast();
		p.setIdPodcast(id);
		rs.setCommand("select idPodcat, idGenero from gen_pod");
		rs.execute();
		while(rs.next()) {
			p.gen.add(rs.getInt("idGenero"));
		}
		Scanner sc = new Scanner(System.in);
		int parar = 0;
		while (parar == 0) {
			System.out.println("Elige lo que deseas hacer\n" + "1-Añadir un nuevo genero\n" + "2-Eliminar genero\n"
					+ "3-Salir");
			try {
				int opc = sc.nextInt();
				switch (opc) {
				case 1: {
					System.out.println("introduzca el id del genero que va a agregar");
					int idGen = sc.nextInt();
					if (revisarGenCasa(idGen) && revisarPodCasa(id)) {
						rs.setCommand("select * from gen_pod");
						rs.execute();
						rs.moveToInsertRow();
						rs.updateInt("idPodcat", id);
						rs.updateInt("idGenero", idGen);
						rs.insertRow();
						p.gen.add(idGen);
						
					} else {
						
					}
					break;
				}
				case 2: {
					System.out.println("introzuca el id del genero que va eliminar");
					int idGen = sc.nextInt();
					if (p.gen.contains(idGen) && (revisarGenCasa(idGen) && revisarPodCasa(id))) {
						// String sURL =
						// "jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd";
						String sURL = "jdbc:mariadb://localhost:3306/RASRpodcast_bd";
						// try (Connection con = DriverManager.getConnection(sURL, "alumno",
						// "abc123..")) {//conexion insti
						try (Connection con = DriverManager.getConnection(sURL, "root", "161204")) {// conexion casa
							try (PreparedStatement stmt = con.prepareStatement("DELETE from gen_pod WHERE idPodcat = ?")) {
								stmt.setInt(1, p.getIdPodcast());
								stmt.executeUpdate();
								p.gen.remove(idGen);
							
							}
						}
					} else {
						System.out.println("No hay un podcast con ese genero");
						
					}
					break;
				}
				case 3:
					parar=1;
					break;
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
				return false;
			}
		}

		return false;
	}

	public List<Podcast> viewAllPodcast(RowSet rs) throws SQLException {
		rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast");
		rs.execute();
		while (rs.next()) {
			Podcast p = new Podcast();
			p.setIdPodcast(rs.getInt(1));
			p.setTitulo(rs.getString("titulo"));
			p.setTipo(rs.getInt("tipo"));
			p.setCalidad(rs.getString("calidad"));
			p.setDuracion(rs.getInt("duracion"));
			p.setPeriodicidad(rs.getString("periocidad"));
			p.setVideoFormat(rs.getString("formato_video"));
			p.setAutor(checkAuthor(rs.getInt("autor")));
			viewAllPodcast.add(p);
		}
		return viewAllPodcast;

	}

	private Autor checkAuthor(int idAutor) throws SQLException {
		// RowSet rowSet = openConnectionInSchool();
		RowSet rowSet = openConnectionAtHome();
		rowSet.setCommand("select idAutor, dni, apellidos, nombre from Autor");
		rowSet.execute();
		while (rowSet.next()) {
			if (rowSet.getInt("idAutor") == idAutor) {
				return new Autor(rowSet.getInt("idAutor"), rowSet.getString("dni"), rowSet.getString("apellidos"),
						rowSet.getString("nombre"));
			}
		}

		return null;

	}

	@Override
	public boolean deletePodcast(Podcast p) throws SQLException {
		// String sURL =
		// "jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd";
		String sURL = "jdbc:mariadb://localhost:3306/RASRpodcast_bd";
//		try (Connection con = DriverManager.getConnection(sURL, "alumno", "abc123..")) {//conexion insti
		try (Connection con = DriverManager.getConnection(sURL, "root", "161204")) {// conexion casa
			try (PreparedStatement stmt = con.prepareStatement("DELETE from Podcast WHERE idPodcast = ?")) {
				stmt.setInt(1, p.getIdPodcast());
				stmt.executeUpdate();
				return true;
			}
		}
	}

	@Override
	public void findByPodcastId(int id) throws SQLException {
		// RowSet rs = openConnectionInSchool();
		RowSet rs = openConnectionAtHome();
		rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast");
		rs.execute();
		rs.absolute(id);
		int parar = 0;
		System.out.println("idPodcast: " + rs.getInt("idPodcast"));
		System.out.println("Titulo: " + rs.getString("titulo"));
		System.out.println("Tipo: " + rs.getInt("tipo"));
		System.out.println("calidad: " + rs.getString("calidad"));
		System.out.println("Duracion: " + rs.getInt("duracion"));
		System.out.println("Periocidad: " + rs.getString("periocidad"));
		System.out.println("Formato de video: " + rs.getString("formato_video"));
		System.out.println("Autor: " + rs.getInt("autor"));
		Scanner sc = new Scanner(System.in);
		while (parar == 0) {
			System.out.println("Elige lo que quieres hacer ahora\n" + "1-Hacia atras\n" + "2-Hacia adelante\n"
					+ "3-Parar operacion");
			try {
				int caso = sc.nextInt();
				switch (caso) {
				case 1:
					if (rs.previous()) {
						System.out.println("idPodcast: " + rs.getInt("idPodcast"));
						System.out.println("Titulo: " + rs.getString("titulo"));
						System.out.println("Tipo: " + rs.getInt("tipo"));
						System.out.println("calidad: " + rs.getString("calidad"));
						System.out.println("Duracion: " + rs.getInt("duracion"));
						System.out.println("Periocidad: " + rs.getString("periocidad"));
						System.out.println("Formato de video: " + rs.getString("formato_video"));
						System.out.println("Autor: " + rs.getInt("autor"));
					} else {
						System.out.println("No hay fila previa");
					}
					break;
				case 2:
					if (rs.next()) {
						System.out.println("idPodcast: " + rs.getInt("idPodcast"));
						System.out.println("Titulo: " + rs.getString("titulo"));
						System.out.println("Tipo: " + rs.getInt("tipo"));
						System.out.println("calidad: " + rs.getString("calidad"));
						System.out.println("Duracion: " + rs.getInt("duracion"));
						System.out.println("Periocidad: " + rs.getString("periocidad"));
						System.out.println("Formato de video: " + rs.getString("formato_video"));
						System.out.println("Autor: " + rs.getInt("autor"));
					} else {
						System.out.println("No hay caso posterior");
					}
					break;
				case 3:
					parar = 1;
					break;
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}

	}

	// metodo con conexion de casa
	public boolean revisarGenCasa(int idGenero) throws SQLException {
		RowSet rowSet= openConnectionAtHome();
			rowSet.setCommand("select idGeneros from Generos where idGeneros = ?");
			rowSet.setInt(1, idGenero);
			rowSet.execute();
			return rowSet.next();
		
	}

	// metodo con conexion de instituto
	public boolean revisarGenerosExistentes(int idGenero) throws SQLException {
		RowSet rowSet= openConnectionAtHome();
			rowSet.setCommand("select idGeneros from Generos where idGeneros = ?");
			rowSet.setInt(1, idGenero);
			rowSet.execute();
			return rowSet.next();
		
	}

	// este metodo es con la conexion en casa
	public boolean revisarPodCasa(int idPodcast) throws SQLException {
		RowSet rowSet= openConnectionAtHome();
			rowSet.setCommand("select idPodcast from Podcast where idPodcast = ?");
			rowSet.setInt(1, idPodcast);
			rowSet.execute();
			return rowSet.next();
		

	}

	// este metodo es con la conexion en clase
	public boolean revisarPodcastExistenetes(int idPodcast) throws SQLException {
		JdbcRowSet rowSet = openConnectionAtHome();
			rowSet.setCommand("select idPodcast from Podcast where idPodcast = ?");
			rowSet.setInt(1, idPodcast);
			rowSet.execute();
			return rowSet.next();
	

	}


}
