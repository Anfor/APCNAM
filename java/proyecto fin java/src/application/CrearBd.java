package application;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class CrearBd {
	
	 static Connection conn=null;
	  static Statement stat=null;
	

	public static void main(String[] args) throws Exception {
		
		
		try {
			 Class.forName("org.sqlite.JDBC");
		       conn = DriverManager.getConnection("jdbc:sqlite:Agenda.db");
		   stat = conn.createStatement();
		        stat.executeUpdate("drop table if exists people;");
		        stat.executeUpdate("create table people (apellido, nombre,telefono,email,direccion);");
			
		} catch (Exception e) {
			e.printStackTrace();
  		}finally{
  		
  			stat.close();
  			conn.close();
	
	      			
	      			
	      		}
	}

}
