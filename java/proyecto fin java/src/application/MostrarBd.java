package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MostrarBd {
	
	static Connection conn=null;
	 static Statement stat=null;
	 private static String area;

	 

	public static void main(String[] args) throws Exception {
		
		
		
		try {
			Class.forName("org.sqlite.JDBC");
		       conn = DriverManager.getConnection("jdbc:sqlite:Agenda.db");
		   stat = conn.createStatement();
		      
		        
		        ResultSet rs = stat.executeQuery("select * from people;");
		        
		        while (rs.next()) {
		            System.out.println("apellido = " + rs.getString("apellido"));
		            System.out.println("nombre = " + rs.getString("nombre"));
		            System.out.println("telefono = " + rs.getString("telefono"));
		            System.out.println("email = " + rs.getString("email"));
		            System.out.println("direccion = " + rs.getString("direccion"));
		            
		      
		            area=(String) Principal.controller.getAreaTexto();
				      
				     if (area==null) {
				    	 
				    	 area=area+"\nBase de datos guardada";
				    	 
				    	 Principal.controller.setTextArea(area);
					} else {
						Principal.controller.setTextArea("Base de datos guardada");
					}
		       
		           
		        }
		        
		       
		  
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			stat.close();
			conn.close();
			
			
		}


	}

}
