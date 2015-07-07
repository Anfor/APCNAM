package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import java.sql.Statement;

public class GuardarBase {
	

	static Connection conn=null;
	 static Statement stat=null;
	 static PreparedStatement prep=null;
	 static String nombrebd=null;
	 static String apellidobd=null;
	 static String telefonobd=null;
	 static String emailbd=null;
	 static String direccionbd=null;
	// private static String area;
	 

	public static void main(String[] args) throws Exception {


		try {
			Class.forName("org.sqlite.JDBC");
		       conn = DriverManager.getConnection("jdbc:sqlite:Agenda.db");
		   stat = conn.createStatement();
		     
			 prep = conn.prepareStatement("insert into people values (?, ?, ?, ?, ?);");
			 	
			  prep.setString(1, apellidobd);
		      prep.setString(2, nombrebd);
		      prep.setString(3, telefonobd);
		      prep.setString(4, emailbd);
		      prep.setString(5, direccionbd);
		     
		      
		      
		      prep.addBatch();
		      
		      conn.setAutoCommit(false);
		      prep.executeBatch();
		      conn.setAutoCommit(true);
		      
		/*    area=(String) Principal.controller.getAreaTexto();
		      
		     if (area!=null) {
		    	 
		    	 area=area+"\nDonnées stockées";
		    	 
		    	 Principal.controller.setTextArea(area);
			} else {
				Principal.controller.setTextArea("Données stockées");
			}
		        */
		     
		    
		  
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			prep.close();
			stat.close();
			conn.close();
			
			
		}

	}


	

}
