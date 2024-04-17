import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class Pool {
public static void main(String[] args) {
	
	try(BasicDataSource dataSource = new BasicDataSource()){
		 dataSource.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa");
	        dataSource.setUsername("alumno");
	        dataSource.setPassword("abc123..");
	        dataSource.setInitialSize(5);
	        dataSource.setMaxTotal(10);
	        Connection conn = dataSource.getConnection();
	        System.out.println("conection done");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
