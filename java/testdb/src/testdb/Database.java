package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.Scanner;

public class Database {
	
	
	 static Connection conn=null;
	  static Statement stat=null;
	  static PreparedStatement prep=null;
	
	
	
	
	 public static void main(String[] args) throws Exception {
	        Class.forName("org.sqlite.JDBC");
	       conn = DriverManager.getConnection("jdbc:sqlite:test.db");
	   stat = conn.createStatement();
	        stat.executeUpdate("drop table if exists people;");
	        stat.executeUpdate("create table people (name, occupation);");
	       prep = conn.prepareStatement(
	            "insert into people values (?, ?);");
	     
	        
	       gestor();

	        prep.setString(1, "gandhi");
	        prep.setString(2, "politics");
	        prep.addBatch();
	        prep.setString(1, "Turing");
	        prep.setString(2, "computers");
	        prep.addBatch();
	        prep.setString(1, "Wittgenstein");
	        prep.setString(2, "smartypants");
	        prep.addBatch();

	        conn.setAutoCommit(false);
	        prep.executeBatch();
	        conn.setAutoCommit(true);

	        ResultSet rs = stat.executeQuery("select * from people;");
	        while (rs.next()) {
	            System.out.println("name = " + rs.getString("name"));
	            System.out.println("job = " + rs.getString("occupation"));
	        }
	        rs.close();
	        conn.close();
	    }
	 
	 public static void gestor() throws Exception{
		 
		 for (int i = 0; i < 7; i++) {
	    	  System.out.println("entra un nombre ");
		        Scanner sc = new Scanner(System.in);
		        String nomb=sc.nextLine();
		        System.out.println("entra un cargo ");
		        Scanner sca = new Scanner(System.in);
		        String cargo=sc.nextLine();
		        prep.setString(1,nomb);
		        prep.setString(2, cargo);
		        prep.addBatch();
		       
		}  
		 
	 }
}























