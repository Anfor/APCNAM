package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class EliminarContacto {
	
	  static Connection conn=null;
	  static Statement stat=null;
	  static PreparedStatement prep=null;
	  static String apellidoEliminado=null;
	

	public static void main(String[] args) throws Exception {
		 
		try {
			Class.forName("org.sqlite.JDBC");
		       conn = DriverManager.getConnection("jdbc:sqlite:Agenda.db");
		   stat = conn.createStatement();
		   prep = conn.prepareStatement("delete from people where  apellido =? ;");
		   
		   prep.setString(1, apellidoEliminado);
		   
		   prep.executeUpdate();
		      conn.setAutoCommit(true);
		     prep.clearParameters();

		} catch (Exception e) {
			e.printStackTrace();
			
			
		}finally{
			prep.close();
			stat.close();
			conn.close();
			
		}
		
	   
	   
	   
	   
	}

}
