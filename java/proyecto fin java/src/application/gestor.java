package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

public class gestor {
	
	
	private static Connection conn=null;
	private  static Statement stat=null;
	private  static PreparedStatement prep=null;
	private ResultSet rs=null;
	
	public gestor() {
		try {
			Class.forName("org.sqlite.JDBC");
		       conn = DriverManager.getConnection("jdbc:sqlite:test.db");
		   stat = conn.createStatement();
		        stat.executeUpdate("drop table if exists people;");
		        stat.executeUpdate("create table people (nom, prenom);");
		       setPrep(conn.prepareStatement("insert into people values (?, ?);"));
		    rs = stat.executeQuery("select * from people;");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	
	public void addnom(String nom) throws Exception {
		
		prep.setString(1, nom);
		prep.addBatch();
		
	        
	     System.out.println("add "+rs.getString(1));   
	}

	
	public void addprenom(String prenom) throws Exception {
		
		prep.setString(2, prenom);
		prep.addBatch();
		 conn.setAutoCommit(false);
	        prep.executeBatch();
	        conn.setAutoCommit(true);
	        
	        System.out.println("add2 "+rs.getString(2));  
	}


	public String consultar() throws Exception{
		
		
		String texto=null;
		while (rs.next()) {
            System.out.println("nombre = " + rs.getString(1));
            System.out.println("apellido = " + rs.getString(2));
            texto=texto+"nombre = " + rs.getString(1)+"\n"+"apellido = " + rs.getString(2);
            
        }
        
        
		return texto;
	}



	public static PreparedStatement getPrep() {
		return prep;
	}






	public static void setPrep(PreparedStatement prep) {
		gestor.prep = prep;
	}
	
	
	
	

}
