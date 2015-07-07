package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificarBd {

	 static Connection conn=null;
	 static Statement stat=null;
	 static PreparedStatement prep=null;

	 
	 static String apellidoCambiado=null;
	 static String nombreCambiado=null;
	 static String telefonoCambiado=null;
	 static String emailCambiado=null;
	 static String direccionCambiado=null;
	
	public static void main(String[] args) throws Exception {
		
		try {
			
			Class.forName("org.sqlite.JDBC");
		       conn = DriverManager.getConnection("jdbc:sqlite:Agenda.db");
		   stat = conn.createStatement();
		   prep = conn.prepareStatement("update people set nombre=?, telefono=?, email=?, direccion=? where apellido =? ;");
			
			System.out.println("1 "+apellidoCambiado);
			System.out.println("2 "+nombreCambiado);
			System.out.println("3 "+telefonoCambiado);
			System.out.println("4 "+emailCambiado);
			System.out.println("5 "+direccionCambiado);
			
			
		   
		   
		      prep.setString(1, nombreCambiado);
		      prep.setString(2, telefonoCambiado);
		      prep.setString(3, emailCambiado);
		      prep.setString(4, direccionCambiado);
		      prep.setString(5, apellidoCambiado);
		      
		     
		      
		      
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
